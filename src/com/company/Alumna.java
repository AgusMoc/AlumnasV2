package com.company;

import java.time.LocalDate;
import java.util.List;

public class Alumna {

    private List<Asistencia> asistencias;
    private String nombreAlumna;
    private LocalDate cumpleaños;

    public Alumna(String nombreAlumna, LocalDate cumpleaños) {
        this.nombreAlumna = nombreAlumna;
        this.cumpleaños = cumpleaños;
    }

    public LocalDate getCumpleaños() {
        return cumpleaños;
    }
    public String getNombreAlumna() {
        return nombreAlumna;
    }
    public List<Asistencia> getAsistencias() {
        return asistencias;
    }


    public void setAsistencias(List<Asistencia> asistencias) {
        this.asistencias = asistencias;
    }
    public void setAsistencias() {
        this.asistencias = asistencias;
    }
    public void agregarAsistencia (Asistencia asistencia){
     asistencias.add(asistencia);
    }

    public boolean checkAsistX(String check){
        boolean confirmacion = false;

        for (int i = 0; i< asistencias.size();i++){
            if (asistencias.get(i).nroClaseAsis() == check) return confirmacion = true;
        }
        return confirmacion = false;
    }

    public String checkVista(String check){

        for (int i = 0; i< asistencias.size();i++){
            if (asistencias.get(i).nroClaseAsis() == check) return asistencias.get(i).getTipo();
        }
        return "";
    }


}
