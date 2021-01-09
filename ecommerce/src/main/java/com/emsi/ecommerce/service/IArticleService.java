package com.emsi.ecommerce.service;

import org.springframework.data.domain.Page;

import com.emsi.ecommerce.domaine.ArticleVO;


public interface IArticleService extends ICrudService<ArticleVO>{
	
	Page<ArticleVO> findByPriceRange(Double min, Double max);
}
