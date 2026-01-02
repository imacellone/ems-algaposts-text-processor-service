package com.algaworks.algaposts.text.processor.domain.model;

import lombok.Data;

import java.util.UUID;

@Data
public class PostData {
    private UUID postId;
    private String postBody;
}
