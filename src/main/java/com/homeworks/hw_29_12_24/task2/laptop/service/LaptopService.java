package com.homeworks.hw_29_12_24.task2.laptop.service;

import java.time.LocalDate;
import java.util.List;

public interface LaptopService<T, ID> {
    void addLaptop(T laptop);

    T findById(String id);

    void printAllLaptop();

    List<T> filterByReleaseDate(LocalDate date);

    List<T> filterByDateManufacturerDateGraterThan(LocalDate date);

    List<T> filterByTwoParam(String firstParam, String secondParam,
                          Object firstValue, Object secondValue);

    List<T> filterByModel(String value);

    List<T> filerByProcessor(String value);

    List<T> filerByRam(int value);

    void deleteById(String value);

    void deleteByProcessor(String value);

    void deleteByRamAndSsd(int firstParam, int secondParam);

    void update(T laptop);

    List<T> getAllLaptop();
}
