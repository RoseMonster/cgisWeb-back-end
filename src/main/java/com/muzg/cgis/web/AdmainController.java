package com.muzg.cgis.web;

import com.muzg.cgis.bean.Admain;
import com.muzg.cgis.bean.Build;
import com.muzg.cgis.service.AdmainService;
import com.muzg.cgis.util.CommonResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

@Api(description = "管理员相关")
@RestController
@RequestMapping(value = "/admain")
public class AdmainController {

    @Autowired
    AdmainService admainService;

    @ApiOperation("添加点标注")
    @RequestMapping(value = "/pointInsert",method = RequestMethod.POST)
    @ResponseBody
    public CommonResult pointInsert(@RequestBody Build build, HttpSession session){
        int result = admainService.pointInsert(build.getId(),build.getBuildName(),build.getDescript(),build.getBuildId(),build.getLng(),build.getLat(),build.getTypeId());
        session.setAttribute("result",result);
        return CommonResult.success();
    }

    @ApiOperation("删除点标注")
    @RequestMapping(value = "/pointDelete/{id}",method = RequestMethod.POST)
    @ResponseBody
    public CommonResult pointDelete(@PathVariable int id, HttpSession session){
        int result = admainService.pointDelete(id);
        session.setAttribute("result",result);
        return CommonResult.success();
    }

    @ApiOperation("修改点标注")
    @RequestMapping(value = "/pointUpdate",method = RequestMethod.POST)
    @ResponseBody
    public CommonResult pointUpdate(@RequestBody Build build, HttpSession session){
        int result = admainService.pointUpdate(build.getId(),build.getBuildName(),build.getDescript(),build.getBuildId(),build.getLng(),build.getLat(),build.getTypeId());
        System.out.println(build.toString());
        session.setAttribute("result",result);
        return CommonResult.success();
    }

    @ApiOperation("添加管理员")
    @RequestMapping(value = "/admainInsert",method = RequestMethod.POST)
    @ResponseBody
    public CommonResult pointInsert(@RequestBody Admain admain, HttpSession session){
        int result = admainService.admainInsert(admain.getId(),admain.getAdmainId(),admain.getUsername(),admain.getPassword());
        session.setAttribute("result",result);
        return CommonResult.success();
    }

    @ApiOperation("删除管理员")
    @RequestMapping(value = "/admainDelete/{id}",method = RequestMethod.POST)
    @ResponseBody
    public CommonResult admainDelete(@PathVariable int id, HttpSession session){
        int result = admainService.admainDelete(id);
        session.setAttribute("result",result);
        return CommonResult.success();
    }

    @ApiOperation("修改管理员")
    @RequestMapping(value = "/admainUpdate",method = RequestMethod.POST)
    @ResponseBody
    public CommonResult pointUpdate(@RequestBody Admain admain, HttpSession session){
        int result = admainService.admainUpdate(admain.getId(),admain.getAdmainId(),admain.getUsername(),admain.getPassword());
        session.setAttribute("result",result);
        return CommonResult.success();
    }

    @ApiOperation("获取全部管理员信息")
    @RequestMapping(value = "/listAllAdmain",method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<Admain>> listAll(HttpSession session){
        List<Admain> admainList = admainService.selectAllAdmain();
        session.setAttribute("admainList",admainList);
        return CommonResult.success(admainList);
    }

    @ApiOperation("删除纠错信息")
    @RequestMapping(value = "/errorDelete/{id}",method = RequestMethod.POST)
    @ResponseBody
    public CommonResult errorDelete(@PathVariable int id, HttpSession session){
        int result = admainService.errorDelete(id);
        session.setAttribute("result",result);
        return CommonResult.success();
    }
}
