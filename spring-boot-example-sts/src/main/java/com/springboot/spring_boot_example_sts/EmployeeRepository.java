/**
 * 
 */
package com.springboot.spring_boot_example_sts;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//import com.springboot.spring_boot_example_sts.Employee;
/**
 * @author MARS
 *
 */

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
