package com.naveen.sql.contracts;

import java.util.List;

import com.naveen.sql.entity.Emp;


/**
 * 
 * @author naveenkumar
 * @see this methods are used for CRUD 
 *
 */
public interface IEmpDAO {
	public boolean insertEmp(Emp emp);

	public Emp getEmp(int empId);

	public List<Emp> getAllEmps();

	public Emp updateEmp(Emp emp);

	public void deleteEmp(int empId);
}
