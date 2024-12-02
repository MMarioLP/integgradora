package com.gestion.utng.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="caballo")
public class CaballoModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true,nullable=false)
    private Long idcaballo;


    public Long getIdcaballo() {
        return idcaballo;
    }


    public void setIdcaballo(Long idcaballo) {
        this.idcaballo = idcaballo;
    }


    @Column(nullable=false)
    private String nomcaballo;




    public String getnomcaballo() {
        return nomcaballo;
    }


    public void setNomcaballo(String nomcaballo) {
        this.nomcaballo = nomcaballo;
    }


}