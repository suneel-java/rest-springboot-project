package com.springboot.spring_boot_example_sts;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.springboot.spring_boot_example_sts.Employee;
import com.springboot.spring_boot_example_sts.EmployeeRepository;

@Service
@Transactional
public class EmployeeService {
	
	@Autowired(required=true)
    private EmployeeRepository employeeRepository;
	
	public List<Employee> listAll() {
		List<Employee> empList=employeeRepository.findAll();
		if(empList.size()>0) {
			return empList;
		}
		else {
			System.out.println("Executed");
			 return  new ArrayList<Employee>();
		}
    }
      public Employee save(Employee employee) {
    	  return employeeRepository.saveAndFlush(employee);
    	
    }
     
     public Employee get(long id) {
    	
    	Optional<Employee> emp=employeeRepository.findById(id);
    	if(emp.isPresent()) {
    		return emp.get();
    	}
    	else {
    		System.out.println("Else Block");
    		//throw new EmployeeNotFoundException("No Record Found for Given Id ", id);
    	}
		return emp.get();
    }
    
     
    public void delete(long id) {
    	employeeRepository.deleteById(id);
    }

}
