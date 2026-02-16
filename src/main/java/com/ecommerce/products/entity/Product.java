package com.ecommerce.products.entity;


import com.ecommerce.products.enums.ProductCategory;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.IdGeneratorType;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private Double price;
    @Enumerated(EnumType.STRING)
    private ProductCategory category;
    private String imageUrl;
}

