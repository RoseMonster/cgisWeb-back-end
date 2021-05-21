package com.muzg.cgis.dao;

import com.muzg.cgis.bean.Build;
import com.muzg.cgis.bean.Error;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

@Component(value = "boundaryMapper")
public interface BoundaryDao {
    List<Build> selectAllBuild();

    List<Build> selectPointByName(@Param("buildName")String buildName);

    List<Build> selectBuildById(@Param("typeId")String typeId);

    String selectIdByName(@Param("typeName")String typeName);

    int insertError(int id, String errorDescript, String build_id, String createDate);

    List<Error> selectAllError();
}
