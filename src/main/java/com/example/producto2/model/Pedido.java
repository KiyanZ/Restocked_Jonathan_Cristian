package com.example.producto2.model;

import javax.persistence.*;

@Entity
@Table(name="Pedido")

public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;
    private String numeroPedido;
    private String direccion;

    public Pedido(String numeroPedido, String direccion){
        this.setDireccion(direccion);
        this.setNumeroPedido(numeroPedido);
    }

    public Pedido(){

    }
    public Long getId() {
        return id;
    }
    public void setId(Long id){
        this.id = id;
    }
    public String getNumeroPedido(){
        return numeroPedido;
    }
    public void setNumeroPedido(String numeroPedido){
        this.numeroPedido = numeroPedido;
    }
    public String getDireccion(){
        return direccion;
    }
    public void setDireccion(String direccion){
        this.direccion = direccion;
    }
}
