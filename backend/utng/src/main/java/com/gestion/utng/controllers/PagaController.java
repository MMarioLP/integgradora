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

import com.gestion.utng.models.PagaModel;
import com.gestion.utng.services.PagaService;


@CrossOrigin(  origins = {"http://localhost"} )
@RestController
@RequestMapping("/paga")
public class PagaController {

    @Autowired
    PagaService pagaService;
    
    @GetMapping()
    public ArrayList<PagaModel> obtenerPaga(){
        return pagaService.obtenerPaga();
    }

    @PostMapping
    public PagaModel guardarPaga(@RequestBody PagaModel paga){
        return this.pagaService.guardarPaga(paga);
    }

    @GetMapping("/query")
    public ArrayList<PagaModel> obtenerPorId(@RequestParam("idpaga") Long idpaga){
        return this.pagaService.obtenerPorId(idpaga);
    }


}
