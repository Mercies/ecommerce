package com.emsi.ecommerce.service.mapper;

import org.mapstruct.Mapper;

import com.emsi.ecommerce.domaine.PanierArticleVO;
import com.emsi.ecommerce.entity.PanierArticle;

@Mapper(componentModel = "spring", uses = {PanierMapper.class,ArticleMapper.class})
public interface PanierArticleMapper extends EntityMapper<PanierArticle, PanierArticleVO> {


}
