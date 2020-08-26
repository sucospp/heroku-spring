package com.springdesarrolladores.springdesarrolladores.service;

import java.util.List;

import com.springdesarrolladores.springdesarrolladores.models.Persona;

public interface IRegistroService {

    List<Persona> obtenerLista() throws Exception;

    String agregarPersona(Persona persona) throws Exception;

    String modificarPersona(Persona persona) throws Exception;

    String eliminarPersona(int idPersona) throws Exception;

    int buscarPersona(int idPersona) throws Exception;

}