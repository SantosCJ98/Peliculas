/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ldn;

import gp.Pelicula;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Santos Castillo
 */
public class LogicaDeNegocio {

    List<Pelicula> peliculas;

    public LogicaDeNegocio() {

        peliculas = new ArrayList<>(List.of(new Pelicula("Spiderman into the Spiderverse", "Animación", new Date(), "Sony", "EEUU")));

    }

    public List<Pelicula> getPeliculas() {

        return peliculas;

    }

    public void anyadirPelicula(Pelicula pelicula) {

        peliculas.add(pelicula);

    }

    public void borrarPelicula(Pelicula pelicula) {

        peliculas.remove(pelicula);

    }

    public int totalPeliculas() {

        return peliculas.size();
    }

}
