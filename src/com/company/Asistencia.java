package com.company;

public class Asistencia {
    private String tipo;
    private Clase clase;

    public Asistencia(String tipo, Clase clase) {
        this.tipo = tipo;
        this.clase = clase;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

     public String nroClaseAsis(){
       return clase.getNroClase();
    }
}
