package com.company;

import java.util.List;

public class Curso {

    private List<Alumna> alumnas;
    private String nombreProfe;
    private List<Clase> impartidas;

    public Curso() {

    }

    public List<Alumna> getAlumnas() {
        return alumnas;
    }

    public void setAlumnas(List<Alumna> alumnas) {
        this.alumnas = alumnas;
    }

    public String getNombreProfe() {
        return nombreProfe;
    }

    public void setNombreProfe(String nombreProfe) {
        this.nombreProfe = nombreProfe;
    }

    public List<Clase> getImpartidas() {
        return impartidas;
    }

    public void setImpartidas(List<Clase> impartidas) {
        this.impartidas = impartidas;
    }
}
