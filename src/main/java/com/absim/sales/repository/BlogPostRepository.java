package com.absim.sales.repository;

import java.util.List;

import com.absim.sales.entity.BlogPost;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogPostRepository extends JpaRepository<BlogPost, Long> {

    List<BlogPost> findAllByIsMainPage(Boolean isMainPage);
}
