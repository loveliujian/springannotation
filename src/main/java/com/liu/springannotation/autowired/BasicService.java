package com.liu.springannotation.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class BasicService {
	
	@Autowired
	@Qualifier(value="mySqlDaoImpl")
	private BasicDao basicDao;
	
	public void deal(Object obj){
		basicDao.save(obj);
	}

}
