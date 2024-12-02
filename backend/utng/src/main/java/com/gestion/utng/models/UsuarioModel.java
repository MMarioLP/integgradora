package com.gestion.utng.models;

import javax.persistence.*;


@Entity
@Table(name="usuario")
public class UsuarioModel {
    /**
     *
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true,nullable=false)
    private Long idUsuario;

    @Column(unique = true, nullable = false)
    private String userName;

    @Column(nullable=false)
    private String nomUsuario;

    @Column(nullable=false)
    private String appPaterno;

    @Column(nullable=false)
    private String appMaterno;

    @Column(nullable=false)
    private String numTelefono;

    @Column(nullable=false)
    private String correoElec;

    @Column(nullable=false)
    private int edad;

    @Column(nullable=false)
    private Integer clave;

    @Column(nullable=false)
    private String contrasenia;

    
    @Column(nullable=false)
    private String rol;


    public Long getIdUsuario() {
        return idUsuario;
    }


    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }


    public String getUserName() {
        return userName;
    }


    public void setUserName(String userName) {
        this.userName = userName;
    }


    public String getNomUsuario() {
        return nomUsuario;
    }


    public void setNomUsuario(String nomUsuario) {
        this.nomUsuario = nomUsuario;
    }


    public String getAppPaterno() {
        return appPaterno;
    }


    public void setAppPaterno(String appPaterno) {
        this.appPaterno = appPaterno;
    }


    public String getAppMaterno() {
        return appMaterno;
    }


    public void setAppMaterno(String appMaterno) {
        this.appMaterno = appMaterno;
    }


    public String getNumTelefono() {
        return numTelefono;
    }


    public void setNumTelefono(String numTelefono) {
        this.numTelefono = numTelefono;
    }


    public String getCorreoElec() {
        return correoElec;
    }


    public void setCorreoElec(String correoElec) {
        this.correoElec = correoElec;
    }


    public int getEdad() {
        return edad;
    }


    public void setEdad(int edad) {
        this.edad = edad;
    }


    public Integer getClave() {
        return clave;
    }


    public void setClave(Integer clave) {
        this.clave = clave;
    }


    public String getContrasenia() {
        return contrasenia;
    }


    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }


    public String getRol() {
        return rol;
    }


    public void setRol(String rol) {
        this.rol = rol;
    }


    }
    

