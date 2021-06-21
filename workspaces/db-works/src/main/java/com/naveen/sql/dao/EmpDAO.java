package com.naveen.sql.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.naveen.sql.contracts.IEmpDAO;
import com.naveen.sql.entity.Emp;
import com.naveen.sql.util.GetConnection;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class EmpDAO implements IEmpDAO{

	GetConnection gc ; 
	public EmpDAO() {
		gc = new GetConnection(); 
	}
	
	/**
	 * @author naveenkumar 
	 * @see To insert record in to db 
	 */
	public boolean insertEmp(Emp emp) {
		String sql="insert into emp values (?,?,?)"; 
		
		try {
			gc.ps = GetConnection.getPostGressConn().prepareStatement(sql);
			gc.ps.setInt(1, emp.getEmpId());
			gc.ps.setString(2, emp.getEmpName());
			gc.ps.setDouble(3, emp.getEmpSal());
			
			return gc.ps.executeUpdate()>0;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				gc.ps.close();
				gc.rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		
		return false;
	}

	public Emp getEmp(int empId) {
		String sql="select empname, empsal from emp where empid=?"; 
		try {
			gc.ps = GetConnection.getPostGressConn().prepareStatement(sql); 
			gc.ps.setInt(1, empId);
			
			gc.rs = gc.ps.executeQuery(); 
			if(gc.rs.next()) {
				Emp emp = new Emp(); 
				emp.setEmpId(empId);
				emp.setEmpName(gc.rs.getString(1));
				emp.setEmpSal(gc.rs.getDouble(2));
				return emp;
			}else {
				log.info("Record Not Found for " + empId );
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				gc.ps.close();
				gc.rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return null;
	}

	public List<Emp> getAllEmps() {
		String sql ="select empid, empname, empsal from emp";
		
		List<Emp> list = null;
		try {
			gc.ps = GetConnection.getPostGressConn().prepareStatement(sql);
			list = new ArrayList<Emp>();
			
			gc.rs = gc.ps.executeQuery(); 
			while(gc.rs.next()) {
				Emp emp = new Emp(); 
				emp.setEmpId(gc.rs.getInt(1));
				emp.setEmpName(gc.rs.getString(2));
				emp.setEmpSal(gc.rs.getDouble(3));
				list.add(emp); 
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				gc.ps.close();
				gc.rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return list;
	}

	/** 
	 * TODO 
	 */
	public Emp updateEmp(Emp emp) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * TODO 
	 */
	public void deleteEmp(int empId) {
		// TODO Auto-generated method stub
		
	}
	
}
