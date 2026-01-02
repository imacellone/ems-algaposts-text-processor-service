package com.algaworks.algaposts.text.processor.domain.model;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.util.UUID;

@Data
@Builder
public class PostAnalysisResult {
    private final UUID postId;
    private final Long wordCount;
    private final BigDecimal calculatedValue;
}
