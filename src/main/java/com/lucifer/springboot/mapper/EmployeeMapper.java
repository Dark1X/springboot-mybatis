package com.lucifer.springboot.mapper;

import com.lucifer.springboot.bean.Employee;

public interface EmployeeMapper {
    public Employee getEmployee(Integer id);

    public void insertEmp(Employee employee);
}
