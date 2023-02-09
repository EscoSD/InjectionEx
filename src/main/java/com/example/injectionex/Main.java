package com.example.injectionex;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		BeanFactory beanFactory = new ClassPathXmlApplicationContext("configuration.xml");
		Maka maka = (Maka) beanFactory.getBean("maka");
	}
}
