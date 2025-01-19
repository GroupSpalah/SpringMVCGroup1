package com.repository;

import com.domain.Man;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ManRepository extends JpaRepository<Man, Integer> {
    Man findByName(String name);
    void deleteById(int id);
    //Man findById(int id);

    Man findByNameAndAge(String name, int age);
}
