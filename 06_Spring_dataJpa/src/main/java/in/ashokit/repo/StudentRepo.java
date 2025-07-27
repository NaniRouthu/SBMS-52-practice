package in.ashokit.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import in.ashokit.entity.Student;
import jakarta.transaction.Transactional;

public interface StudentRepo extends JpaRepository<Student,Long> {
	
	@Modifying
	@Transactional
	@Query("UPDATE Student s SET s.marks = : marks WHERE s.name = :name")
	public int updateStudentMarks(@Param("name") String name , @Param("marks") int marks);
	
	

}
