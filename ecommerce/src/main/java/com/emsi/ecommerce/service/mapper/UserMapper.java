package com.emsi.ecommerce.service.mapper;

import org.mapstruct.Mapper;

import com.emsi.ecommerce.domaine.UserVO;
import com.emsi.ecommerce.entity.User;

@Mapper(componentModel = "spring", uses = {RoleMapper.class})
public interface UserMapper extends EntityMapper<User,UserVO>{

}
