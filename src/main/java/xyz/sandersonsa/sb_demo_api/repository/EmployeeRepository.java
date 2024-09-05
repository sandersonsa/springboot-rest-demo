package xyz.sandersonsa.sb_demo_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import xyz.sandersonsa.sb_demo_api.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}