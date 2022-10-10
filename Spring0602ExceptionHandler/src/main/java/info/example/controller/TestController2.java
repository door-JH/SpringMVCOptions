package info.example.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController2 {
	
	@GetMapping("/test2")
	public String test2() {
		
		ArrayList<String> list = null;
		list.add("string");
		
		return "test2";
	}
	
}
