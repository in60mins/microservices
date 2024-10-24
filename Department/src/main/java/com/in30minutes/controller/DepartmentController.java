package com.in30minutes.controller;

import com.in30minutes.entity.Department;
import com.in30minutes.service.DepartmentService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/department")
public class DepartmentController {

    DepartmentService departmentService;

    @PostMapping("/save")
    public Department saveDepartment(@RequestBody Department department){
        return departmentService.save(department);
    }

    @GetMapping("/{id}")
    public Department findById(@PathVariable Long id){
        return departmentService.getById(id);
    }
}
