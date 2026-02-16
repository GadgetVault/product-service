package com.ecommerce.products.dto;

import com.ecommerce.products.enums.ProductCategory;
import jakarta.annotation.Nullable;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.*;


@Data
@Builder
public class ProductDto {
    @Nullable
    private Long id;
    @NonNull
    private String name;
    private String description;
    private Double price;
    @Enumerated(EnumType.STRING)
    private ProductCategory category;
    private String imageUrl;
}
