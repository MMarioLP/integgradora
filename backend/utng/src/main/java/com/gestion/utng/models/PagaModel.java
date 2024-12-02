package com.gestion.utng.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="paga")
public class PagaModel {

    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true,nullable=false)
    private Long idpaga;

    public Long getIdpaga() {
        return idpaga;
    }

    public void setIdpaga(Long idpaga) {
        this.idpaga = idpaga;
    }

    @Column(nullable=false)
    private Long NoTarjeta;


    @Column(nullable=false)
    private Long Monto;

 

    public Long getNoTarjeta() {
        return NoTarjeta;
    }

    public void setNoTarjeta(Long noTarjeta) {
        NoTarjeta = noTarjeta;
    }


    public Long getMonto() {
        return Monto;
    }

    public void setMonto(Long monto) {
        Monto = monto;
    }
    

   
                    



    
}
