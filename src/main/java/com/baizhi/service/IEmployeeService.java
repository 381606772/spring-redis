package com.baizhi.service;

import com.baizhi.entity.Employee;

public interface IEmployeeService {
    Employee findEmployeeById(String id);
    void deleteEmployeeById(String id);
}
