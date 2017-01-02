package com.liu.springannotation.lazy;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy(true)
public class Lazy2 {
	
	public Lazy2(){
		System.out.println("Lazy2 构造方法被执行");
	}

}
