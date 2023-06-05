package com.shwetank.CustomerDataManagement.dto;

import java.io.Serializable;

import com.shwetank.CustomerDataManagement.entity.Customer;

import lombok.Data;
@Data
public class CustomerDto implements Serializable{

	private Integer id;
   
	private String name;
	
	private String email;
	
	public CustomerDto(Customer customer) {
		this.id=customer.getId();
		this.name=customer.getName();
		this.email=customer.getEmail();
	}

}
