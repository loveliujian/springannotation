package com.liu.springannotation.constructor;

/**
 * 注解也实现不了构造方法注入
 */
public class Person {
	
	private int age;
	
	private String username;
	
	public Person(){
		
	}
	
	public Person(int age, String username) {
		super();
		this.age = age;
		this.username = username;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}
