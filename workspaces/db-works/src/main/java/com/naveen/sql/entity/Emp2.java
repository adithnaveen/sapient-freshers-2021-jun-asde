package com.naveen.sql.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "emp")
public class Emp2 {
	@Id
	@Column(name = "empid")
	private int empId; 
	
	@Column(name="empname")
	private String empName; 
	
	@Column( name = "empsal")
	private double empSal;
}
