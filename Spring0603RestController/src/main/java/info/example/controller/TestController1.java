package info.example.controller;

import java.util.ArrayList;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import info.example.beans.DataBean1;

@RestController
public class TestController1 {

	@RequestMapping(value = "test2", method = RequestMethod.GET)
	public ResponseEntity<ArrayList<DataBean1>> test(){
		
		DataBean1 bean1 = new DataBean1("문자열1", 100, 11.11, false);
		DataBean1 bean2 = new DataBean1("문자열2", 200, 22.22, true);
		DataBean1 bean3 = new DataBean1("문자열3", 300, 33.33, false);
		
		ArrayList<DataBean1> list = new ArrayList<DataBean1>();
		list.add(bean1);
		list.add(bean2);
		list.add(bean3);
		
		ResponseEntity<ArrayList<DataBean1>> entry = new ResponseEntity<ArrayList<DataBean1>>(list, HttpStatus.OK);
		
		return entry;
	}
}
