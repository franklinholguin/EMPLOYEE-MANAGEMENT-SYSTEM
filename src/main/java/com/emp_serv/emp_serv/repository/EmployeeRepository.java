package com.emp_serv.emp_serv.repository;

import com.emp_serv.emp_serv.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
