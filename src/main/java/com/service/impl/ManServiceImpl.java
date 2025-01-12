package com.service.impl;

import com.domain.Man;
import com.service.CrudService;
import org.springframework.stereotype.Service;

@Service
public class ManServiceImpl implements CrudService {
    @Override
    public void save(Man man) {
        System.out.println("save");
    }
}
