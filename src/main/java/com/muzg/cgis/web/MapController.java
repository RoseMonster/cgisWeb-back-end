package com.muzg.cgis.web;

import com.muzg.cgis.bean.Build;
import com.muzg.cgis.bean.Error;
import com.muzg.cgis.bean.Type;
import com.muzg.cgis.service.BoundaryService;
import com.muzg.cgis.util.CommonResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Api(description = "地图建筑")
@RestController
@RequestMapping(value = "/map")
public class MapController {

    @Autowired
    private BoundaryService boundaryService;

    @ApiOperation("获取全部建筑信息")
    @RequestMapping(value = "/listAll",method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<Build>> listAll(HttpSession session){
        List<Build> buildList = boundaryService.selectAllBuild();
        session.setAttribute("buildList",buildList);
        for (Build build : buildList) {
            System.out.println(build.toString());
        }
        return CommonResult.success(buildList);
    }

    @ApiOperation("根据建筑类型获取建筑信息")
    @RequestMapping(value = "/listByType",method = RequestMethod.POST)
    @ResponseBody
    public CommonResult<List<Build>> listByType(@RequestBody Type type){
        System.out.println(type.toString());
        String typeId = boundaryService.selectIdByName(type.getTypeName());
        List<Build> buildList = boundaryService.selectBuildById(typeId);
        for (Build build : buildList) {
            System.out.println(build.toString()+" listByType");
        }
        return CommonResult.success(buildList);
    }

    @ApiOperation("查询建筑信息")
    @RequestMapping(value = "/search",method = RequestMethod.POST)
    @ResponseBody
    public CommonResult<List<Build>> search(@RequestBody Build build){
        List<Build> buildList = boundaryService.selectPointByName(build.getBuildName());
        return CommonResult.success(buildList);
    }

    @ApiOperation("插入地图纠错信息")
    @RequestMapping(value = "/error",method = RequestMethod.POST)
    @ResponseBody
    public CommonResult error(@RequestBody Error error) throws Exception{
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String createDate = df.format(System.currentTimeMillis());
        boundaryService.insertError(error.getId(),error.getErrorDescript(),error.getBuildId(),createDate);
        return CommonResult.success();
    }

    @ApiOperation("获取全部纠错信息")
    @RequestMapping(value = "/listAllError",method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<Error>> listAllError(){
        List<Error> errorList = boundaryService.selectAllError();
        return CommonResult.success(errorList);
    }
}
