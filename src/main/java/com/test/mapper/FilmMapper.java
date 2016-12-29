package com.test.mapper;

import com.test.pojo.Film;

public interface FilmMapper {

    int insertSelective(Film record);
}