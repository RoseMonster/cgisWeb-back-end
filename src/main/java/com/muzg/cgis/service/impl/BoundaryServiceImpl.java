package com.muzg.cgis.service.impl;

import com.muzg.cgis.bean.Build;
import com.muzg.cgis.bean.Error;
import com.muzg.cgis.dao.BoundaryDao;
import com.muzg.cgis.service.BoundaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class BoundaryServiceImpl implements BoundaryService {

    @Autowired
    private BoundaryDao boundaryDao;

    public List<Build> selectAllBuild(){
        return boundaryDao.selectAllBuild();
    }

    public List<Build> selectPointByName(String buildName){
        return boundaryDao.selectPointByName(buildName);
    }

    public List<Build> selectBuildById(String typeId){
        return boundaryDao.selectBuildById(typeId);
    }

    public String selectIdByName(String typeName){
        return boundaryDao.selectIdByName(typeName);
    }

    public int insertError(int id, String errorDescript, String build_id, String createDate){
        return boundaryDao.insertError(id,errorDescript,build_id,createDate);
    }

    public List<Error> selectAllError(){
        return boundaryDao.selectAllError();
    }
}
