package com.rest.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mvc.service.CustomerService;
import com.mvc.vo.Customer;

//@RestController: @Controller + @ResponseBody(java return -> json)
@RestController
public class CustomerRestController {
	
	@Autowired
	CustomerService service;//CustomerService 타입이 동일한 객체 (CustomerServiceImpl)주입
	
	//Get:http://localhost/customers,  모든데이터
	@GetMapping(value="/customers")
	public List<Customer> selectAll(){		
		return service.selectAll();
	}
	
	//Get:http://localhost/customers/1 ,  한개 데이터
	@GetMapping(value="/customers/{num}")
	public Customer selectOne(@PathVariable String num){		
		return service.selectOne(num);
	}
	
	
	//Post:http://localhost/customers/1 ,  데이터 추가
	//클라이언트가 보내는 데이터(json)->java
	//@RequestBody: 요청이 들어올때 json -> java 로 변환시켜줌
	@PostMapping(value="/customers")
	public Map insert(@RequestBody Customer c){		
		service.insert(c);
		
		Map<String, String> map = new HashMap();
		map.put("result", "추가성공");
		return map;
	}
	
	
	//put:http://localhost/customers ,  데이터 수정
	//클라이언트가 보내는 데이터(json)->java
	//@RequestBody: 요청이 들어올때 json -> java 로 변환시켜줌
	@PutMapping(value="/customers")
	public Map update(@RequestBody Customer c){		
		service.update(c);
		
		Map<String, String> map = new HashMap();
		map.put("result", "수정성공");
		return map;
	}
	
	
	//delete:http://localhost/customers/1 ,  한개 데이터
	@DeleteMapping(value="/customers/{num}")
	public Map delete(@PathVariable String num){		
		service.delete(num);
		
		Map<String, String> map = new HashMap();
		map.put("result", "삭제성공");
		return map;
	}
	
	
	

}
