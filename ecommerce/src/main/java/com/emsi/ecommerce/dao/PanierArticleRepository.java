package com.emsi.ecommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.emsi.ecommerce.entity.PanierArticle;

@Repository
public interface PanierArticleRepository extends JpaRepository<PanierArticle, Long> {

}
