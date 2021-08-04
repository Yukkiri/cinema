package ru.puchkova.restcinemahometask.data.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class CinemaEntity {

    @Id
    @GeneratedValue
    private Long id;
}
