package com.example.base.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class PostDTO {
    @NotBlank(message = "Content type must not be blank")
    private String title;

    @NotNull(message = "ID must not be null")
    private Long userId;
}
