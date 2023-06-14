package com.blackcoffer.payload;



import java.sql.Timestamp;
import java.time.Year;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class UserDataDto {
	private long id;
	private Integer end_year;
	private String citylng;
	private String citylat;
	private Integer intensity;
	private String sector;
	private String topic;
	private String insight;
	private String swot;
	private String url;
	private String region;
	private Integer start_year;
	private Integer impact;
	private String added;
	private String published;
	private String city;
	private String country;
	private Integer relevance;
	private String pestle;
	private String source;
	private String title;
	private Integer likelihood;

}
