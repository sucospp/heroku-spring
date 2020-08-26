package com.springdesarrolladores.springdesarrolladores.controller;

import java.util.List;

import com.springdesarrolladores.springdesarrolladores.models.Persona;
import com.springdesarrolladores.springdesarrolladores.service.IRegistroService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/developers")
public class RestControl {

    @Autowired
    IRegistroService repoRegistro;

    @GetMapping
    public List<Persona> listar() throws Exception {

        return repoRegistro.obtenerLista();

    }

    @PostMapping
    public String insertar(@RequestBody Persona persona) throws Exception {

        return repoRegistro.agregarPersona(persona);

    }

    @PutMapping(value = "/{id}")
    public String modificar(@RequestBody Persona persona) throws Exception {

        return repoRegistro.modificarPersona(persona);

    }

    @DeleteMapping(value = "/{id}")
    public String eliminar(@PathVariable("id") Integer idPersona) throws Exception {
        return repoRegistro.eliminarPersona(idPersona);

    }

}