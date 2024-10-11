package com.intecap.sesion3.Controller;

import com.intecap.sesion3.Model.ProductoModel;
import com.intecap.sesion3.Model.UsuarioModel;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @GetMapping("/Primer")
    public UsuarioModel listarUsuarios(){
        UsuarioModel nuevoUsuario = new UsuarioModel();
        nuevoUsuario.setNombre("Kevin");
        nuevoUsuario.setDireccion("15 avenida");
        return nuevoUsuario;
    }

    @GetMapping("/Lista")
    public List<UsuarioModel> listarUsuario(){
        List<UsuarioModel> listaUsuarios = new ArrayList<>();
        listaUsuarios.add(new UsuarioModel("Kevin", 3234));
        listaUsuarios.add(new UsuarioModel("Yopororo", 35434));
        listaUsuarios.add(new UsuarioModel("James", 1554));
        return  listaUsuarios;
    }

    /*@GetMapping("/{nombre}")
    public List<UsuarioModel> listarUsuarioPorNombre(@PathVariable("nombre") String nombre){
        List<UsuarioModel> listaUsuarios = new ArrayList<>();
        listaUsuarios.add(new UsuarioModel("Kevin", 3234));
        listaUsuarios.add(new UsuarioModel("Yopororo", 35434));
        listaUsuarios.add(new UsuarioModel("James", 1554));

        return listaUsuarios.stream()
                .filter(usuario -> usuario.getNombre() == nombre)
                .findFirst()
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Producto no encontrado"));


    } */


}
