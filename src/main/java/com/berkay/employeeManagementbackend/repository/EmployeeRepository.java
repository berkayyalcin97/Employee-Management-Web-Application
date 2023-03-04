package com.berkay.employeeManagementbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.berkay.employeeManagementbackend.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
