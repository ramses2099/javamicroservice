package com.jprograming.javamicroservice;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class EmployeeController {

    private final EmployeeRepository repository;

    public EmployeeController(EmployeeRepository employeeRepository) {
        this.repository = employeeRepository;
    }

    @GetMapping("/employees")
    public Iterable<Employee> findAllEmployees(){
        return this.repository.findAll();
    }

    @PostMapping("/employees")
    public Employee addOneEmployee(@RequestBody Employee employee){
        return this.repository.save(employee);
    }


}
