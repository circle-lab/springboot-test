package com.example.demo.api.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.PersonBean;

/**
 * @author 
 *
 */
@RestController
public class restDemoController {

	/**
	 * REST DEMOメソッド
	 * @param personBean
	 * @return
	 * http://192.168.x.x:8080/api/restdemo
	 */
	/* json sample
	{
	  "name":"test",
	  "age":1
	}
	*/
	@RequestMapping(value = "rest/demo")

	public PersonBean demo(@RequestBody PersonBean personBean) {
		personBean.name = "でもたろう（固定値）";

		return personBean;
	}

}
