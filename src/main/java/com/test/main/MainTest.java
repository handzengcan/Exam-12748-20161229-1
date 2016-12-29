package com.test.main;

import java.util.Scanner;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.pojo.Film;
import com.test.services.FilmService;


public class MainTest {
	private static AbstractApplicationContext aac;
	private static Scanner input=new Scanner(System.in);
	private static FilmService userService;
	
	public static void init(){
		aac = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		aac.start();
		userService = (FilmService)aac.getBean("filmServiceImpl");
    }
	
	public static void main(String[] args) {
	init();
	insert();
	}
	
	public static void insert(){
		Film film = new Film();
		System.out.println("请输入电影名称");
		String name = input.nextLine();
		film.setTitle(name);
		System.out.println("请输入电影描述");
		String desc = input.nextLine();
		film.setDescription(desc);
		System.out.println("请输入语言ID 数字范围1-6");
		byte id = input.nextByte();
		film.setLanguageId(id);
		userService.insertSelective(film);
		aac.stop();
		System.out.println("insert success----");
	}
	

}
