package com.example.producto2.model;


import javax.persistence.*;

@Entity
@Table(name= "Marca")

public class Marca {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;

    private String name;

    public Marca(String name) {
        this.setName(name);
    }

    public Marca(){

    }

    public Long getId() {return id; }

    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }
}