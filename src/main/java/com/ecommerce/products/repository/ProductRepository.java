package com.ecommerce.products.repository;

import com.ecommerce.products.entity.Product;
import com.ecommerce.products.enums.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    List<Product> findAllByCategory(ProductCategory category);
}
