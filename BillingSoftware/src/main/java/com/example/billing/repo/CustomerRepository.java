package com.example.billing.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.billing.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
	  
}