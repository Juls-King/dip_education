package egovframework.example.sample.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import egovframework.example.sample.service.IStudentService;
import egovframework.example.sample.service.StudentVO;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class StudentServiceImple implements IStudentService {
	
	private final IStudentMapper iSMapper;

	@Override
	public void insertStudent(StudentVO studentVo) throws Exception {
		// TODO Auto-generated method stub
		iSMapper.insertStudent(studentVo);
	}

	@Override
	public List<?> getAllStudeunt() throws Exception {
		// TODO Auto-generated method stub
		return iSMapper.getAllList();
	}

	@Override
	public StudentVO getStudentById(Long id) throws Exception {
		// TODO Auto-generated method stub
		return iSMapper.getStudentById(id);
	}

}
