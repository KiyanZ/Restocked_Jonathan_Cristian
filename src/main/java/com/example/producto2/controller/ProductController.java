package com.example.producto2.controller;

import com.example.producto2.model.Producto;
import com.example.producto2.repository.ProductosRepository;
import com.example.producto2.service.menuService.ProductosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller
@RequestMapping(path = "/productos")
public class ProductController {
    @Autowired
    private ProductosService productosService;

    @GetMapping(value = "/agregar")
    public String agregarProducto(Model model) {
        model.addAttribute("producto", new Producto());
        return "agregar_producto";
    }

    @GetMapping(value = "/mostrar")
    public String mostrarProductos(Model model) {
        model.addAttribute("productos", productosService.findAll());
        return "productos";
    }

    @GetMapping(value = "/")
    public String productos(Model model) {
        model.addAttribute("productos", productosService.findAll());
        return "productos";
    }

    @GetMapping(value = "/eliminar/{id}")
    public String eliminarProducto(@PathVariable("id") long id, RedirectAttributes redirectAttrs) {
        productosService.delete(id);
        redirectAttrs
                .addFlashAttribute("mensaje", "Agregado correctamente")
                .addFlashAttribute("clase", "success");
        return "redirect:/productos/mostrar";
    }

    @PostMapping(value = "/editar")
    public String actualizarProducto(@ModelAttribute Producto producto, RedirectAttributes redirectAttrs) {
        productosService.update(producto);
        redirectAttrs
                .addFlashAttribute("mensaje", "Editado correctamente")
                .addFlashAttribute("clase", "success");
        return "redirect:/productos/mostrar";
    }

    @GetMapping(value = "/editar/{id}")
    public String mostrarFormularioEditar(@PathVariable Long id, Model model) {
        model.addAttribute("producto", productosService.findById(id));
        return "editProduct";
    }

    @PostMapping(value = "/agregar")
    public String guardarProducto(@ModelAttribute Producto producto, RedirectAttributes redirectAttrs) {
        productosService.create(producto);
        redirectAttrs
                .addFlashAttribute("mensaje", "Agregado correctamente")
                .addFlashAttribute("clase", "success");
        return "redirect:/productos/mostrar";
    }
}
