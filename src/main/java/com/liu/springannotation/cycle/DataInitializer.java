package com.liu.springannotation.cycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class DataInitializer {
	
	@PostConstruct
	public void initMethod() throws Exception {
		System.out.println("initMethod 被执行");
	}

	@PreDestroy
	public void destroyMethod() throws Exception {
		System.out.println("destroyMethod 被执行");
	}
}
