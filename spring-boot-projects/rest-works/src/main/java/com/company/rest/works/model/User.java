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
// @Data
// @NoArgsConstructor
// @AllArgsConstructor
public class User {
	public User() {
	}

	@Id
	private Integer id;
	private String name;
	private double income;

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	private Date dob;

	@JsonCreator
	public User(@JsonProperty("id") Integer id, @JsonProperty("name") String name,
			@JsonProperty("income") double income, @JsonProperty("dob") Date dob) {
		super();
		this.id = id;
		this.setName(name);
		this.setIncome(income);
		this.setDob(dob);
	}

	/**
	 * @return the dob
	 */
	public Date getDob() {
		return dob;
	}

	/**
	 * @param dob the dob to set
	 */
	public void setDob(Date dob) {
		this.dob = dob;
	}

	/**
	 * @return the income
	 */
	public double getIncome() {
		return income;
	}

	/**
	 * @param income the income to set
	 */
	public void setIncome(double income) {
		this.income = income;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

}
