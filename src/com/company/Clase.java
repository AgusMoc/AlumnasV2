package com.company;

import java.time.LocalDate;
import java.util.List;

public class Clase {
    private String nroClase;
    private LocalDate fechaClase;

    public Clase(String nroClase, LocalDate fechaClase) {
        this.nroClase = nroClase;
        this.fechaClase = fechaClase;
    }

    public String getNroClase() {
        return nroClase;
    }

    public void setNroClase(String nroClase) {
        this.nroClase = nroClase;
    }

    public LocalDate getFechaClase() {
        return fechaClase;
    }

    public void setFechaAsistencia(LocalDate fechaAsistencia) {
        this.fechaClase = fechaAsistencia;
    }

}
