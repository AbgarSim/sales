package com.absim.sales.converter;

import com.absim.sales.dto.BlogPostDto;
import com.absim.sales.entity.BlogPost;

import org.springframework.stereotype.Component;

@Component
public class BlogPostConverter {

    public BlogPost toEntity(final BlogPostDto dto) {
        return BlogPost.builder()
                .id(dto.getId())
                .title(dto.getTitle())
                .body(dto.getBody())
                .isMainPage(dto.getIsMainPage())
                .build();
    }

    public BlogPostDto toDto(final BlogPost entity) {
        return BlogPostDto.builder()
                .id(entity.getId())
                .title(entity.getTitle())
                .body(entity.getBody())
                .isMainPage(entity.getIsMainPage())
                .build();
    }
}
