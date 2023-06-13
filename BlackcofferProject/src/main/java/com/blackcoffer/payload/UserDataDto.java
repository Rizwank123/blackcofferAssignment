package com.blackcoffer.payload;

import java.time.LocalDateTime;
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
	private Year end_year;
	private double citylng;
	private double citylat;
	private Integer intensity;
	private String sector;
	private String topic;
	private String insight;
	private String swot;
	private String url;
	private String region;
	private Year start_year;
	private Integer impact;
	private LocalDateTime added;
	private LocalDateTime published;
	private String city;
	private String country;
	private Integer relevance;
	private String pestle;
	private String source;
	private String title;
	private Integer likelihood;

}
