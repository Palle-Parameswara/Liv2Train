package com.livtrain.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.livtrain.demo.Entity.TrainDetails;
import com.livtrain.demo.service.DetailsService;

@RestController
public class AppController {
	
	@Autowired
	private DetailsService detailsservice;
	
	@GetMapping("/data")
	public String getData() {
		return "Data Recieved!!!";
	}
	
	@GetMapping("/details")
	public List<TrainDetails> getdetails(){
		return detailsservice.getdetails();
	}
	
	@PostMapping("/details")
	public TrainDetails putdetails(@RequestBody TrainDetails traindetails) {
		return detailsservice.putdetails(traindetails);
	}
}
