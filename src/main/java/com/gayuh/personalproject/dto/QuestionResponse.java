package com.gayuh.personalproject.dto;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import java.time.LocalDateTime;
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public record QuestionResponse(
        Long id,
        String questionText,
        Integer time,
        Integer score,
        LocalDateTime createdAt,
        LocalDateTime updatedAt,
        String mediaLink
) {
}
