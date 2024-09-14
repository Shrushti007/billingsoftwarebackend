package com.example.billing.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.billing.entity.Billing;
import com.example.billing.services.BillingService;

@RestController
@RequestMapping("/api/billings")
@CrossOrigin("*")
public class BillingController {
  
  @Autowired
  private BillingService billingService;
  
  @GetMapping
  public List<Billing> getAllBillings() {
    return billingService.getAllBillings();
  }
  
  @GetMapping("/{id}")
  public Billing getBillingById(@PathVariable Long id) {
    return billingService.getBillingById(id);
  }
  
  @PostMapping
  public Billing createBilling(@RequestBody Billing billing) {
    return billingService.createBilling(billing);
  }
  
  @PutMapping("/{id}")
  public Billing updateBilling(@PathVariable Long id, @RequestBody Billing billing) {
    return billingService.updateBilling(id, billing);
  }
  
  @DeleteMapping("/{id}")
  public void deleteBilling(@PathVariable Long id) {
    billingService.deleteBilling(id);
  }
}