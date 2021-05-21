package com.muzg.cgis.service;

import com.muzg.cgis.bean.Build;
import com.muzg.cgis.bean.Error;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface BoundaryService {
    List<Build> selectAllBuild();

    List<Build> selectPointByName(String buildName);

    List<Build> selectBuildById(String typeId);

    String selectIdByName(String typeName);

    int insertError(int id, String errorDescript, String build_id, String createDate);

    List<Error> selectAllError();
}
