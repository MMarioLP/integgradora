package com.gestion.utng.controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gestion.utng.models.UsuarioModel;
import com.gestion.utng.services.UsuarioService;

@CrossOrigin(  origins = {"http://localhost"} )
@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    
    @Autowired
    UsuarioService usuarioService;

    @GetMapping()
    public  ArrayList <UsuarioModel> obtenerUsuarios(){
     return usuarioService.obtenerUsuarios();

    }

    @PostMapping()
    public UsuarioModel guardarUsuario(@RequestBody UsuarioModel usuario){
            return this.usuarioService.guardarUsuario(usuario);

    }

    @GetMapping( path = "/{id}")
    public Optional<UsuarioModel> obtenerUsuarioPorId(@PathVariable("id") Long id){
        return this.usuarioService.ObtenerPorId(id);

    }
    @GetMapping("/query")
    public ArrayList<UsuarioModel> ObtenerPorClave(@RequestParam("Clave") Integer clave){
        return this.usuarioService.ObtenerPorClave(clave);
    }

    @DeleteMapping( path = "/{id}")
    public String  eliminarPorId(@PathVariable ("id") Long id){
        boolean ok = this.usuarioService.eliminarUsuario(id);
        if (ok) {
            return "Se elimino el usuario con id:" + id;
        } else{
            return "No se pudo eliminar el usuario con id: " + id;
        }
    }

    }
