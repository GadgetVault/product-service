package com.ecommerce.products.service.impl;

import com.ecommerce.products.dto.ProductDto;
import com.ecommerce.products.entity.Product;
import com.ecommerce.products.enums.ProductCategory;
import com.ecommerce.products.exception.ProductNotFoundException;
import com.ecommerce.products.repository.ProductRepository;
import com.ecommerce.products.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public List<Product> getAllProductsByCategory(ProductCategory category) {
        return productRepository.findAllByCategory(category);
    }

    @Override
    public void addProduct(Product product) {
        productRepository.save(product);
    }

    @Override
    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }

    @Override
    public void updateProduct(Product product) {
        Product persisted = productRepository.
                findById(product.getId()).
                orElseThrow(
                        () -> new ProductNotFoundException("Unable to find product with id: "+product.getId() +" !" ));

        Product updated = Product.builder()
                .id(persisted.getId())
                .name(product.getName())
                .description(product.getDescription())
                .price(product.getPrice())
                .category(product.getCategory())
                .imageUrl(product.getImageUrl())
                .build();

        productRepository.save(updated);
    }
}
