package com.emsi.ecommerce.service.mapper;

import org.mapstruct.Mapper;

import com.emsi.ecommerce.domaine.PanierVO;
import com.emsi.ecommerce.entity.Panier;

@Mapper(componentModel = "spring", uses = {UserMapper.class})
public interface PanierMapper extends EntityMapper<Panier,PanierVO >{

	
	

}
