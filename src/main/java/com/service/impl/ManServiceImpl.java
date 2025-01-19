package com.service.impl;

import com.domain.Man;
import com.repository.ManRepository;
import com.service.CrudService;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ManServiceImpl implements CrudService<Man> {

    ManRepository repository;

    @Override
    public void save(Man man) {

        man.getEmails().forEach(email -> email.setMan(man));

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

    @Override
    public Man findByAgeAndName(int age, String name) {
        return repository.findByNameAndAge(name, age);
    }

    @Override
    public List<Man> usePagination(int page, int size) {

        PageRequest request = PageRequest.of(page, size);

        List<Man> all = repository.findAll(request).getContent();

        return all;
    }
}
