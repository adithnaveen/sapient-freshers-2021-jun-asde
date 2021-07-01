package com.company.rest.works.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.hateoas.RepresentationModel;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.NoArgsConstructor;

@Document
@Data
@NoArgsConstructor
//@AllArgsConstructor
public class User  {

	@Id
	private Integer id;
	private String name;
	private double income; 
	private Date dob;
	
	@JsonCreator
	public User(@JsonProperty("id") Integer id, @JsonProperty("name") String name, 
			@JsonProperty("income") double income, @JsonProperty("dob") Date dob) {
		super();
		this.id = id;
		this.name = name;
		this.income = income;
		this.dob = dob;
	}
	
	
	
}
