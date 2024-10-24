package com.in30minutes.controller;

import com.in30minutes.entity.Student;
import com.in30minutes.entity.StudentVO;
import com.in30minutes.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
@AllArgsConstructor
public class StudentController {

    StudentService studentService;

    @PostMapping("/save")
    public Student saveS(@RequestBody Student student){
        return studentService.saveStudent(student);
    }

    @GetMapping("/{id}")
    public StudentVO getById(@PathVariable Long id){
        return studentService.getByIdWithDepartmentId(id);
    }
}
