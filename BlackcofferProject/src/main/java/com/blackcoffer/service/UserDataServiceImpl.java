package com.blackcoffer.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.time.LocalDateTime;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.blackcoffer.entity.UserData;
import com.blackcoffer.payload.UserDataDto;
import com.blackcoffer.repositroy.UserDataRepo;



@Service
public class UserDataServiceImpl implements UserDataService {

	 private static final Logger logger = LoggerFactory.getLogger(UserDataServiceImpl.class);
	 
	@Autowired
	private UserDataRepo userRepo;
	private ModelMapper modelMapper;

	@Override
	public boolean hasCsvFormat(MultipartFile file) {
		String type = "text/csv";
	    if (!type.equals(file.getContentType())) {
	        return false;
	    }
	    return true;
	}

	@Override
	public void ProcessAndSaveData(MultipartFile file) {

		try {
		    
		    List<UserDataDto> dataList = csvToUsers(file.getInputStream());
		    System.out.println(dataList);
		    List<UserData> user = dataList.stream().map((e) -> modelMapper.map(e, UserData.class))
		            .collect(Collectors.toList());
		    userRepo.saveAll(user);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

	private List<UserDataDto> csvToUsers(InputStream inputStream) {
		List<UserDataDto> userDtoList = new ArrayList<>();
		try (BufferedReader fileReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
				
				CSVParser csvParser = new CSVParser(fileReader,
						CSVFormat.DEFAULT.withHeader())) {

			List<CSVRecord> records = csvParser.getRecords();
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM, dd yyyy HH:mm:ss");
			for (CSVRecord csv : records) {
				
				 logger.debug("Processing record: {}", csv);
				UserDataDto udata = new UserDataDto();
				udata.setEnd_year(Year.parse(csv.get("end_year")));
				udata.setCitylng(Double.parseDouble(csv.get("citylng")));
				udata.setCitylat(Double.parseDouble(csv.get("citylat")));
				udata.setIntensity(Integer.parseInt(csv.get("intensity")));
				udata.setSector(csv.get("sector"));
				udata.setTopic(csv.get("topic"));
				udata.setInsight(csv.get("insight"));
				udata.setSwot(csv.get("swot"));
				udata.setUrl(csv.get("url"));
				udata.setRegion(csv.get("region"));
				udata.setStart_year(Year.parse(csv.get("start_year")));
				udata.setImpact(Integer.parseInt(csv.get("impact")));
				udata.setAdded(LocalDateTime.parse(csv.get("added"), formatter));
				udata.setPublished(LocalDateTime.parse(csv.get("published"), formatter));
				udata.setCity(csv.get("city"));
				udata.setCountry(csv.get("country"));
				udata.setRelevance(Integer.parseInt(csv.get("relevance")));
				udata.setPestle(csv.get("pestle"));
				udata.setSource(csv.get("source"));
				udata.setTitle(csv.get("title"));
				userDtoList.add(udata);
				
			}
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		
		return userDtoList;
	}

}
