package com.redhat.developers;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.JoinColumn;


import io.quarkus.hibernate.orm.panache.PanacheEntity;


@Entity(name="fruit")
public class Fruit extends PanacheEntity {

    @Column(name="name")
    public String name;

    @Column(name="season")
    public String season;
    
    @ManyToMany
    @JoinTable(
        name = "fruit_contact",
        joinColumns = @JoinColumn(name = "fruit_id"),
        inverseJoinColumns = @JoinColumn(name = "contact_id"))
    @JsonManagedReference
    public List<Contact> contact; 

    public static List<Fruit> findBySeason(String season) {
        return find("season", season).list();
    }

}