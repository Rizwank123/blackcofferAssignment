package com.blackcoffer.service;

import org.springframework.web.multipart.MultipartFile;

public interface UserDataService {

	boolean hasCsvFormat(MultipartFile file) ;

	void ProcessAndSaveData(MultipartFile file);

}
