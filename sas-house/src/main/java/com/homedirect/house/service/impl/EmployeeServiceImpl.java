package com.homedirect.house.service.impl;

import com.homedirect.house.entity.Employee;
import com.homedirect.house.model.EmployeeModel;
import com.homedirect.house.repository.EmployeeRepository;
import com.homedirect.house.service.EmployeeService;
import com.homedirect.house.transformer.EmployeeTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private @Autowired EmployeeRepository repo;
    private @Autowired EmployeeTransformer transformer;

    @Override
    public List<EmployeeModel> all() {
        return repo.findAll().stream().map(transformer::toModel).collect(Collectors.toList());
    }

    @Override
    public EmployeeModel create(EmployeeModel model) {
        Employee entity = transformer.toEntity(model);
        repo.save(entity);
        return transformer.toModel(entity);
    }

    @Override
    public EmployeeModel get(Long id) {
        Employee entity = repo.findById(id).get();
        return transformer.toModel(entity);
    }

    @Override
    public EmployeeModel update(Long id, EmployeeModel model) {
        Employee entity = repo.findById(id).get();
        transformer.update(entity, model);
        return transformer.toModel(entity);
    }

    @Override
    public void delete(Long id) {
        repo.deleteById(id);
    }
}
