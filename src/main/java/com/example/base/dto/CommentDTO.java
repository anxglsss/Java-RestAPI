package com.example.base.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class CommentDTO {
    @NotBlank(message = "Comment must not be blank")
    private String content;

    @NotNull(message = "ID must not be null")
    private Long postId;

    @NotNull(message = "ID must not be null")
    private Long userId;
}
