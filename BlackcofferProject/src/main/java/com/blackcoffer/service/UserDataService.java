package com.blackcoffer.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.blackcoffer.payload.UserDataDto;

public interface UserDataService {

	boolean hasCsvFormat(MultipartFile file) ;

	void ProcessAndSaveData(MultipartFile file);
	
	List<UserDataDto> getAllData();

}
