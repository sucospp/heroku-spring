package com.springdesarrolladores.springdesarrolladores.models;

public class Persona {

    private int Id;

    private String Nombre;

    private String Linkgit;

    private String[] Tecnologia;

    public int getId() {
        return Id;
    }

    public void setId(final int id) {
        this.Id = id;
    }

    public void setNombre(final String nombre) {
        this.Nombre = nombre;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getLinkgit() {
        return this.Linkgit;
    }

    public void setLinkgit(String Linkgit) {
        this.Linkgit = Linkgit;
    }

    public String[] getTecnologia() {
        return this.Tecnologia;
    }

    public void setTecnologia(String[] Tecnologia) {
        this.Tecnologia = Tecnologia;
    }

}