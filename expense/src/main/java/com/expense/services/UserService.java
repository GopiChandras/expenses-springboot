package com.expense.services;

import java.util.List;


import com.expense.models.Users;

public interface UserService {

	Users addUser(Users newUser);
	 List<Users> getUsers();
   Users getUsersById(long id);
   Users updateUsers(Users users,long id);
   void deleteUsers(long id);
}
