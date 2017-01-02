package com.liu.springannotation.obj;

import org.springframework.stereotype.Repository;

@Repository
public class BaseDao {
	
	public void invoke(){
		System.out.println("BaseDao类中的invoke方法被调用");
	}
	
}
