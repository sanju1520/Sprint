package com.abc.Traineeapp.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abc.Traineeapp.entity.Customer;
import com.abc.Traineeapp.exception.CustomerNotFoundException;
import com.abc.Traineeapp.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerRepository customerRepository;

	public Customer saveCustomer(Customer customer) {
		Customer newCustomer = customerRepository.save(customer);
		return newCustomer;
	}

	@Override
	public Customer getCustomerById(int customerId) {
		Optional<Customer> optionalCustomer = customerRepository.findById(customerId);
		if(optionalCustomer.isEmpty()) {
			throw new CustomerNotFoundException("Customer not existing with id: "+customerId);
		}
		Customer customer = optionalCustomer.get();
		return customer;
		
	}

	@Override
	public List<Customer> getAllCustomers() {
		return customerRepository.findAll();
	}

	@Override
	public Customer doLogin(String username, String password) {
Optional<Customer> optionalCustomer = customerRepository.login(username, password);
		
		if(optionalCustomer.isEmpty()) {
			//throw some excepiton
		
	}
		return optionalCustomer.get();
	}
}
