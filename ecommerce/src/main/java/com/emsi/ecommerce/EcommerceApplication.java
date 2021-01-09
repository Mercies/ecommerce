package com.emsi.ecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


import com.emsi.ecommerce.domaine.ArticleVO;
import com.emsi.ecommerce.service.IArticleService;

@SpringBootApplication
public class EcommerceApplication {

	public static void main(String[] args) {
	ApplicationContext	applicationContext = SpringApplication.run(EcommerceApplication.class, args);
		
	IArticleService iArticleService= applicationContext.getBean(IArticleService.class);	
	ArticleVO articleVO= ArticleVO.builder().reference("TestReference1").price(10).designation("TestDesignation1").build();
	iArticleService.saveOrUpdate(articleVO);
	}

}
