package com.test.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.test.mapper.FilmMapper;
import com.test.pojo.Film;
import com.test.services.FilmService;

@Component
public class FilmServiceImpl implements FilmService{

	@Resource
	private FilmMapper filmMapper;
	public int insertSelective(Film record) {
		// TODO Auto-generated method stub
		return filmMapper.insertSelective(record);
	}

	
	
}
