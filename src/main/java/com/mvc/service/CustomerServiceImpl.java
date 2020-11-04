package com.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mvc.dao.CustomerDao;
import com.mvc.vo.Customer;


//@Component("cus")
@Service
public class CustomerServiceImpl implements CustomerService{
	@Autowired 
	CustomerDao dao;
	
	@Override
	public List<Customer> selectAll() {		
		return dao.selectAll();
	}

	@Override
	public Customer selectOne(String num) {		
		return dao.selectOne(num);
	}

	@Override
	public int insert(Customer c) {
		return dao.insert(c);
		
	}

	@Override
	public int delete(String num) {
		int x =  dao.delete(num);
		System.out.println("x="+ x);
		return x;
		
	}

	@Override
	public List<Customer> findByAddress(String address) {		
		return dao.findByAddress(address);
	}

	@Override
	public int update(Customer c) {
		int x = dao.update(c);
		System.out.println("service x:"+x);
		return x;
		
	}

	
	@Override
	public void insert2(Customer c) throws Exception {
		
			dao.insert(c);
			dao.insert(c);
		
		
	}

}







