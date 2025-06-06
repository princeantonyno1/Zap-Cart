package com.digitalstore.imperium.library.dto;

import com.digitalstore.imperium.library.model.Category;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductDto {
    private Long id;
    private String name;
    private String description;
    private double costPrice;
    private double salePrice;
    private String fileLink;
    private Category category;
    private String image;
    private boolean activated;
    private boolean deleted;
}
