package k23.BE1ControllerAndEndpoints.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class RequestController {

	@RequestMapping("/index")
	@ResponseBody
	public String showMainPage() {
		return "This is the main page";
	}
	
	@RequestMapping("/contact")
	@ResponseBody
	public String showContactPage() {
		return "This is the contact page";
	}
	
	@GetMapping("/hello")
	public String showHelloPage(
			@RequestParam (name="age", required=false) int age, 
			@RequestParam (name="name", required=false, defaultValue="Nimetön") String name, Model model) {
		model.addAttribute("name", name);
		model.addAttribute("age", age);
		return "hello";
	}
	
}
