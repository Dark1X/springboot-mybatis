package com.lucifer.springboot.controller;

import com.lucifer.springboot.bean.Employee;
import com.lucifer.springboot.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: Lucifer
 * @create: 2018-09-20 15:00
 * @description:
 **/
@RestController
public class EmployeeController {

    @Autowired
    EmployeeMapper employeeMapper;

    @GetMapping("/emp/{id}")
    public Employee getemployee(@PathVariable("id") Integer id){
        return employeeMapper.getEmployee(id);
    }

}
