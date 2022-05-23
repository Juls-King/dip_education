package egovframework.example.sample.service;

import java.util.List;

public interface IStudentService {
	
	void insertStudent(StudentVO studentVo) throws Exception;
	StudentVO getStudentById(Long id) throws Exception;
	List<?> getAllStudeunt() throws Exception; 

}
