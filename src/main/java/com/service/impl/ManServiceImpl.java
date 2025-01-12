package com.service.impl;

import com.domain.Man;
import com.repository.ManRepository;
import com.service.CrudService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ManServiceImpl implements CrudService<Man> {

    ManRepository repository;

    @Override
    public void save(Man man) {
        repository.save(man);
    }

    @Override
    public void update(Man man) {
        repository.save(man);
    }

    @Override
    public void deleteById(int id) {
        repository.deleteById(id);
    }

    @Override
    public Man findById(int id) {
        return repository.findById(id).get();
    }
}
