package com.example.billing.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.billing.entity.Billing;

public interface BillingRepository extends JpaRepository<Billing, Long> {
	  
}