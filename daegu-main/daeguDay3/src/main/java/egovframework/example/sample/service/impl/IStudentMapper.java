package egovframework.example.sample.service.impl;

import java.util.List;

import org.egovframe.rte.psl.dataaccess.mapper.Mapper;

import egovframework.example.sample.service.StudentVO;

@Mapper(value="studentMapper")
public interface IStudentMapper {
	
	void insertStudent(StudentVO studentVo);
	StudentVO getStudentById(Long id);
	List<?> getAllList();

}
