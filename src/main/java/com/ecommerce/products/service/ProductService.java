package com.ecommerce.products.service;


import com.ecommerce.products.dto.ProductDto;
import com.ecommerce.products.entity.Product;
import com.ecommerce.products.enums.ProductCategory;

import java.util.List;

public interface ProductService {
    public List<Product> getAllProducts();
    public List<Product> getAllProductsByCategory(ProductCategory category);
    public void addProduct(Product product);
    public void deleteProduct(Long id);
    public void updateProduct(Product product);
}
