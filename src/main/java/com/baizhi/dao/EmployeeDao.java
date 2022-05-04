package com.baizhi.dao;

import com.baizhi.entity.Employee;

public interface EmployeeDao {
    Employee findEmployeeById(String id);

    void deleteEmployeeById(String id);
}
