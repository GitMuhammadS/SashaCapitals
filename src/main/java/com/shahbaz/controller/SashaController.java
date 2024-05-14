package com.shahbaz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shahbaz.entity.Sasha;
import com.shahbaz.service.ISashaService;

@RestController
@RequestMapping("/sasha")
public class SashaController {
	@Autowired
	private ISashaService service;
	
	@PostMapping("/register")
	public ResponseEntity<String> saveSasha(@RequestBody Sasha sasha){
		try {
			//use service
			String resultMsg=service.saveSasha(sasha);
			return new ResponseEntity<String>(resultMsg,HttpStatus.CREATED);
		}catch(Exception e) {
			return new ResponseEntity<String>("problem in sasha user enrollment",HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping("/hey")
	public ResponseEntity<String> getSasha(){
		return new ResponseEntity<String>("get request",HttpStatus.CREATED);
	}
	
	@PostMapping("/hi")
	public ResponseEntity<String> postSasha(){
		return new ResponseEntity<String>("post request",HttpStatus.CREATED);
	}
	
	@PutMapping("/bye")
	public ResponseEntity<String> putSasha(){
		return new ResponseEntity<String>("put request",HttpStatus.CREATED);
	}
	
	@DeleteMapping("/del")
	public ResponseEntity<String> deleteSasha(){
		return new ResponseEntity<String>("delete request",HttpStatus.CREATED);
	}
	
}
