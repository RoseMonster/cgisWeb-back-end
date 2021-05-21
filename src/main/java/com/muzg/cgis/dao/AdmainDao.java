package com.muzg.cgis.dao;

import com.muzg.cgis.bean.Admain;
import org.springframework.stereotype.Component;

import java.util.List;

@Component(value = "AdmainMapper")
public interface AdmainDao {
    int pointInsert(int id,String build_name,String descript,String build_id,double lng,double lat,String type_id);

    int pointDelete(int id);

    int pointUpdate(int id,String build_name,String descript,String build_id,double lng,double lat,String type_id);

    List<Admain> selectAllAdmain();

    int admainInsert(int id,String admain_id,String username,String password);

    int admainDelete(int id);

    int admainUpdate(int id,String admain_id,String username,String password);

    int errorDelete(int id);
}
