package com.baizhi.mybatiscache.dao;

import com.baizhi.mybatiscache.entity.Employee;

public interface EmployeeDao {
    Employee findEmployeeById(String id);

    void deleteEmployeeById(String id);
}
