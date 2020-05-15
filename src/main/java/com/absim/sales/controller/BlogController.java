package com.absim.sales.controller;

import java.util.List;

import com.absim.sales.dto.BlogPostDto;
import com.absim.sales.service.BlogService;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
@RequestMapping("/blog")
public class BlogController {

    private final BlogService blogService;

    @GetMapping("/posts")
    public ResponseEntity<List<BlogPostDto>> getAllNonMainPosts(){
        return ResponseEntity.ok(blogService.getBlogPosts());
    }

    @GetMapping("/main-post")
    public ResponseEntity<BlogPostDto> getMainBlogPost(){
        return ResponseEntity.ok(blogService.getAboutPageBlogPost());
    }

}
