package com.baizhi.mybatiscache.service;

import com.baizhi.mybatiscache.dao.EmployeeDao;
import com.baizhi.mybatiscache.entity.Employee;
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
