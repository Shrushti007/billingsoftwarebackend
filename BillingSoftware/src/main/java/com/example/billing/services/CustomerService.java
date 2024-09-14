package com.example.billing.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.billing.entity.Customer;
import com.example.billing.repo.CustomerRepository;

@Service
public class CustomerService {
  
  @Autowired
  private CustomerRepository customerRepository;
  
  public List<Customer> getAllCustomers() {
    return customerRepository.findAll();
  }
  
  public Customer getCustomerById(Long id) {
    return customerRepository.findById(id).orElseThrow();
  }
  
  public Customer createCustomer(Customer customer) {
    return customerRepository.save(customer);
  }
  
  public Customer updateCustomer(Long id, Customer customer) {
    Customer existingCustomer = getCustomerById(id);
    existingCustomer.setName(customer.getName());
    existingCustomer.setGender(customer.getGender());
    existingCustomer.setContact(customer.getContact());
    existingCustomer.setEmail(customer.getEmail());
    return customerRepository.save(existingCustomer);
  }
  
  public void deleteCustomer(Long id) {
    customerRepository.deleteById(id);
  }
}