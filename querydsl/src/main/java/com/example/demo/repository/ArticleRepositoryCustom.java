package com.example.demo.repository;

import com.example.demo.Entity.Article;

import java.util.List;

public interface ArticleRepositoryCustom {
    List<Article> findByLevelUsingQuerydsl(String level);
}
