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
public class Phone {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;

    String number;
}
