package com.tnsif.placementproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tnsif.placementproject.entity.AdminTable;
import com.tnsif.placementproject.service.AdminServices;

@RestController
public class AdminController {
	
	@Autowired
	public AdminServices adsrvs;
	
	@PostMapping("/addstd")
	public AdminTable addStudent(@RequestBody AdminTable std) {
		return adsrvs.addstd(std);
	}
	
	@GetMapping("/getstd")
	public List<AdminTable> getStudent(){
		return adsrvs.getstd();
		
	}
	
	@DeleteMapping("/deletestd/{stdid}")
	public void deleteStudent(@PathVariable long stdid) {
		adsrvs.deletestd(stdid);
	}
	
}
