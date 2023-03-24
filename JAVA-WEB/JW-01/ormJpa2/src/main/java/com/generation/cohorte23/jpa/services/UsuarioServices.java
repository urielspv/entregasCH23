package com.generation.cohorte23.jpa.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.generation.cohorte23.jpa.models.UsuarioModel;
import com.generation.cohorte23.jpa.repositories.UsuarioRepositorio;

@Service
public class UsuarioServices {

    @Autowired
    UsuarioRepositorio usuarioRepository;

    public ArrayList<UsuarioModel> listarUsuarios() {
        return (ArrayList<UsuarioModel>) usuarioRepository.findAll();
    }
    
    public UsuarioModel guardarUsuario(UsuarioModel usuario) {
        return usuarioRepository.save(usuario);
    }
    
     public ArrayList<UsuarioModel> obtenerPorPrioridad (Integer prioridad) {
      return usuarioRepository.findByPrioridad(prioridad); 
      }
}