package egovframework.example.sample.web;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import egovframework.example.sample.service.IStudentService;
import egovframework.example.sample.service.StudentVO;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class StudentController {
	
	private final IStudentService iStudentService;
	
	@PostMapping("/student/add")
	public void addStudent(@RequestBody StudentVO studentVO) throws Exception {
		iStudentService.insertStudent(studentVO);
	}
	
	@GetMapping("/student/getall")
	public List<?> getAll() throws Exception {
		return iStudentService.getAllStudeunt();
	}
	
	
}
