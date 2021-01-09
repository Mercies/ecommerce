package com.emsi.ecommerce.service.impl;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.emsi.ecommerce.domaine.UserVO;
import com.emsi.ecommerce.service.IUserService;

@Service
public class UserServiceImpl implements IUserService {

	@Override
	public void saveOrUpdate(UserVO t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<UserVO> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserVO findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<UserVO> findByCriteria(UserVO t) {
		// TODO Auto-generated method stub
		return null;
	}

}
