package com.jyjung.project1.controller;

import java.util.HashMap;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin(origins = "http://localhost:3000", allowCredentials = "true")
@RestController
@RequestMapping(value = "/main")
public class MainContoroller {

	@GetMapping("/test")
	public ResponseEntity test(@RequestParam HashMap request) {
		System.out.println(request);
		System.out.println("Test");
		System.out.println("firstupload");
		System.out.println("branch");
		System.out.println("workflow");
		HashMap data = new HashMap<>();
		data.put("data", "data");
		return ResponseEntity.ok(data);
		
	}
	
	
}
