package com.homedirect.house.service;

import com.homedirect.house.model.EmployeeModel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeService {

    List<EmployeeModel> all();
    EmployeeModel create(EmployeeModel model);
    EmployeeModel get(Long id);
    EmployeeModel update(Long id, EmployeeModel model);
    void delete(Long id);
}
