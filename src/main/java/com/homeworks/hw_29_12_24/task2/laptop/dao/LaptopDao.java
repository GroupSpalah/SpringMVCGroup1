package com.homeworks.hw_29_12_24.task2.laptop.dao;

import  com.homeworks.hw_29_12_24.task2.laptop.domain.LaptopDocument;

import java.time.LocalDate;
import java.util.List;

public interface LaptopDao {

    void addLaptop(LaptopDocument laptop);

    LaptopDocument findById(String value);

    void printAllLaptop();

    List<LaptopDocument> filterByReleaseDate(LocalDate date);

    List<LaptopDocument> filterByTwoParam(String firstParam, String secondParam,
                                          Object firstValue, Object secondValue);

    List<LaptopDocument> filterByModel(String value);

    List<LaptopDocument> filerByProcessor(String value);

    List<LaptopDocument> filerByRam(int value);

    List<LaptopDocument> filterByDateManufacturerDateGraterThan(LocalDate date);

    void deleteById(String value);

    void deleteByProcessor(String value);

    void deleteByRamAndSsd(int ram, int ssd);

    void update(LaptopDocument laptop);

    List<LaptopDocument> getAllLaptop();
}