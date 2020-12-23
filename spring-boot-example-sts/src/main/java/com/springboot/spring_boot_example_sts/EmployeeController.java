/**
 * 
 */
package com.springboot.spring_boot_example_sts;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.springboot.spring_boot_example_sts.Employee;
import com.springboot.spring_boot_example_sts.EmployeeService;

/**
 * @author MARS
 *
 */
@RestController
@RequestMapping("/restemployee")
public class EmployeeController {
	
	@Autowired(required = true)
    private EmployeeService empService;
	
	@PostMapping("/save")
    public ResponseEntity<Employee> save(@RequestBody Employee employee)
                                     
	{
        Employee success = empService.save(employee);
        return new ResponseEntity<Employee>(success, new HttpHeaders(),HttpStatus.OK);
    }
	
	@PutMapping("/update/{id}")
	public ResponseEntity<?> update(@RequestBody Employee employee,@PathVariable long id) 
	{
		try 
		{
			Employee persistObject = empService.get(id);
			persistObject.setFirst_name(employee.getFirst_name());
			persistObject.setLast_name(employee.getLast_name());
			empService.save(persistObject);
			return new ResponseEntity<>(HttpStatus.OK);
			
		} catch (NoSuchElementException e) 
		{
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@GetMapping("/employee/{id}")
	public ResponseEntity<Employee> get(@PathVariable long id)  
	{		
		Employee view = empService.get(id);		 
        return new ResponseEntity<Employee>(view, new HttpHeaders(), HttpStatus.OK);	       
	}
	
	@DeleteMapping("delete/{id}")
	public void delete(@PathVariable long id) 
	{
		empService.delete(id);
	}
	
	@GetMapping("/getlist")
	public List<Employee> list() 
	{
	    return empService.listAll();
	}
	
	@GetMapping("/employeecount")
    public Integer getCount() 
	{
		
		Integer count=empService.listAll().size();
		if(count>0) 
		{
			return count;
		} else 
		{
			count=0;
		}
		
        return count;
    }
		
}
