package com.example.billing.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.billing.entity.Billing;
import com.example.billing.repo.BillingRepository;

@Service
public class BillingService {
  
  @Autowired
  private BillingRepository billingRepository;
  
  public List<Billing> getAllBillings() {
    return billingRepository.findAll();
  }
  
  public Billing getBillingById(Long id) {
    return billingRepository.findById(id).orElseThrow();
  }
  
  public Billing createBilling(Billing billing) {
    return billingRepository.save(billing);
  }
  
  public Billing updateBilling(Long id, Billing billing) {
    Billing existingBilling = getBillingById(id);
    existingBilling.setCustomer(billing.getCustomer());
    existingBilling.setProduct(billing.getProduct());
    existingBilling.setTotalAmount(billing.getTotalAmount());
    return billingRepository.save(existingBilling);
  }
  
  public void deleteBilling(Long id) {
    billingRepository.deleteById(id);
  }
}