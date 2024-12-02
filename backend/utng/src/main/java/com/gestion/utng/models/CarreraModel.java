package com.gestion.utng.models;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="carrera")
public class CarreraModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true,nullable=false)
    private Long idcarrera;


    public Long getIdcarrera() {
        return idcarrera;
    }

    public void setIdcarrera(Long idcarrera) {
        this.idcarrera = idcarrera;
    }

    @Column(nullable=false)
    private Long NoTarjeta;

    @Column(nullable=false)
    private String  NomCarrera;

   

    public Long getNoTarjeta() {
        return NoTarjeta;
    }

    public void setNoTarjeta(Long noTarjeta) {
        NoTarjeta = noTarjeta;
    }

    public String getNomCarrera() {
        return NomCarrera;
    }

    public void setNomCarrera(String nomCarrera) {
        NomCarrera = nomCarrera;
    }

    
    
    
}
