package com.liu.springannotation.obj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BaseService {
	
	@Autowired
	private BaseDao baseDao;
	
	public void invoke(){
		baseDao.invoke();
		System.out.println("BaseService类中的invoke方法被调用");
	}

}
