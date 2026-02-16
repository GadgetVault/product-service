package com.ecommerce.products.controller;

import com.ecommerce.products.dto.ProductDto;
import com.ecommerce.products.entity.Product;
import com.ecommerce.products.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/products/admin")
public class ProductAdminController {

    private final ProductService productService;

    @PostMapping("/add")
    public ResponseEntity<Void> addProduct(@RequestBody Product productDto){
         productService.addProduct(productDto);
         return new ResponseEntity<>(HttpStatus.OK);
    }
}
