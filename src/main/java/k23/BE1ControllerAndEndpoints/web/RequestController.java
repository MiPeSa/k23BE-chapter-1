package k23.BE1ControllerAndEndpoints.web;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import k23.BE1ControllerAndEndpoints.domain.Friend;

@Controller

public class RequestController {

	private ArrayList<Friend> friends = new ArrayList<>();
	
	@GetMapping(value = "/friend")
	public String showFriendsPage(Model model) {
		model.addAttribute("friends", friends);
		model.addAttribute("friend", new Friend(null));
		return "friends";
	}
	
	@PostMapping("/friend")
	public String addFriend(@ModelAttribute Friend friend2) {
		friends.add(friend2);
		return "redirect:/friend";
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
