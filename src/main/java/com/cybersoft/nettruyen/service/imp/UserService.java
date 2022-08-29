package com.cybersoft.nettruyen.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cybersoft.nettruyen.entity.Users;
import com.cybersoft.nettruyen.repository.UserRepository;
import com.cybersoft.nettruyen.service.IUserService;

@Service
public class UserService implements IUserService {
	
	@Autowired
	UserRepository userRepository;
	
	@Override
	public void register(Users users) {
		userRepository.save(users);
	}

}
