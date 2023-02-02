package com.example.producto2.model;

import javax.persistence.*;

@Entity
@Table(name= "Usuario")


public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;

    private String name;

    private String surname;

    private String email;
    private int telephone;

    public Usuario(String name, String surname, String email, int telephone) {
        this.setName(name);
        this.setSurname(surname);
        this.setEmail(email);
        this.setTelephone(telephone);

    }

    public Usuario(){
    }

    public Long getId() {return id; }

    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getTelephone() { return telephone; }

    public void setTelephone(int telephone) { this.telephone = telephone; }
}
