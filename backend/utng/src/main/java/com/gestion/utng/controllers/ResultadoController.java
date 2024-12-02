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

import com.gestion.utng.models.ResultadoModel;
import com.gestion.utng.services.ResultadoService;


@CrossOrigin(  origins = {"http://localhost"} )
@RestController
@RequestMapping("/resultados")
public class ResultadoController {
 
    @Autowired
    ResultadoService resultadoService;
    
    @GetMapping()
    public ArrayList<ResultadoModel> obtenerResultados(){
        return resultadoService.obtenerResultados();
    }

    @PostMapping
    public ResultadoModel guardarResultado(@RequestBody ResultadoModel resultado){
        return this.resultadoService.guardarResultado(resultado);
    }

    @GetMapping("/query")
    public ArrayList<ResultadoModel> obtenerPorId(@RequestParam("numcarrera") Long numcarrera){
        return this.resultadoService.obtenerPorId(numcarrera);
    }

}