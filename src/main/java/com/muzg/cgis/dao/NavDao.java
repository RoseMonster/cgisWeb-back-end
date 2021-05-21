package com.muzg.cgis.dao;

import com.muzg.cgis.bean.Point;
import org.springframework.stereotype.Component;

import java.util.List;

@Component(value = "navMapper")
public interface NavDao {
    List<Point> selectAllPoint();

    int pointCount();
}
