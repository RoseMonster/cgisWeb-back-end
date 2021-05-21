package com.muzg.cgis.service;

import com.muzg.cgis.bean.Admain;
import com.muzg.cgis.dao.AdmainDao;

import java.util.List;

public interface AdmainService {
    int pointInsert(int id,String build_name,String descript,String build_id,double lng,double lat,String type_id);

    int pointDelete(int id);

    int pointUpdate(int id,String build_name,String descript,String build_id,double lng,double lat,String type_id);

    List<Admain> selectAllAdmain();

    int admainInsert(int id,String admain_id,String username,String password);

    int admainDelete(int id);

    int admainUpdate(int id,String admain_id,String username,String password);

    int errorDelete(int id);
}
