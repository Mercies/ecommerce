package com.emsi.ecommerce.service.mapper;

import java.util.List;

import org.mapstruct.Mapper;

@Mapper
public interface EntityMapper<E,D> {
	
	
	E toEntity(D dto);
	D toDto(E entity);
	List<E> toEntity(List<D> listDto);
	List<D> toDto(List<E> listEntity);
	
	

}
