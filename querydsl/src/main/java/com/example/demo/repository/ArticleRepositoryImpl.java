package com.example.demo.repository;

import com.example.demo.Entity.Article;
import com.querydsl.jpa.impl.JPAQueryFactory;

import java.util.List;

public class ArticleRepositoryImpl implements ArticleRepositoryCustom {
//    private final JPAQueryFactory queryFactory;


    @Override
    public List<Article> findByLevelUsingQuerydsl(String level) {
        // Q클래스 이용
        return null;
    }
}
