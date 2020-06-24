package com.spring.SeuDallanhaApi.dtos;

import com.spring.SeuDallanhaApi.models.Product;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Getter
public class ProductDTO {
    @NotEmpty(message = "{description.not.empty}")
    private String description;

    @NotNull(message = "{price.not.empty}")
    private BigDecimal price;

    private long categoryId;

    public Product convertToObject() {
        return new Product(description, price, null);
    }

    public String getDescription() {
        return description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public long getCategoryId() {
        return categoryId;
    }
}
