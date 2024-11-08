package com.example.base.dto;

import jakarta.validation.constraints.NotNull;

public class LikeDTO {
    @NotNull(message = "ID must not be null")
    private Long postId;

    @NotNull(message = "ID must not be null")
    private Long userId;
}
