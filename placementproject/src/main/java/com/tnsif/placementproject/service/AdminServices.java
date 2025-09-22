package com.tnsif.placementproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tnsif.placementproject.entity.AdminTable;
import com.tnsif.placementproject.repo.Adminrepo;

@Service
public class AdminServices {
	
	@Autowired
	public Adminrepo adrepo;
	
	//Insertion operation
	public AdminTable addstd(AdminTable std) {
		return adrepo.save(std);
	}
	
	//Retrieving data from Data Base
	
	public List<AdminTable> getstd(){
		return adrepo.findAll();
	}
	
	
	
	//Delete Data Operation
	public void deletestd(long stdid) {
		adrepo.deleteById(stdid);
	}

}