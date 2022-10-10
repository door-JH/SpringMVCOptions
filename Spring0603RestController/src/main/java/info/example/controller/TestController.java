package info.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {
	
	@RequestMapping(value = "test1", method = RequestMethod.GET)
	public String test1(Model model) {
		
		
		
		return "test1";
	}
	
}
