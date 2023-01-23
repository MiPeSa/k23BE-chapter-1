package k23.BE1ControllerAndEndpoints.web;

import org.springframework.stereotype.Controller;
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
	
	@RequestMapping("/hello")
	@ResponseBody
	public String showHelloPage(
			@RequestParam (name="location", required=false, defaultValue="Helsinki") String location, 
			@RequestParam (name="name", required=false, defaultValue="Nimetön") String name) {
		return "Welcome to the " + location + " " + name + "!";
	}
}
