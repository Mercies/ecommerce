package com.emsi.ecommerce.service.mapper;


import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import com.emsi.ecommerce.domaine.ArticleVO;
import com.emsi.ecommerce.entity.Article;



@Mapper
public interface ArticleMapper extends EntityMapper<Article,ArticleVO> {
	
	ArticleMapper INSTANCE = Mappers.getMapper(ArticleMapper.class);
	// from dto(VO) to entity
	@Mapping(source="reference", target = "reference")
	@Mapping(source="designation", target = "designation")
	@Mapping(source="price", target = "price")
	Article toEntity(ArticleVO dto);
	// from entity to dto(VO)
	@Mapping(source="reference", target = "reference")
	@Mapping(source="designation", target = "designation")
	@Mapping(source="price", target = "price")
	ArticleVO toDto(Article entity);
/*	
	@Mapping(source="reference", target = "reference")
	@Mapping(source="designation", target = "designation")
	@Mapping(source="price", target = "price")
	List<Article> toEntity(List<ArticleVO> listDto);
	
	@Mapping(source="reference", target = "reference")
	@Mapping(source="designation", target = "designation")
	@Mapping(source="price", target = "price")
	List<ArticleVO> toDto(List<Article> listEntity);*/
}
