package com.ecommerce.products.controller;

import com.ecommerce.products.entity.Product;
import com.ecommerce.products.enums.ProductCategory;
import com.ecommerce.products.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("products/user")
public class ProductUserController {

    private final ProductService productService;

    @GetMapping("/all")
    public ResponseEntity<List<Product>> getAll(){
        return new ResponseEntity<>(productService.getAllProducts(), HttpStatus.OK);
    }

    @GetMapping("/all-by-category/{category}")
    public ResponseEntity<List<Product>> getAllByCategory(@PathVariable ProductCategory category){
        return new ResponseEntity<>(productService.getAllProductsByCategory(category), HttpStatus.OK);
    }

}
