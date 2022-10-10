package info.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import info.example.beans.DataBean1;
import info.example.mapper.MapperInterface;

@Controller
public class TestController {
	
	@Autowired
	MapperInterface mapper1;
	
	@RequestMapping(value = "/input_data", method = RequestMethod.GET)
	public String input_data() {		
		return "input_data";
	}
	
	@RequestMapping(value = "/input_result", method = RequestMethod.POST)
	public String input_result(DataBean1 dataBean) {
		mapper1.insert_data(dataBean);
		return "input_result";
	}
	
	@RequestMapping(value = "/read_data", method = RequestMethod.GET)
	public String read_data(Model model) {
		
		List<DataBean1> list = mapper1.select_data();
		
		model.addAttribute("list", list);
		
		return "read_data";
	}
}
