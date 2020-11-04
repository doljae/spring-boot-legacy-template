package com.rest.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController: @Controller+@ResponseBody
//@ResponseBody:응답 나갈 때 java->json으로 변환시켜줌
@RestController
public class RestControllerTest {
	
	@GetMapping(value="/hello")
	public String hello() {
		return "this is my first rest test!-get";//뷰이름 아님. 데이터
	}
	
	@PostMapping(value="/hello")
	public String hello2() {
		return "this is my first rest test!-post";//뷰이름 아님. 데이터
	}
	
	@DeleteMapping(value="/hello")
	public String hello3() {
		return "this is my first rest test!-delete";//뷰이름 아님. 데이터
	}

}
