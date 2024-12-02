package com.gestion.utng.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gestion.utng.models.JornadaModel;
import com.gestion.utng.services.JornadaService;

@CrossOrigin(  origins = {"http://localhost"} )
@RestController
@RequestMapping("/jornada")
public class JornadaController {

    @Autowired
    JornadaService jornadaService;
    
    @GetMapping()
    public ArrayList<JornadaModel> obtenerJornada(){
        return jornadaService.obtenerJornada();
    }

    @PostMapping
    public JornadaModel guardarJornada(@RequestBody JornadaModel jornada){
        return this.jornadaService.guardarJornada(jornada);
    }

    @GetMapping("/query")
    public ArrayList<JornadaModel> obtenerPorId(@RequestParam("idjornada") Long idjornada){
        return this.jornadaService.obtenerPorId(idjornada);
    }

    
}
