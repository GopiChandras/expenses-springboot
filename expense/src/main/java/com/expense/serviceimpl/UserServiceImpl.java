package com.expense.serviceimpl;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.expense.exception.ResourceNotFoundException;
import com.expense.models.Users;
import com.expense.repository.UsersRepository;
import com.expense.services.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	public UsersRepository usersRepository;

	@Override
	public Users addUser(Users newUser) {
		
		return usersRepository.save(newUser);
	}

	@Override
	public List<Users> getUsers() {
		// TODO Auto-generated method stub
		return usersRepository.findAll();
	}

	@Override
	public Users getUsersById(long id) {
		return usersRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Users","Id",id)) ;
	}

	@Override
	public Users updateUsers(Users users, long id) {
		Users existingUsers=usersRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Users","id",id));
		existingUsers.setMobile(users.getMobile());
		existingUsers.setName(users.getName());
		usersRepository.save(existingUsers);
		return existingUsers;
	}

	@Override
	public void deleteUsers(long id) {
		usersRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Users","id",id));
		
		usersRepository.deleteById(id);
		
	}
     
	

}
