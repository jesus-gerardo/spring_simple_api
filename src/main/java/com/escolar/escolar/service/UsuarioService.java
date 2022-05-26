package com.escolar.escolar.service;

import java.util.ArrayList;
import java.util.Optional;

import com.escolar.escolar.models.UsuarioModel;
import com.escolar.escolar.repositories.UsuarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
    @Autowired
    UsuarioRepository usuarioRepository;

    public ArrayList<UsuarioModel> ObtenerUsuarios(){
        return (ArrayList<UsuarioModel>) usuarioRepository.findAll();
    }

    public UsuarioModel store(UsuarioModel usuario){
        return usuarioRepository.save(usuario);
    }

    public Optional<UsuarioModel> find(Long id){
        return usuarioRepository.findById(id);
    }

    public boolean remove(Long id){
        try{
            usuarioRepository.deleteById(id);
            return true;
        }catch(Exception e){
            return false;
        }
    }


    // aqui hirian loas de mas funciones
    // guardar usuario
    // editar usuario
    // eliminarusuario
} 
