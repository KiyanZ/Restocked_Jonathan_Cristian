package com.example.producto2.repository;

import com.example.producto2.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductosRepository extends JpaRepository<Producto, Long> {
}
