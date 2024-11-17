package com.Addition.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdditionController {
	@PostMapping("/add")
	public Integer addTheNums(@RequestBody  Numbers nums ) {
		int sum = nums.getNum1()+ nums.getNum2()	;	
		return sum;
	}
	
}
