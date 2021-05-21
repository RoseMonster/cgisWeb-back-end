package com.muzg.cgis.web;

import com.muzg.cgis.bean.Build;
import com.muzg.cgis.bean.Point;
import com.muzg.cgis.bean.Type;
import com.muzg.cgis.service.BoundaryService;
import com.muzg.cgis.util.CommonResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Api(description = "路径分析")
@RestController
@RequestMapping(value = "/nav")
public class NavController {

    @Autowired
    private BoundaryService boundaryService;

    @ApiOperation("行人导航")
    @RequestMapping(value = "/navWalk",method = RequestMethod.POST)
    @ResponseBody
    public CommonResult<List<Point>> navWalk(@RequestBody List<Build> buildList,HttpSession session){

        return CommonResult.success(null);
    }

    @ApiOperation("导航")
    @RequestMapping(value = "/getPoint",method = RequestMethod.POST)
    @ResponseBody
    public CommonResult<List<Build>> getPoint(@RequestBody Map<String,String> datas){
        List<Build> buildResult = new ArrayList<>();
        List<Build> builds;
        for (String value : datas.values()){
            System.out.println(value);
            builds = boundaryService.selectPointByName(value);
            for (Build b : builds){
                buildResult.add(b);
            }
        }
        return CommonResult.success(buildResult);
    }

}
