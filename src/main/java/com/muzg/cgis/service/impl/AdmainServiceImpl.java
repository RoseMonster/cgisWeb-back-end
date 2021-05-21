package com.muzg.cgis.service.impl;

import com.muzg.cgis.bean.Admain;
import com.muzg.cgis.dao.AdmainDao;
import com.muzg.cgis.service.AdmainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdmainServiceImpl implements AdmainService {

    @Autowired
    AdmainDao admainDao;

    public int pointInsert(int id,String build_name,String descript,String build_id,double lng,double lat,String type_id){
        return admainDao.pointInsert(id,build_name,descript,build_id,lng,lat,type_id);
    }

    public int pointDelete(int id){
        return admainDao.pointDelete(id);
    }

    public int pointUpdate(int id,String build_name,String descript,String build_id,double lng,double lat,String type_id){
        return admainDao.pointUpdate(id,build_name,descript,build_id,lng,lat,type_id);
    }

    public List<Admain> selectAllAdmain(){
        return admainDao.selectAllAdmain();
    }

    public int admainInsert(int id,String admain_id,String username,String password){
        return admainDao.admainInsert(id,admain_id,username,password);
    }

    public int admainDelete(int id){
        return admainDao.admainDelete(id);
    };

    public int admainUpdate(int id,String admain_id,String username,String password){
        return admainDao.admainUpdate(id,admain_id,username,password);
    };

    public int errorDelete(int id){
        return admainDao.errorDelete(id);
    };
}
