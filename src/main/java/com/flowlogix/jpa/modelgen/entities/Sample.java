package com.flowlogix.jpa.modelgen.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.io.Serializable;

@Entity
public class Sample implements Serializable {
    @Id
    @GeneratedValue
    Long key;
}
