package com.absim.sales;

import com.absim.sales.entity.BlogPost;
import com.absim.sales.entity.GeneralInfo;
import com.absim.sales.repository.BlogPostRepository;
import com.absim.sales.repository.GeneralInfoRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataSetup {

    private final static String COMPANY_NAME = "Company Inc.";
    private final static String MOTTO_TITLE = "We sell stuff!";
    private final static String MOTTO_BODY = "Don't be scared of selling things, because proffic is deffinetly something we like! Imagine your favourite superhero, now imagine he has a lot of money! Well you can almost be like him if you sell stuff!";

    private final static String BLOG_TITLE = "Blog-post title example!";
    private final static String BLOG_BODY = "I will be the leader of a company that ends up being worth billions of dollars, because I got the answers. I understand culture. I am the nucleus. I think that’s a responsibility that I have, to push possibilities, to show people, this is the level that things could be at.";

    @Bean
    public CommandLineRunner setupData(
            final GeneralInfoRepository generalInfoRepository,
            final BlogPostRepository blogPostRepository
    ) {
        return args -> {
            generalInfoRepository.save(GeneralInfo.builder().companyName(COMPANY_NAME).mottoTitle(MOTTO_TITLE).mottoBody(MOTTO_BODY).build());

            //blogPostRepository.save(BlogPost.builder().isMainPage(Boolean.TRUE).title(BLOG_TITLE).body(BLOG_BODY).build());
            //blogPostRepository.save(BlogPost.builder().isMainPage(Boolean.FALSE).title(BLOG_TITLE).body(BLOG_BODY).build());
            //blogPostRepository.save(BlogPost.builder().isMainPage(Boolean.FALSE).title(BLOG_TITLE).body(BLOG_BODY).build());
        };
    }
}
