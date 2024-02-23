package ru.practicum.java.cohort30.querydsl.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder(toBuilder = true)
@AllArgsConstructor
public class UserFilterModel {

    private String search;

    private String email;

    private Integer ageMin;

    private Integer ageMax;
}
