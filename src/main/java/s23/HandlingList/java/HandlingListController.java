package s23.HandlingList.java;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import s23.HandlingList.domain.Student;

@Controller
public class HandlingListController {
	
	@GetMapping("/hello")	
	public String showStudents(Model model) {
		System.out.println("students");
		
		List<Student> student = new ArrayList<>();
		student.add(new Student("Kate", "Cole"));
		student.add(new Student("Dan", "Brown"));
		student.add(new Student("Mike", "Mars"));
		
		model.addAttribute("students", student);
		return "studentList";
	}


}
