package com.blackcoffer.entity;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.Year;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "users_data")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserData {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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
