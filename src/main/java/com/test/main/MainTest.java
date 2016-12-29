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
	private static Film film;
	
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
		film = new Film();
		System.out.println("请输入电影名称");
		String name = input.nextLine();
		film.setTitle(name);
		System.out.println("请输入电影描述");
		String desc = input.nextLine();
		film.setDescription(desc);
		add();
	}
	public static void add(){
		System.out.println("请输入语言ID 数字范围1-6");
		byte id = input.nextByte();
		if(id<7&&id>0){
			film.setLanguageId(id);
			userService.insertSelective(film);
			aac.stop();
		}else {
			System.out.println("输入的语言ID有误，请重新输入");
			add();
		}
	}
	

}
