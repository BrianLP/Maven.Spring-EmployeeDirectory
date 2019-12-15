package io.zipcoder.persistenceapp.controllers;

import io.zipcoder.persistenceapp.entities.Employee;
import io.zipcoder.persistenceapp.services.EmployeeServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeServices employeeServices;


    @GetMapping("/API/employees/{id}")
    public ResponseEntity<Employee> getEmployee(@PathVariable Integer id) {
        return new ResponseEntity<Employee>(employeeServices.getEmployee(id), HttpStatus.OK);
    }

    @GetMapping("/API/employees")
    public ResponseEntity<Iterable<Employee>> getAllemployees() {
        return new ResponseEntity<Iterable<Employee>>(employeeServices.getAllEmployees(), HttpStatus.OK);

    }

    @PostMapping("/API/employees")
    public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee) {
        return new ResponseEntity<Employee>(employeeServices.createEmployee(employee), HttpStatus.CREATED);
        // @PutMapping
    }


    @PutMapping("/API/employees/{id}")
    public ResponseEntity<Employee> updateEmployee(@RequestBody Employee employee) {
        return new ResponseEntity<Employee>(employeeServices.updateEmployee(employee), HttpStatus.OK);
    }

    @DeleteMapping("/API/employees/{id}")
    public ResponseEntity<Employee> deleteEmployee(@PathVariable Integer id) {
        employeeServices.deleteEmployee(id);
        return new ResponseEntity<Employee>(HttpStatus.OK);

    }
    /*@DeleteMapping("/employees/{id}")
    public ResponseEntity<Employee> deleteEmployees(@PathVariable Integer id) {
        employeeServices.deleteEmployees(id);
        return new ResponseEntity<Employee>(HttpStatus.OK);*/

    }
