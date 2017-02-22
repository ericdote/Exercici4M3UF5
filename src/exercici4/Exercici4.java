package exercici4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Exercici4 {

    public static void main(String[] args) {

        List<Persona> listaArray = new ArrayList<Persona>();
        List<Persona> listaLinked = new LinkedList<Persona>();
        long rapidez;
        for (int i = 0; i < 1000; i++) {
            listaArray.add(new Persona(("Persona" + i), i, i));
            listaLinked.add(new Persona(("Persona" + i), i, i));
        }
        //Insercion con ArrayList
        System.out.print("Tiempo invertido para insertar una persona en arrayList: ");
        rapidez = System.nanoTime();
        listaArray.add(0,new Persona("Tiempo", 1001, 1001));
        rapidez = System.nanoTime()-rapidez;
        System.out.println(rapidez);
        //Insercion con LinkedList
        System.out.print("Tiempo invertido para insertar una persona en linkedList: ");
        rapidez = 0;
        rapidez = System.nanoTime();
        listaArray.add(0,new Persona("Tiempo", 1002, 1002));
        rapidez = System.nanoTime()-rapidez;
        System.out.println(rapidez);    
        //Busqueda con arrayList
        System.out.print("Tiempo invertido para buscar una persona en arrayList: ");
        rapidez = System.nanoTime();
        listaArray.get(500);
        rapidez = System.nanoTime()-rapidez;
        System.out.println(rapidez);
        //Busqueda con linkedList
        System.out.print("Tiempo invertido para buscar una persona en linkedList: ");
        rapidez = System.nanoTime();
        listaLinked.get(500);
        rapidez = System.nanoTime()-rapidez;
        System.out.println(rapidez);
    }

}
