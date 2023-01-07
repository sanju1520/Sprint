package com.abc.Traineeapp.Service;

import java.util.List;

import com.abc.Traineeapp.entity.Customer;

public interface CustomerService {
	
	Customer saveCustomer(Customer customer);
	
	Customer getCustomerById(int customerId);
	
	List<Customer> getAllCustomers();
	
	Customer doLogin(String username,String password);


}
