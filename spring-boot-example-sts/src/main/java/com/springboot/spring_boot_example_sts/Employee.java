/**
 * 
 */
package com.springboot.spring_boot_example_sts;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author MARS
 *
 */
@Entity
@Table(name = "employee_master")
public class Employee {
	@Id

	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@Column(name = "employee_id")
	private Long employee_id;
	@Column(name = "first_name")
    private String first_name;
	@Column(name = "last_name")
    private String last_name;
    
    protected Employee() {
    	
    }

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public Long getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(Long employee_id) {
		this.employee_id = employee_id;
	}
}
