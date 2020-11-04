package com.mvc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mvc.mapper.CustomerMapper;
import com.mvc.vo.Customer;

//dao 객체(crud)
//@Component("cdao")
@Repository
public class CustomerDaoImpl implements CustomerDao {
	@Autowired
	CustomerMapper mapper;
	
	@Override
	public List<Customer> selectAll() {		
		return mapper.selectAll();
	}

	@Override
	public Customer selectOne(String num) {
		return mapper.selectOne(num);
	}

	@Override
	public int insert(Customer c) {
		int x = mapper.insert(c);
		return x;
	}

	@Override
	public int delete(String num) {
		int x = mapper.delete(num);
		return x;
	}

	@Override
	public List<Customer> findByAddress(String address) {		
		return mapper.findByAddress(address);
	}

	@Override
	public int update(Customer c) {
		int x =  mapper.update(c);
		System.out.println("dao x="+ x);
		return x;
		
	}


}







