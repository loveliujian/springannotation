package com.liu.springannotation.autowired;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

@Service
public class BasicService2 {
	
	@Resource(name="mySqlDaoImpl")
	private BasicDao basicDao;
	
	public void deal(Object obj){
		basicDao.save(obj);
	}

}
