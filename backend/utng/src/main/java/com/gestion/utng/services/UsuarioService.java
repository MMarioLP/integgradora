package com.gestion.utng.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gestion.utng.models.UsuarioModel;
import com.gestion.utng.repositories.UsuarioRepository;

@Service
@Transactional
public class UsuarioService {
    



    @Autowired
    UsuarioRepository usuarioRepository;

    public  ArrayList <UsuarioModel> obtenerUsuarios(){
        return ( ArrayList <UsuarioModel>) usuarioRepository.findAll();
    }

    
    public UsuarioModel guardarUsuario (UsuarioModel usuario){
        return usuarioRepository.save(usuario);

}


    public Optional <UsuarioModel> ObtenerPorId(Long id){
        return usuarioRepository.findById(id);


    }

    public ArrayList<UsuarioModel> ObtenerPorClave(Integer clave){
        return usuarioRepository.findByClave(clave);

    }

    public boolean eliminarUsuario(Long id){
        try{
            usuarioRepository.deleteById(id);
            return true;
        }catch(Exception err){
            return false;
        }


    }

    //------------------------------------------------------
    

    

}