package com.muzg.cgis.service.impl;

import com.muzg.cgis.bean.Point;
import com.muzg.cgis.dao.NavDao;
import com.muzg.cgis.service.NavService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class NavServiceImpl implements NavService {

    @Autowired
    NavDao navDao;

    public List<Point> selectAllPoint(){
        return navDao.selectAllPoint();
    }

    public int pointCount(){
        return navDao.pointCount();
    }

    public List<Point> navPoint(double longitude1, double latitude1, double longitude2, double latitude2){

        return null;
    }
}
