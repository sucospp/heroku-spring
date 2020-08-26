package com.springdesarrolladores.springdesarrolladores.repository;

import java.util.ArrayList;
import java.util.List;

import com.springdesarrolladores.springdesarrolladores.models.Persona;

import org.springframework.stereotype.Repository;

@Repository
public class IRegistroRepoImpl implements IRegistroRepo {
    private List<Persona> Lista = new ArrayList<Persona>();
    String mensaje = "";

    @Override
    public List<Persona> obtenerLista() {

        return this.Lista;
    }

    @Override
    public String agregarPersona(Persona persona) {
        if (buscarPersona(persona.getId()) < 0) {
            this.Lista.add(persona);
            mensaje = "Ingresado Correctamente";
        } else {
            mensaje = "Ya existe un registro con ese identificador";
        }

        return mensaje;
    }

    @Override
    public String modificarPersona(Persona persona) {
        int indice = buscarPersona(persona.getId());
        if (indice >= 0) {
            this.Lista.set(indice, persona);
            mensaje = "Desarrollador modificado correctamente";
        } else {
            mensaje = "Ese Desarrollador no existe";
        }

        return mensaje;
    }

    @Override
    public String eliminarPersona(int idPersona) {
        int indice = buscarPersona(idPersona);
        if (indice >= 0) {
            this.Lista.remove(indice);
            mensaje = "Desarrollador eliminado correctamente";

        } else {
            mensaje = "no existe ese Desarrollador";
        }

        return mensaje;
    }

    @Override
    public int buscarPersona(int idPersona) {
        int indice = -1;
        for (Persona persona : this.Lista) {

            if (persona.getId() == idPersona) {
                indice = this.Lista.indexOf(persona);
            }
        }
        return indice;
    }

}