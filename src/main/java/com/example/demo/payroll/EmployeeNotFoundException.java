package com.example.demo.payroll;

public class EmployeeNotFoundException extends RuntimeException {

  EmployeeNotFoundException(Long id) {
    super("Could not find employee: " + id);
  }
}
