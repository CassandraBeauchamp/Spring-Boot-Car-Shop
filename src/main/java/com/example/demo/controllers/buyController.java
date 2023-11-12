package com.example.demo.controllers;

import com.example.demo.domain.Product;
import com.example.demo.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.stereotype.Controller;
import org.thymeleaf.extras.java8time.dialect.Java8TimeDialect;
import com.example.demo.service.*;
import org.springframework.web.bind.annotation.*;

@Controller
public class buyController extends Product{

    @Autowired
    private Java8TimeDialect java;

    @Autowired
    private ApplicationContext context;

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    public void ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping("/buyProduct")
    public String buyProduct(@RequestParam("productID") Long theId) {

        ProductService repo = context.getBean(ProductServiceImpl.class);

        java.util.Optional<Product> product = productRepository.findById((theId));

        if(product.get().getInv() > 0)
        {
            product.get().setInv(product.get().getInv() -1);
            productRepository.save(product.get());
            return "success";

        }
        else
            return "failure";
    }
}
