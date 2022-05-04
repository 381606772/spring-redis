package com.baizhi.service;

import com.baizhi.dao.EmployeeDao;
import com.baizhi.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements IEmployeeService{

    @Autowired
    private EmployeeDao employeeDao;

    @Override
    public Employee findEmployeeById(String id) {
        return employeeDao.findEmployeeById(id);
    }

    @Override
    public void deleteEmployeeById(String id) {
        employeeDao.deleteEmployeeById(id);
    }
}
