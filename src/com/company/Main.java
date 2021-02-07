package com.company;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	/*
	Crear un sistema que permita registrar la asistencia a clases de las alumnas de ADA.
Existen distintos cursos en el instituto. Cada curso tiene un listado de alumnas y un profesor titular.
Cada alumna tiene un registro de asistencias.
Cuando marca la asistencia a clases, se registra la fecha y hora.
La asistencia puede ser en vivo o diferida (ver la grabación de la clase).
	 */
    //Genero BBDD de curso, clases, alumnas y algunas asistencias que registran (como para poder trabajar)

        Curso back = new Curso();

        Alumna alumna1 = new Alumna("Agus", LocalDate.of(1993,07,31));
        Alumna alumna2 = new Alumna("Carla", LocalDate.of(1996,11,4));
        Alumna alumna3 = new Alumna("Pepa", LocalDate.of(1997,10,4));
        Alumna alumna4 = new Alumna("Camila", LocalDate.of(1985,11,4));
        Alumna alumna5 = new Alumna("Juana", LocalDate.of(2020,11,4));

        Clase clase1 = new Clase("clase1", LocalDate.of(1996,07,31));
        Clase clase2 = new Clase("clase2", LocalDate.of(2020,10,4));
        Clase clase3 = new Clase("clase3", LocalDate.of(2020,02,10));
        Clase clase4 = new Clase("clase4", LocalDate.of(2020,03,15));
        Clase clase5 = new Clase("clase5", LocalDate.of(2020,11,4));
        Clase clase6 = new Clase("clase6", LocalDate.of(1993,07,31));

        List<Clase> impartidasBack = new ArrayList();
        impartidasBack.add(clase1);
        impartidasBack.add(clase2);
        impartidasBack.add(clase3);
        impartidasBack.add(clase4);
        impartidasBack.add(clase5);
        impartidasBack.add(clase6);

        List<Alumna> alumnasBack = new ArrayList<>();
        alumnasBack.add(alumna1);
        alumnasBack.add(alumna2);
        alumnasBack.add(alumna3);
        alumnasBack.add(alumna4);
        alumnasBack.add(alumna5);

        List<Asistencia> asistenciasAgus = new ArrayList<>();
        alumna1.setAsistencias(asistenciasAgus);
        Asistencia asis1Agus = new Asistencia("diferida",clase1 );
        Asistencia asis2Agus = new Asistencia("diferida",clase2 );
        Asistencia asis3Agus = new Asistencia("vivo",clase3 );
        alumna1.agregarAsistencia(asis1Agus);
        alumna1.agregarAsistencia(asis2Agus);
        alumna1.agregarAsistencia(asis3Agus);

        List<Asistencia> asistenciasCarla = new ArrayList<>();
        alumna2.setAsistencias(asistenciasCarla);
        Asistencia asis1carla = new Asistencia("diferida",clase4 );
        Asistencia asis2carla = new Asistencia("diferida",clase2 );
        Asistencia asis3carla = new Asistencia("vivo",clase3 );
        alumna2.agregarAsistencia(asis1carla);
        alumna2.agregarAsistencia(asis2carla);

        List<Asistencia> asistenciasAl3 = new ArrayList<>();
        alumna3.setAsistencias(asistenciasAl3);
        Asistencia asisAl31 = new Asistencia("diferida",clase4 );
        Asistencia asisAl32 = new Asistencia("diferida",clase2 );
        Asistencia asisAl33 = new Asistencia("vivo",clase3 );
        alumna3.agregarAsistencia(asisAl32);
        alumna3.agregarAsistencia(asisAl31);
        alumna3.agregarAsistencia(asisAl33);

        List<Asistencia> asistenciasAl4 = new ArrayList<>();
        alumna4.setAsistencias(asistenciasAl4);
        Asistencia asisAl41 = new Asistencia("diferida",clase4 );
        Asistencia asisAl42 = new Asistencia("diferida",clase2 );
        alumna4.agregarAsistencia(asisAl41);
        alumna4.agregarAsistencia(asisAl42);

        List<Asistencia> asistenciasAl5 = new ArrayList<>();
        alumna5.setAsistencias(asistenciasAl5);
        Asistencia asisAl51 = new Asistencia("diferida",clase4 );
        Asistencia asisAl52 = new Asistencia("diferida",clase2 );
        Asistencia asisAl53 = new Asistencia("vivo",clase3 );
        alumna5.agregarAsistencia(asisAl53);
        alumna5.agregarAsistencia(asisAl51);
//---------------------------------------------------------------------------------
    //Si una alumna no vio una clase el día del cumple la agrega a la lista de las asistencias
          for (Clase i : impartidasBack){
            for (Alumna x : alumnasBack) {
                if (i.getFechaClase().getDayOfMonth() == x.getCumpleaños().getDayOfMonth() &&i.getFechaClase().getMonth() == x.getCumpleaños().getMonth() ){
                    if (x.checkVista(i.getNroClase())== "") {
                Asistencia cumpleañitos = new Asistencia("cumple",i);
                    x.agregarAsistencia(cumpleañitos);
                }}}
    //Se podría chequear si se agregó más de una asistencia de la misma clase y borrarla (o hacer el check cuando se agrega)
//---------------------------------------------------------------------------------
    //Funcionalidades programa:

    //a) Asistentes a una clase determinada. --> se podría ingresar por pantalla la clase a consultar
            for (Alumna x :alumnasBack) {
            String claseAchequear = "clase1";
              if (x.checkAsistX(claseAchequear)== true) System.out.println("alumna "+ x.getNombreAlumna() +" asistio a la clase 1");}

    //b) Alumnas que vieron una clase en vivo. --> se podríam ingresar por parametros la clase y tipo a consultar
        for (Alumna x :alumnasBack) {
            String claseAchequear = "clase1";
            if (x.checkVista(claseAchequear)!= "") System.out.println("alumna "+ x.getNombreAlumna() +" vio la clase en "+ x.checkVista(claseAchequear) );}

    //c) Cantidad de asistencias de cada alumna.
        for (Alumna x :alumnasBack) {
        System.out.println( "La alumna "+ x.getNombreAlumna()+ " asistio a "+ x.getAsistencias().size()+ " clases");}
        //size de list de asistencias

    //d) Alumnas que alcanzan el 75% de asistencia.--> se podría ingresar por parametro el % a consultar y se podría armar una lista con las alumnas que cumplen con esto
        for (Alumna x :alumnasBack) {
            if ( x.getAsistencias().size()*100/impartidasBack.size()>= 75) System.out.println("La alumna "+ x.getNombreAlumna()+ " tiene mas de 75% de asitencias ");
        }

    //e) Alumnas que no alcanzan el 75% de asistencia.
        for (Alumna x :alumnasBack) {
            if ( x.getAsistencias().size()*100/impartidasBack.size()< 75) System.out.println("La alumna "+ x.getNombreAlumna()+ " tiene menos de 75% de asitencias ");
        }
    }
    }}
