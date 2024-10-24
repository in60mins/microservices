package com.in30minutes.service;

import com.in30minutes.entity.Department;
import com.in30minutes.entity.Student;
import com.in30minutes.entity.StudentVO;
import com.in30minutes.repository.StudentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@AllArgsConstructor
public class StudentService {

    private String baseURL = "http://localhost:8080/department/";

    StudentRepository studentRepository;
    RestTemplate restTemplate;

    public Student saveStudent(Student student){
        return studentRepository.save(student);
    }

    public StudentVO getByIdWithDepartmentId(Long id){
        Student student = studentRepository.findById(id).get();
        Department department = restTemplate
                .getForObject(baseURL+student.getDepartmentId(), Department.class);
        StudentVO st = new StudentVO();
        st.setDepartment(department);
        st.setStudent(student);
        return st;
    }
}
