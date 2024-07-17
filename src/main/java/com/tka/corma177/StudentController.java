package com.tka.corma177;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class StudentController {
	@GetMapping("/")
	public String openLoginPages() {
		System.out.println("I am in controller");
		return "login";
	}

	@GetMapping("senddata")
	public String openLoginPages(@RequestParam String userName) {
		System.err.println(userName);
		System.out.println("I am in user");
		return "login";
	}

	@GetMapping("controlldata")
	public String openLoginControll(@ModelAttribute String NameControll) {
		System.err.println(NameControll);
		System.out.println("I am in usermember");
		return "login";
	}

}
