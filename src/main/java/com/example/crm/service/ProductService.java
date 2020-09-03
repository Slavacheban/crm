package com.example.crm.service;

import com.example.crm.model.ProductEntity;

import java.util.List;

public interface ProductService {
    ProductEntity getOneById(Long id);
    List<ProductEntity> getAll();
    void deleteById(Long id);
    void save(ProductEntity entity);
}
