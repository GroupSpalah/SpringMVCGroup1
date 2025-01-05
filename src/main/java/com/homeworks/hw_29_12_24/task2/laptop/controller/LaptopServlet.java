/*
package com.homeworks.hw_29_12_24.task2.laptop.controller;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.bson.types.ObjectId;
import org.example.homeworks.hw_01_12_24.laptop.domain.LaptopDocument;
import org.example.homeworks.hw_01_12_24.laptop.service.LaptopService;
import org.example.homeworks.hw_01_12_24.laptop.service.impl.LaptopServiceImpl;

import java.io.BufferedReader;
import java.io.IOException;

import static org.example.homeworks.hw_01_12_24.config.ObjectMapperProvider.OBJECT_MAPPER;
import static org.example.homeworks.hw_01_12_24.laptop.util.ConstantsUtil.*;
import static org.example.homeworks.hw_01_12_24.laptop.util.UtilData.COMMANDS_MAP;

@WebServlet(urlPatterns = FRONT_CONTROLLER_SERVLET_ALL_VARIATION)
public class LaptopServlet extends HttpServlet {

    private static final LaptopService<LaptopDocument, ObjectId> LAPTOP_SERVICE = new LaptopServiceImpl();

    //update ++
    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        BufferedReader reqReader = req.getReader();//id != 0

        LaptopDocument laptopDocument = OBJECT_MAPPER.readValue(reqReader, LaptopDocument.class);

        LAPTOP_SERVICE.update(laptopDocument);

        // Відправка відповіді клієнту
        resp.setStatus(HttpServletResponse.SC_OK);
        resp.getWriter().write("Laptop updated successfully");

    }

    //findAll ++
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        //use pattern Command & FrontController for doGet
        commandProcess(req, resp);
    }

    //save ++
    */
/**
     * {
     * "model": "Yoga Slim 30",
     * "manufacturer": "Lenovo",
     * "releaseDate": "2025-05-20",
     * "ramCapacity": "64",
     * "ssdCapacity": "2048",
     * "processor": "Intel Core i7-15999"
     * }
     *//*

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        BufferedReader reqReader = req.getReader();//id = 0

        LaptopDocument laptopDocument = OBJECT_MAPPER.readValue(reqReader, LaptopDocument.class);

        LAPTOP_SERVICE.addLaptop(laptopDocument);

        resp.setStatus(HttpServletResponse.SC_OK);
        resp.getWriter().write("Laptop added successfully");
    }

    //delete by id ++
    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) {

        String pathInfo = req.getPathInfo();

        String id = pathInfo.substring(1);

        LAPTOP_SERVICE.deleteById(id);
    }

    private void commandProcess(HttpServletRequest request, HttpServletResponse response) throws IOException {

        String requestURI = request.getRequestURI(); // /laptopServlet/getByRam

        String commandURL = requestURI.substring(requestURI.lastIndexOf("/") + 1); // getByRam

        Command command = COMMANDS_MAP.get(commandURL); // FindByRamCommand

        command.process(request, response);
    }
}
*/
