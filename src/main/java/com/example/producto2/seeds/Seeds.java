package com.example.producto2.seeds;

import com.example.producto2.model.Producto;
import com.example.producto2.repository.ProductosRepository;

public class Seeds {
    private ProductosRepository productosRepository;

    public Seeds(ProductosRepository productosRepository) {this.productosRepository = productosRepository; }

    public void generateSeeds(){
        Producto productoGuitarra = new Producto("Guitarra","Nueva",1199.99);
        Producto productoGafas = new Producto("Gafas","Usadas",5.99);

        productosRepository.save(productoGuitarra);
        productosRepository.save(productoGafas);
    }

}
