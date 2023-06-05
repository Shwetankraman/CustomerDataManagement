package com.shwetank.CustomerDataManagement.service;

import java.time.LocalDateTime;
import java.util.InputMismatchException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.shwetank.CustomerDataManagement.dto.CustomerDto;
import com.shwetank.CustomerDataManagement.dto.ResponseStructure;
import com.shwetank.CustomerDataManagement.entity.Customer;
import com.shwetank.CustomerDataManagement.repository.CustomerDAO;
import com.shwetank.CustomerDataManagement.repository.CustomerRepository;

@Service
public class CustomerService {
	@Autowired
	private CustomerDAO dao;
	
	public ResponseStructure<Customer> saveCustomer(CustomerDto dto) {
		Customer cus=new Customer(dto);
		Customer customer=dao.saveCustomer(cus);
//		Customer cus= dao.saveCustomer(customer);
		ResponseStructure<Customer> rs=new ResponseStructure<>();
		rs.setData(customer);
    	rs.setStatusCode(HttpStatus.OK.value());
    	rs.setTimeStamp(LocalDateTime.now());
		rs.setMessage("Customer data save suucessfully");
		return rs;
		
	}
	
	
	public Customer updateCustomer(Customer customer) {
		return dao.saveCustomer(customer);
	}
	
	public ResponseStructure<List<Customer>> getAllCustomersData(){
		List<Customer>list = dao.getAllCustomerData();
		ResponseStructure<List<Customer>>rs=new ResponseStructure<>();
		if(list.size()!=0) {
			rs.setStatusCode(HttpStatus.FOUND.value());
			rs.setData(list);
			rs.setTimeStamp(LocalDateTime.now());
			rs.setMessage("Customer entry found in database");
		}else {
			rs.setStatusCode(HttpStatus.NOT_FOUND.value());
			rs.setData(null);
			rs.setTimeStamp(LocalDateTime.now());
			rs.setMessage("No Customer entry found in database");
			
		}
		return rs;
		}
	
	
	
	public Customer getDataById(int id) {
		return dao.getCustomerDataById(id);
	}
	
	public Customer deleteCustomerDataById(int id) {
		return dao.deleteCustomerDataById(id);
	}
	
	public List<Customer> getCustomerByName(String name) {
		throw new InputMismatchException();
		//return dao.getCustomerByName(name);
	}
	
	public List<Customer> validateCustomer(String name, String email) {
		return dao.validateCustomer(name, email); 
	}
	

	
}
