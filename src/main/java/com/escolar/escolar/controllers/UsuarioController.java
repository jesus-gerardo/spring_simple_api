package com.escolar.escolar.controllers;

import java.util.ArrayList;
import java.util.Optional;

import com.escolar.escolar.models.UsuarioModel;
import com.escolar.escolar.service.UsuarioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    @Autowired
    UsuarioService usuarioService;

    @GetMapping("")
    public ArrayList<UsuarioModel> index(){
        return usuarioService.ObtenerUsuarios();
    }

    @GetMapping(path ="/{id}")
    public Optional<UsuarioModel> find(@PathVariable("id") Long id){
        return usuarioService.find(id);
    }

    @PostMapping("")
    public UsuarioModel store(@RequestBody UsuarioModel usuario){
        return usuarioService.store(usuario);
    }

    @DeleteMapping(path="/{id}")
    public String remove(@PathVariable("id") Long id){
        boolean ok = usuarioService.remove(id);
        if(ok){
            return "Usuario eliminado";
        }else{
            return "Error al eliminar el usuario";
        }
    }
}
