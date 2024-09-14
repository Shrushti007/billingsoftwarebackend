package com.example.billing.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.billing.entity.Product;
import com.example.billing.repo.ProductRepository;

@Service
public class ProductService {
  
  @Autowired
  private ProductRepository productRepository;
  
  public List<Product> getAllProducts() {
    return productRepository.findAll();
  }
  
  public Product getProductById(Long id) {
    return productRepository.findById(id).orElseThrow();
  }
  
  public Product createProduct(Product product) {
    return productRepository.save(product);
  }
  
  public Product updateProduct(Long id, Product product) {
    Product existingProduct = getProductById(id);
    existingProduct.setName(product.getName());
    existingProduct.setPrice(product.getPrice());
    existingProduct.setQuantity(product.getQuantity());
    existingProduct.setBrand(product.getBrand());
    existingProduct.setSupplier(product.getSupplier());
    existingProduct.setCategory(product.getCategory());
    return productRepository.save(existingProduct);
  }
  
  public void deleteProduct(Long id) {
    productRepository.deleteById(id);
  }
}