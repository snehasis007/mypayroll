package org.sn.mypayroll.controller;

import org.sn.mypayroll.entity.Employee;
import org.sn.mypayroll.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class MypayrollController {
    @Autowired
    EmployeeRepository employeeRepository;
    @GetMapping("employees")
    public ResponseEntity<List<Employee>> getAllEmployees (){
        ResponseEntity<List<Employee>> res= new ResponseEntity<>(new ArrayList<>(),HttpStatus.OK);

        res.getBody().addAll(employeeRepository.findAll());
        return res;
    }
}
