package com.liu.springannotation.lazy;

import org.springframework.stereotype.Component;

@Component
public class Lazy {
	
	public Lazy(){
		System.out.println("Lazy 构造方法被执行");
	}

}
