package com.air;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Place Function on Here:
 *
 * @author yh 2019-7-26 21:15
 * @since: Jdk 1.8
 */
public class MyApplication {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		Hello hello = (Hello)ac.getBean("hello");
		hello.sayHello();
	}
}
