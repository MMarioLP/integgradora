package com.gestion.utng.models;


import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="jornada")
public class JornadaModel {
    

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true,nullable=false)
    private Long idjornada;
   

   
    


    public Long getIdjornada() {
        return idjornada;
    }


    public void setIdjornada(Long idjornada) {
        this.idjornada = idjornada;
    }


    @Column(nullable=false)
    private String nomJornada;


     @Column(nullable=false)
    private Date fecha;



    private String Jornadacol;


   

    public String getnomJornada() {
        return nomJornada;
    }


    public void setNomJornada(String nomJornada) {
       this.nomJornada = nomJornada;
    }


    public Date getFecha() {
        return fecha;
    }


    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }


   


    public String getJornadacol() {
        return Jornadacol;
    }


    public void setJornadacol(String jornadacol) {
        Jornadacol = jornadacol;
    } 


}
