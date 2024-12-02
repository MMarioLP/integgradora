package com.gestion.utng.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ResultadoJoranda")
public class ResultadoModel {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true,nullable=false)
    private Long numcarrera;



    @Column(nullable=false)
    private String pordicionc;



    public Long getNumcarrera() {
        return numcarrera;
    }



    public void setNumcarrera(Long numcarrera) {
        this.numcarrera = numcarrera;
    }



    public String getPordicionc() {
        return pordicionc;
    }



    public void setPordicionc(String pordicionc) {
        this.pordicionc = pordicionc;
    }


    
}
