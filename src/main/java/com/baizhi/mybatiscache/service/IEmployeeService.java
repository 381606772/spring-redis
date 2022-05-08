package com.baizhi.mybatiscache.service;

import com.baizhi.mybatiscache.entity.Employee;

public interface IEmployeeService {
    Employee findEmployeeById(String id);
    void deleteEmployeeById(String id);
}
