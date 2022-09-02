package com.samples.SpringJDBC.dao.rowmapper;


import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.samples.SpringJDBC.dto.Employee;

public class EmployeeRowMapper implements RowMapper<Employee>{

	// how to build object from resultset
	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employee emp = new Employee();
		emp.setId(rs.getInt(1));
		emp.setFirstName(rs.getString(2));
		emp.setLastName(rs.getString(3));
		return emp;
	}

}
