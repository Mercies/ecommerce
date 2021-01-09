package com.emsi.ecommerce.service.mapper;

import org.mapstruct.Mapper;

import com.emsi.ecommerce.domaine.RoleVO;
import com.emsi.ecommerce.entity.Role;

@Mapper(componentModel = "spring", uses = {})
public interface RoleMapper extends EntityMapper<Role, RoleVO>{

	

}
