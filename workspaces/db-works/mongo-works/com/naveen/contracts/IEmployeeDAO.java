package com.naveen.contracts;

import java.util.List;

import org.bson.conversions.Bson;

import com.company.entity.Employee;
import com.mongodb.client.MongoCursor;

public interface IEmployeeDAO {
	void insertOne(Employee employee);

	void insertMany(List<Employee> employeeList);

	long update(Bson filters, Bson updates);

	Employee findById(int id);

	Iterable<Employee> findAll();

	MongoCursor<Employee> findWithCondition(Bson condition, int limit);

	boolean deleteById(int id);

	long delete(Bson filters);

}
