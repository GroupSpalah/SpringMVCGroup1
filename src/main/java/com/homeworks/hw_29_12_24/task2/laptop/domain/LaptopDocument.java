package com.homeworks.hw_29_12_24.task2.laptop.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.homeworks.hw_29_12_24.task2.laptop.mongo_config.ObjectIdSerializer;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.codecs.pojo.annotations.BsonId;
import org.bson.types.ObjectId;

import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LaptopDocument {

    @BsonId
    @JsonSerialize(using = ObjectIdSerializer.class)
    private ObjectId id;
    private String model;
    private String manufacturer;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate releaseDate;
    private int ramCapacity;
    private int ssdCapacity;
    private String processor;

    @Override
    public String toString() {
        return
                "\n| id=" + id +
                        " | model='" + model + '\'' +
                        " | manufacturer='" + manufacturer + '\'' +
                        " | releaseDate='" + releaseDate + '\'' +
                        " | RAMCapacity=" + ramCapacity +
                        " | SSDCapacity=" + ssdCapacity +
                        " | processor='" + processor + '\'' +
                        " |" +
                        "\n------------------------------------------------------------------------------------------------" +
                        "------------------------------------------------------------";
    }
}
