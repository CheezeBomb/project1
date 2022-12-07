package com.jyjung.project1.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/main")
public class MainContoroller {

	@GetMapping("/test")
	public ResponseEntity test() {
		System.out.println("Test");
		System.out.println("firstupload");
		System.out.println("branch");
		System.out.println("workflow");
		return ResponseEntity.ok("");
		
	}
	
	
}
