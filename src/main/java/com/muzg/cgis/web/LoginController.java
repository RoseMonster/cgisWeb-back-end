package com.muzg.cgis.web;

import com.muzg.cgis.bean.Admain;
import com.muzg.cgis.service.LoginService;
import com.muzg.cgis.util.CommonResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@Api(description = "管理员登录")
@RestController
@RequestMapping(value = "/login")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @ApiOperation("登录验证")
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    @ResponseBody
    public CommonResult<Map<String,Integer>> login(@RequestBody Admain admain){
        System.out.println(admain.toString());
        String msg = "";
        int status = 2;
        switch (admain.getAdmainType()){
            case "01":
                String username = loginService.superFindUsername(admain.getUsername());
                if (null!=username){
                    String password = loginService.superFindPassword(admain.getUsername(),admain.getPassword());
                    if(null!=password){
                        msg = "登录成功";
                        status = 1;
                    }else {
                        msg = "密码错误";
                        status = 0;
                    }
                }else {
                    msg = "用户名不存在";
                    status = 0;
                }
                break;
            case "02":
                String user = loginService.findUsername(admain.getUsername());
                if (null!=user){
                    String password = loginService.findPassword(admain.getUsername(),admain.getPassword());
                    if(null!=password){
                        msg = "登陆成功";
                        status = 1;
                    }else {
                        msg = "密码错误";
                        status = 0;
                    }
                }else {
                    msg = "用户名不存在";
                    status = 0;
                }
                break;
        }
        Map resultMap = new HashMap();
        resultMap.put("msg",msg);
        resultMap.put("status",status);
        return CommonResult.success(resultMap);
    }

}
