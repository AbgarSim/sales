package com.absim.sales.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class BlogPostDto {

    private Long id;

    private String title;

    private String body;

    private Boolean isMainPage;
}
