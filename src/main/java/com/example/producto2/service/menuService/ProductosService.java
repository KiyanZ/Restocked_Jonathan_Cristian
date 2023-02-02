package com.example.producto2.service.menuService;

import com.example.producto2.repository.ProductosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.producto2.model.Producto;

import java.util.Optional;


@Service
public class ProductosService implements IProductosService {
    @Autowired
    private ProductosRepository productosRepository;

    public Object findAll() {
        return this.productosRepository.findAll();
    }

    @Override
    public Optional<Producto> findById(Long id) {
        return productosRepository.findById(id);
    }

    @Override
    public Producto create(Producto producto) {
        return productosRepository.save(producto);
    }

    @Override
    public Producto update(Producto producto) {
        Producto currentProducto = productosRepository.findById(producto.getId()).get();
        currentProducto.setPrice(producto.getPrice());
        currentProducto.setName(producto.getName());
        currentProducto.setDescripcion(producto.getDescripcion());
        return productosRepository.save(currentProducto);
    }
    @Override
    public void delete(Long id) {
        Optional<Producto> producto = productosRepository.findById(id);
        System.out.println(producto);
        productosRepository.deleteById(id);
    }

}
