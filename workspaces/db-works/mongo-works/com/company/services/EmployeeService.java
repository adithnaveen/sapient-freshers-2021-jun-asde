package com.company.services;

import static com.mongodb.client.model.Filters.eq;

import java.util.ArrayList;
import java.util.List;

import org.bson.conversions.Bson;

import com.company.entity.Employee;
import com.company.util.MongoUtil;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.naveen.contracts.IEmployeeDAO;

public class EmployeeService implements IEmployeeDAO {
	private MongoClient mongoClient ; 
	private MongoCollection collection ; 
	
	public EmployeeService() {
		  mongoClient = MongoUtil.mongoUtil(); 
		  collection = MongoUtil.getCollectionFromDB("navdb", "emps", Employee.class); 
	}

	@Override
	public void insertOne(Employee employee) {
		collection.insertOne(employee);
	}

	@Override
	public void insertMany(List<Employee> employeeList) {
		collection.insertMany(employeeList);
	}

	@Override
	public long update(Bson filters, Bson updates) {
		return   collection.updateMany(filters, updates).getModifiedCount();
	}

	@Override
	public Employee findById(int id) {
		return (Employee) collection.find(eq("empId", id)).first(); 
		
	}

	@Override
	public Iterable<Employee> findAll() {
		 return collection.find().into(new ArrayList<Employee>());
	}

	@Override
	public MongoCursor findWithCondition(Bson condition, int limit) {
		  return collection.find(condition).limit(limit).iterator(); 
	}

	@Override
	public boolean deleteById(int id) {
		  return collection.deleteOne(eq("empid", id)).getDeletedCount()>0; 
	}

	@Override
	public long delete(Bson filters) {
		  return collection.deleteMany(filters).getDeletedCount();
	}
}
