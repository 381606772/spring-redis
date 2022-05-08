package com.springredis;

import com.baizhi.BaizhiApplication;
import com.baizhi.mybatiscache.entity.Employee;
import com.baizhi.mybatiscache.service.IEmployeeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = BaizhiApplication.class)
@RunWith(SpringRunner.class)
public class TestEmployeeService {

    @Autowired
    private IEmployeeService employeeService;

    @Test
    public void testFindEmployeeById() {
        Employee employee = employeeService.findEmployeeById("1");
        System.out.println("employee = " + employee);

        System.out.println("=======================>>>>>>>>>");

        Employee employee2 = employeeService.findEmployeeById("1");
        System.out.println("employee2 = " + employee2);
    }

    @Test
    public void testDeleteEmployeeById() {
        employeeService.deleteEmployeeById("1");;
    }
}
