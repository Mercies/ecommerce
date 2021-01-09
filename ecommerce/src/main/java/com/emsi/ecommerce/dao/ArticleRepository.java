package com.emsi.ecommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.emsi.ecommerce.entity.Article;

@Repository
public interface ArticleRepository extends JpaRepository<Article, Long> {
	
}
