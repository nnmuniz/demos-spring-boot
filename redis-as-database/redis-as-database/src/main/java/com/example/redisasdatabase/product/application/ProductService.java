package com.example.redisasdatabase.product.application;

import java.util.List;

import com.example.redisasdatabase.product.domain.Product;
import com.example.redisasdatabase.product.domain.ProductRepository;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

public interface ProductService {

	List<Product> findAll();

}

@Service
@RequiredArgsConstructor
class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    @Override
    public List<Product> findAll() {
        return new Product().findAll(productRepository);
    }

}
