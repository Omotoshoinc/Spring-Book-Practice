package com.abdullah.spring.boot.practice.controller;

import com.abdullah.spring.boot.practice.entity.Department;

import java.util.List;

public interface DepartmentService {
   public Department saveDepartment(Department department);

    public List<Department> fetchDepartmentList();

    public Department fetchDepartmentByID(Long departmentId);

    public void deleteDepartmentById(Long departmentId);

    public Department updateDepartment(Long departmentId, Department department);

    Department fetchDepartmentByName(String departmentName);
}
