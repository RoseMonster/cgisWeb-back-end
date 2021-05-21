package com.muzg.cgis.service;

import com.muzg.cgis.bean.Point;

import java.util.List;

public interface NavService {
    List<Point> selectAllPoint();

    int pointCount();
}
