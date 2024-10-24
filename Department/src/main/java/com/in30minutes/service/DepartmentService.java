package com.in30minutes.service;

import com.in30minutes.entity.Department;
import com.in30minutes.repository.DepartmentRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class DepartmentService {

    DepartmentRepo departmentRepo;

    public Department save(Department department){
        return departmentRepo.save(department);
    }

    public Department getById(Long id){
        return departmentRepo.findById(id).get();
    }
}
