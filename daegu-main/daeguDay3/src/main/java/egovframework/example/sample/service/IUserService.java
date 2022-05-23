package egovframework.example.sample.service;

import java.util.List;

public interface IUserService {
	
	void addUser(UserVO userVO);
	List<?> getAllUser();
	UserVO getUserById(Long id);

}
