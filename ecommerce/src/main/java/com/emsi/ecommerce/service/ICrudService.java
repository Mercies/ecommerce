package com.emsi.ecommerce.service;

import java.util.List;

import org.springframework.data.domain.Page;

public interface ICrudService<T> {
	
	void saveOrUpdate(T t);
	
	void delete(long id);
	
	List<T> findAll();
	
	T findById(Long id);
	
	
	Page<T> findByCriteria(T t);
}
