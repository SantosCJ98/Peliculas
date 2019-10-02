/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gp;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Santos Castillo
 */
public class Pelicula {

    String nombre;

    String genero;

    Date fecha_estreno;

    String director;

    String nacionalidad;

    SimpleDateFormat formateador = new SimpleDateFormat("dd/MM/yyyy");

    public Pelicula(String nombre, String genero, Date fecha_estreno, String director, String nacionalidad) {

        this.nombre = nombre;

        this.genero = genero;

        this.fecha_estreno = fecha_estreno;

        this.director = director;

        this.nacionalidad = nacionalidad;

    }

    public String getNombre() {
        return nombre;
    }

    public String getGenero() {
        return genero;
    }

    public Date getFecha_estreno() {
        return fecha_estreno;
    }

    public String getDirector() {
        return director;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setFecha_estreno(Date fecha_estreno) {
        this.fecha_estreno = fecha_estreno;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public void setFormateador(SimpleDateFormat formateador) {
        this.formateador = formateador;
    }

    public SimpleDateFormat getFormateador() {
        return formateador;
    }

    public String[] toArrayString() {

        String[] array = new String[5];

        array[0] = nombre;

        array[1] = genero;

        array[2] = formateador.format(fecha_estreno);

        array[3] = director;

        array[4] = nacionalidad;

        return array;
    }

    public void editarPelicula(String nombre, String genero, Date fecha, String director, String pais) {

        setNombre(nombre);

        setGenero(genero);

        setFecha_estreno(fecha);

        setDirector(director);

        setNacionalidad(pais);

    }

}
