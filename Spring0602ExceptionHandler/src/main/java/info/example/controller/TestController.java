package info.example.controller;

import java.util.logging.Logger;

import org.mybatis.logging.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {
	
	
	
	@RequestMapping(value = "/test1", method = RequestMethod.GET)
	public String test1(Model model) {
		
		int [] array1 = {10,20,30};
		
		model.addAttribute("array1", array1[10]);
		
		return "test1";
	}
	
	
	@ExceptionHandler(ArrayIndexOutOfBoundsException.class)
	public String exception1() {
		System.out.println("ArrayIndexOut Error");
		return "error1";
	}
	
	
	
	
	
}

