package in.ashokit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import in.ashokit.entity.Student;
import in.ashokit.repo.StudentRepo;

@Repository
public class StudentService {
	
	@Autowired
	private StudentRepo repo;
	
	public void performDatabaseOperaton() {
		
		Student s = new Student();
		
		s.setName("nani");
		s.setMarks(100);
		
		Student save = repo.save(s);
		
		System.out.println(save);
		
		
		
		
		
	}

}
