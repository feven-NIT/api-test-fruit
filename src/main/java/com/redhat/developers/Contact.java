package com.redhat.developers;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity(name="contact")
public class Contact extends PanacheEntity {

    public String name;

    public String test;

    @ManyToMany(mappedBy = "contact")
    @JsonBackReference
    public List<Fruit> fruit;
    
}
