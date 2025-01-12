package com.domain;

import lombok.*;
import lombok.experimental.FieldDefaults;

import jakarta.persistence.*;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@Entity
public class Man {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    int age;

    String name;

    @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    @JoinColumn(name = "FK_Man_Phone")
    Phone phone;
}
