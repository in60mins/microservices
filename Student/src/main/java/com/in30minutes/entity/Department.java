package com.in30minutes.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Department {

    private String departmentName;
    private String departmentAddress;
    private String departmentCode;
}
