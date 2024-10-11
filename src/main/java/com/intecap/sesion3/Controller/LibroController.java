package com.intecap.sesion3.Controller;


import com.intecap.sesion3.Model.LibroModel;
import com.intecap.sesion3.Model.ProductoModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Libro")
public class LibroController {
    
    @GetMapping
    public LibroModel listarLibros(){
        LibroModel nuevoLibro = new LibroModel();
        nuevoLibro.setColor("Rojo");
        nuevoLibro.setNombre("El primer libro");
        nuevoLibro.setPaginas(100);
        return nuevoLibro;
    }
}
