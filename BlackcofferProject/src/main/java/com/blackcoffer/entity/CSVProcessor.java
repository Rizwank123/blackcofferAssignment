package com.blackcoffer.entity;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

import com.blackcoffer.payload.UserDataDto;

public class CSVProcessor {
	private static final String CSV_DELIMITER = ",";
	private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("'MMMM, dd yyyy HH:mm:ss'",
			Locale.ENGLISH);

	public static void processCSVFile(String filePath) throws IOException {
		List<UserDataDto> userDataList = new ArrayList<>();

		try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
			String line;
			boolean isFirstLine = true; // Skip the header line
			int i=0;
			while ((line = reader.readLine()) != null) {
				if (isFirstLine) {
					isFirstLine = false;
					continue;
				}

				String[] data = line.split(CSV_DELIMITER);
				System.out.println(data[11]);

				// Map each CSV field to UserData object fields
			
//				for(String s:data) {
//					System.out.print(s+"-=-=- ");
//					
//				}
//				
//				System.out.println();
//
//				i++;
//				if(i==5) break;
//				

		
	}
			
		}
	}

	public static void main(String[] args) {
		String filePath = "/Users/macBook/Desktop/blackcoffer/BlackcofferProject/src/main/resources/Data.csv";

		try {
			 processCSVFile(filePath);
			// Do something with the userDataList, such as saving it to a database
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
