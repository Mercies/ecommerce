package com.emsi.ecommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.emsi.ecommerce.entity.Panier;

@Repository
public interface PanierRepository extends JpaRepository<Panier, Long>{

}
