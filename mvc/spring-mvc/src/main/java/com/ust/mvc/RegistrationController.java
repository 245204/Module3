package com.ust.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/register")
public class RegistrationController {
	
 @PostMapping
 public String signup(@RequestParam("userName")String userName,@RequestParam("mailId")String mailId,Model model) {
	 if(userName.length()>6 && mailId.length()>6)
	 {
		 model.addAttribute("uname",userName);//here we take the string value to pass it to html
		 model.addAttribute("mid",mailId);
		 return "success";
	 }
	 else {
		 return "error";
	 }
	
	 
 }

}