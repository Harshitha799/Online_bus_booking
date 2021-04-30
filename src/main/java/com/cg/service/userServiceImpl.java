package com.cg.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dto.UserDto;
import com.cg.entity.User10;
import com.cg.exception.UsernameAlreadyExistsException;
import com.cg.exception.UsernameNotFoundException;
import com.cg.repository.IUserRepository;

@Service
public class userServiceImpl implements IUsersService  {
	
	@Autowired
	IUserRepository userRepository;
	
    
	/*************
	 * Method : deleteUser
	 * Description: method used for deleting existing  user
	 * 
	 * @param username
	 * @return void
	 * Created date: 20 April 2021
	 * 
	 */
	@Override
	public void deleteUser(String username)  
	{
		// TODO Auto-generated method stub
		if(userRepository.existsByUsername(username))
		{
			User10 user = new User10();
			user=userRepository.findByUsername(username);
			userRepository.delete(user);
		}
		else
		{
			throw new UsernameNotFoundException();
		}
				
	}
	
	 /*************
	 * Method : updatePassword
	 * Description: method used updating password of an existing user
	 * 
	 * @param username, newPassword
	 * @return void
	 * Created date: 20 April 2021
	 * 
	 */
	@Override
	public void updatePassword(String username, String newPassword) 
	{
		// TODO Auto-generated method stub
		if(userRepository.existsByUsername(username)) 
		{
			User10 user = new User10();
			user=userRepository.findByUsername(username);
			user.setPassword(newPassword);
			userRepository.save(user);
		}
		else
		{
			throw new UsernameNotFoundException();
		}
			
			
		
		
	}

	/*************
	 * Method : addUser
	 * Description: method used for adding a new user
	 * 
	 * @param userdto
	 * @return User
	 * Created date: 20 April 2021
	 * 
	 */
	

	@Override
	public User10 addUser(UserDto userdto) 
	{
		// TODO Auto-generated method stub
		User10 user=new User10();
		if(userRepository.existsByUsername(userdto.getUsername())) 
		{
			throw new UsernameAlreadyExistsException();
			
		}
		else
		{
		user.setUsername(userdto.getUsername());
		
		user.setPassword(userdto.getPassword());
		return userRepository.save(user);
		}
	
		
	}

}