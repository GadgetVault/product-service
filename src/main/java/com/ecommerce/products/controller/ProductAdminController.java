package com.ecommerce.products.controller;

import com.ecommerce.products.entity.Product;
import com.ecommerce.products.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/update")
    public ResponseEntity<Void> updateProduct(@RequestBody Product product){
        productService.updateProduct(product);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteProduct(@PathVariable Long id){
        productService.deleteProduct(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
