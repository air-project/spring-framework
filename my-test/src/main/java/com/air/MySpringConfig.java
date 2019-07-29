package com.air;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Place Function on Here:
 *
 * @author yh 2019-7-29 22:25
 * @since: Jdk 1.8
 */
@Configuration // 配置类 相当于<beans>标签
public class MySpringConfig {

	//给容器中注册一个bean ，id为方法名
	@Bean //相当于bean标签
	public Person person(){
		return new Person("air",18);
	}

}
