package com.liu.springannotation;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.liu.springannotation.autowired.BasicService;
import com.liu.springannotation.autowired.BasicService2;
import com.liu.springannotation.lazy.Lazy;
import com.liu.springannotation.lazy.Lazy2;
import com.liu.springannotation.obj.BaseService;
import com.liu.springannotation.properties.JdbcUtils2;
import com.liu.springannotation.scope.Cat;
import com.liu.springannotation.scope.Dog;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class SpringTest {
	
	@Test
	public void test1(){
		BaseService baseService = ApplicationContextHolder.getBean(BaseService.class);
		baseService.invoke();
	}
	
	@Test
	public void test2(){
		JdbcUtils2 jdbcUtils2 = ApplicationContextHolder.getBean(JdbcUtils2.class);
		System.out.println(jdbcUtils2.getDriverClassName());
	}
	
	@Test
	public void test3(){
		System.out.println("Spring容器被创建");
		Lazy lazy = ApplicationContextHolder.getBean(Lazy.class);
		System.out.println(lazy);
	}
	
	@Test
	public void test4(){
		System.out.println("Spring容器被创建");
		Lazy2 lazy2 = ApplicationContextHolder.getBean(Lazy2.class);
		System.out.println(lazy2);
	}
	
	@Test
	public void test5(){
		Dog dog = ApplicationContextHolder.getBean(Dog.class);
		Dog dog2 = ApplicationContextHolder.getBean(Dog.class);
		System.out.println(dog);
		System.out.println(dog2);
		
		Cat cat = ApplicationContextHolder.getBean(Cat.class);
		Cat cat2 = ApplicationContextHolder.getBean(Cat.class);
		System.out.println(cat);
		System.out.println(cat2);
	}
	
	@Test
	public void test6(){
		BasicService service = ApplicationContextHolder.getBean(BasicService.class);
		service.deal(new Object());
	}
	
	@Test
	public void test7(){
		BasicService2 service2 = ApplicationContextHolder.getBean(BasicService2.class);
		service2.deal(new Object());
	}

}
