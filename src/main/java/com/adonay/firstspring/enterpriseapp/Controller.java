package com.adonay.firstspring.enterpriseapp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//Responsibilities
//Sending data to the UI in the right format
@RestController
public class Controller {
	
	@Autowired
	private BusinessService businessService;
	
	//"/sum" request
	@GetMapping("/sum")
	public long displaySum() {
		return businessService.calculateSum();
	}

}

//Business Logic
@Component
class BusinessService{
	
	@Autowired
	private DataService dataService;
	
	public long calculateSum() {
		List<Integer> list = dataService.retriveData();
		return list.stream().reduce(Integer::sum).get();
	}
	
}

//Getting Data
@Component
class DataService{
	public List<Integer> retriveData(){
		return List.of(1,2,3, 90);
	}
	
}