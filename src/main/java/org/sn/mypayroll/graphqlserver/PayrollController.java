package org.sn.mypayroll.graphqlserver;

import org.sn.mypayroll.entity.Employee;
import org.sn.mypayroll.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class PayrollController {
    @Autowired
    EmployeeRepository employeeRepository;
    @QueryMapping
    public Employee employeeById(@Argument String id){
        return employeeRepository.findById(Integer.parseInt(id)).get();
    }
}
