package com.blackcoffer.entity;

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
	private String  pestle;
	private String source;
	private String title;
	private Integer likelihood;

}
