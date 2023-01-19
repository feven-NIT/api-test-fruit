package com.redhat.developers;

import javax.persistence.Column;
import javax.persistence.Entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity(name="fruit_contact")
public class FruitContact extends PanacheEntity{

    @Column(name="fruit_id")
    public Long fruit_id;

    @Column(name = "contact_id")
    public Long contact_id;
    
}
