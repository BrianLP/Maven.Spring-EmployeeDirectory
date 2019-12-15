package io.zipcoder.persistenceapp.controllers;

import io.zipcoder.persistenceapp.entities.Department;
import io.zipcoder.persistenceapp.services.DepartmentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

    @RestController
    public class DepartmentController {

        @Autowired
        DepartmentServices departmentServices;

        @GetMapping("API/departments/{id}")
        public ResponseEntity<Department> getDepartment (@PathVariable Integer id) {
            return new ResponseEntity<Department>(departmentServices.getDepartment(id), HttpStatus.OK);
        }

        @PutMapping("API/departments/{id}")
        public ResponseEntity<Department> updateDepartment (@RequestBody Department department) {
            return new ResponseEntity<Department>(departmentServices.updateDept(department), HttpStatus.OK);
        }

        @PostMapping("API/departments")
        public ResponseEntity<Department> addDepartment (@RequestBody Department department) {
            return new ResponseEntity<Department>(departmentServices.createDept(department), HttpStatus.CREATED);
        }
        @PutMapping("API/employees/{id}/manager/{managerId)")
        public ResponseEntity<Department> setManager (@PathVariable int id, @PathVariable int managerId){
            Department set = departmentServices.setManager(id,managerId);
            if(set != null){
                return new ResponseEntity<Department>(set,HttpStatus.OK);
            }else{
                return new ResponseEntity<Department>(HttpStatus.BAD_REQUEST);
            }
        }



}

