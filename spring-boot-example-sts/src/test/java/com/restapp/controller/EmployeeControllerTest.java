package com.restapp.controller;


import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.powermock.modules.junit4.PowerMockRunner;

import com.springboot.spring_boot_example_sts.*;
//import com.marsApp.repo.EmployeeRepository;

@RunWith(PowerMockRunner.class)
public class EmployeeControllerTest {
    @Mock
    private EmployeeRepository employeeRepository;
    
    @Mock
    private Employee empMock;
    
    @InjectMocks
    EmployeeController empController;
    
    @Before
    public void setup() {
    	empController=new EmployeeController();
    }
	
    
    @Test(expected=NullPointerException.class)
    public void test_method_getAllEmployees() {
    	assertNull(empController.list());
    }

    @Test(expected=NullPointerException.class)
    public void test_method_getAllGetCount() {
    	assertNull(empController.list().size());
    }
    
    @Test(expected=NullPointerException.class)
    public void test_method_createEmployee() {
    
    	empMock.setFirst_name("mocktest");
    	empMock.setEmployee_id(Long.parseLong("1"));
    	empMock.setLast_name("testLast");
		assertNull(empController.save(empMock));
    }

   
}