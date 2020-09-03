package com.example.crm.service;

import com.example.crm.model.ProductEntity;
import com.example.crm.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;

    @Override
    public ProductEntity getOneById(Long id) {
        return null;
    }

    @Override
    public List<ProductEntity> getAll() {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public void save(ProductEntity entity) {

    }
}
