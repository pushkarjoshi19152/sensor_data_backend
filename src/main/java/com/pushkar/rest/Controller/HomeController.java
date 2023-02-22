package com.pushkar.rest.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pushkar.rest.model.RecordItem;
import com.pushkar.rest.service.TempService;

@CrossOrigin("*")
@RestController
public class HomeController {

	@Autowired
	private TempService tempService;
	

	@GetMapping("/")
	public int getAllRecordCount() {
		return tempService.getRecordsCount();
	}
	
	@GetMapping("/Temprature")
	public List<Integer>getAllTemprature(){
		return tempService.getAllTemprature();
	}
	@GetMapping("/Ph")
	public List<Integer>getAllPh(){
		return tempService.getAllPh();
	}
	@GetMapping("/Turbidity")
	public List<Integer>getAllTurbidity(){
		return tempService.getAllTurbidity();
	}
	
	@GetMapping("/All")
	public List<RecordItem>getAllRecords(){
		return tempService.getAllRecords();
	}
}
