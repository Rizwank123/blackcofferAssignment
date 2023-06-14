package com.blackcoffer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.blackcoffer.payload.ApiResponse;
import com.blackcoffer.payload.UserDataDto;
import com.blackcoffer.service.UserDataService;

@RestController
@RequestMapping("/blackcoffer")
public class UserDatacontroller {
	
	@Autowired
	private UserDataService userDataService;
	
	@PostMapping("/upload")
	public ResponseEntity<ApiResponse> uploadData(@RequestParam("file") MultipartFile file){
		if(userDataService.hasCsvFormat(file)) {
			userDataService.ProcessAndSaveData(file);
			return ResponseEntity.status(HttpStatus.OK).body(new ApiResponse("Data insert Successfully",true));
		}
		return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body(new ApiResponse("Please upload csv file",false));
	}
	@GetMapping("/show")
	public ResponseEntity<List<UserDataDto>>getAllData(){
		List<UserDataDto> user=userDataService.getAllData();
		return ResponseEntity.status(HttpStatus.OK).body(user);
	}
	

}
