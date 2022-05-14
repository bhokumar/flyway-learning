package org.test.flyway.flywaymigrationtest.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.test.flyway.flywaymigrationtest.models.Employee;

@RestController("/employees")
public class EmployeeController {

    @PostMapping
    public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee) {
        System.out.println(employee);
        System.out.println("Hello");
        ResponseEntity<Employee> responseEntity = ResponseEntity.ok(employee);
        return responseEntity;
    }

    @GetMapping("/{id}")
    public Employee getEmployee(@PathVariable("id") String employeeId) {
        System.out.println("Bye");
        return new Employee();
    }
}
