package com.entity;

import jakarta.persistence.*;


@Entity
@Table(name= "Groupp")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private short id;
    @Column(name = "name", length = 50, nullable = false, unique = true)
    private String name;
    public Department(){

    }
    public short getId(){
        return this.id;
    }
    public void setId(short id){
        this.id = id;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
