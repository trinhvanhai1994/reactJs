package com.homedirect.house.transformer;

import com.homedirect.house.entity.Employee;
import com.homedirect.house.model.EmployeeModel;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class EmployeeTransformer {

    public Employee toEntity(EmployeeModel model) {
        Employee entity = new Employee();

        entity.setName(model.getName());
        entity.setPhone(model.getPhone());
        entity.setSalary(model.getSalary());
        entity.setCreated(new Date());

        return entity;
    }

    public EmployeeModel toModel(Employee entity) {
        EmployeeModel model = new EmployeeModel();

        model.setId(entity.getId());
        model.setName(entity.getName());
        model.setPhone(entity.getPhone());
        model.setSalary(entity.getSalary());
        model.setCreated(entity.getCreated().getTime());

        return model;
    }

    public void update(Employee entity, EmployeeModel model) {
        entity.setName(model.getName());
        entity.setPhone(model.getPhone());
        entity.setSalary(model.getSalary());
    }
}
