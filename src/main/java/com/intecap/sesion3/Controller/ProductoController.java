package com.intecap.sesion3.Controller;

import com.intecap.sesion3.Model.ProductoModel;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/producto")
public class ProductoController {


    @GetMapping("/primer")
    public ProductoModel listarProducto(){
        ProductoModel nuevoProducto = new ProductoModel();
        nuevoProducto.setNombre("Manzana");
        nuevoProducto.setCantidad("2");
        nuevoProducto.setColor("rojo");
        return (nuevoProducto);
    }

    @GetMapping("/lista")
    public List<ProductoModel> listarProductos(){
        List<ProductoModel> listaProductos = new ArrayList<>();
        listaProductos.add(new ProductoModel(1,"Manzana", "Roja", "4"));
        listaProductos.add(new ProductoModel(2, "Manzana", "Verde", "2"));
        listaProductos.add(new ProductoModel(3, "Pera", "Verde", "3"));
        return listaProductos;
    }

    @GetMapping("/{id}")
    public ProductoModel listarProductosxId(@PathVariable("id") int idProducto){
        List<ProductoModel> listaProductos = new ArrayList<>();
        listaProductos.add(new ProductoModel(1,"Manzana", "Roja", "4"));
        listaProductos.add(new ProductoModel(2, "Manzana", "Verde", "2"));
        listaProductos.add(new ProductoModel(3, "Pera", "Verde", "3"));

        return listaProductos.stream()
                .filter(producto -> producto.getIdProducto() == idProducto)
                .findFirst()
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Producto no encontrado"));

    }

    @GetMapping("/buscar/{nombre}")
    public ProductoModel listarProductosXNombre(@PathVariable("nombre") String nombre){
        ProductoModel nuevoProducto = new ProductoModel();
        nuevoProducto.setNombre(nombre);
        nuevoProducto.setIdProducto(4);
        nuevoProducto.setColor("Morado");
        nuevoProducto.setCantidad("5");
        return nuevoProducto;
    }

    @GetMapping("/insertar")
    public ProductoModel insertarProducto(@RequestParam("id") int idProducto, @RequestParam("Nombre") String nombreProducto,
                                          @RequestParam("color") String color, @RequestParam("cantidad") String cantidad){
        ProductoModel nuevoProducto = new ProductoModel();
        nuevoProducto.setCantidad(cantidad);
        nuevoProducto.setIdProducto(idProducto);
        nuevoProducto.setColor(color);
        nuevoProducto.setNombre(nombreProducto);

        return  nuevoProducto;

    }
}
