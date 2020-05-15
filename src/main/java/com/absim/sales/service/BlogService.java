package com.absim.sales.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.absim.sales.converter.BlogPostConverter;
import com.absim.sales.dto.BlogPostDto;
import com.absim.sales.entity.BlogPost;
import com.absim.sales.repository.BlogPostRepository;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BlogService {

    public final BlogPostConverter blogPostConverter;

    public final BlogPostRepository blogPostRepository;

    public BlogPostDto getAboutPageBlogPost() {

        List<BlogPost> allByIsMainPage = blogPostRepository.findAllByIsMainPage(Boolean.TRUE);
        Optional<BlogPostDto> aboutPagePost = allByIsMainPage.stream()
                .map(blogPostConverter::toDto)
                .findFirst();

        return aboutPagePost.orElseThrow(IllegalStateException::new);
    }

    public List<BlogPostDto> getBlogPosts() {
        List<BlogPost> allNonMainPosts = blogPostRepository.findAllByIsMainPage(Boolean.FALSE);
        return allNonMainPosts.stream()
                .map(blogPostConverter::toDto)
                .collect(Collectors.toList());
    }
}
