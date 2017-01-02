package com.liu.springannotation.map;

import java.util.Map;

/**
 * 注解不能实现map注入
 */
public class Panda {
	
	private Map<String,Object> map;

	public Map<String, Object> getMap() {
		return map;
	}

	public void setMap(Map<String, Object> map) {
		this.map = map;
	}
	
}
