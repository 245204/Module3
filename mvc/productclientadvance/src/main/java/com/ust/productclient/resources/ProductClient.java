package com.ust.productclient.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

//controller


@RestController
@RequestMapping("/client")
public class ProductClient {
	
	@Autowired
	RestTemplate template; //on our behalf rest apis communicate to eachother 

	@GetMapping
	public String testMethod() {
		//String url="http://localhost:8090/product/api.2.0/";
		String url="http://localhost:8090/product/api.2.0/retrieve/1";
		//String url="http://localhost:8090/product/api.2.0/retrieve/all";
		String result=template.getForObject(url, String.class);
		return "working..."+ result;
	}
}
