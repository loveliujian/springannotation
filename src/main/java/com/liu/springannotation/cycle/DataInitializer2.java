package com.liu.springannotation.cycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer2 implements InitializingBean, DisposableBean {

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet 被执行");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("destroy 被执行");
	}

}
