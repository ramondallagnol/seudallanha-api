package com.spring.SeuDallanhaApi.dtos;

import com.spring.SeuDallanhaApi.models.Category;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

import javax.validation.constraints.NotEmpty;

@Getter
public class CategoryDTO {

    @NotEmpty(message = "{description.not.empty}")
    private String description;

    public Category convertToObject() {
        return new Category(description);
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
