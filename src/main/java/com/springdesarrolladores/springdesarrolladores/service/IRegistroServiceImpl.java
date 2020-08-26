package com.springdesarrolladores.springdesarrolladores.service;

import java.util.List;

import com.springdesarrolladores.springdesarrolladores.models.Persona;
import com.springdesarrolladores.springdesarrolladores.repository.IRegistroRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IRegistroServiceImpl implements IRegistroService {

    @Autowired
    IRegistroRepo repo;

    @Override
    public List<Persona> obtenerLista() throws Exception {
        return repo.obtenerLista();
    }

    @Override
    public String agregarPersona(Persona persona) throws Exception {
        return repo.agregarPersona(persona);
    }

    @Override
    public String modificarPersona(Persona persona) throws Exception {
        return repo.modificarPersona(persona);
    }

    @Override
    public String eliminarPersona(int idPersona) throws Exception {
        return repo.eliminarPersona(idPersona);
    }

    @Override
    public int buscarPersona(int idPersona) throws Exception {
        return repo.buscarPersona(idPersona);
    }

}