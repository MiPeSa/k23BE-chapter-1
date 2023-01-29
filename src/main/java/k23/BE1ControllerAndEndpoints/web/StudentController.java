package k23.BE1ControllerAndEndpoints.web;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import k23.BE1ControllerAndEndpoints.domain.Student;

@Controller
public class StudentController {
	
	@GetMapping("student")
	public String showHelloToStudents(Model model) {
		ArrayList<Student> students = new ArrayList<>();
			students.add(new Student("Mikko", "Mallikas"));
			students.add(new Student("Milla", "Mallikas"));
			students.add(new Student("Ella", "Esimerkki"));
			model.addAttribute("students", students);
			return "students";
			
		
	}
}
