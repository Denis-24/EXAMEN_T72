package epstein;

import java.sql.SQLOutput;
import java.util.*;

public class EpsteinApp {
    static LinkedList<Famoso> listaEpstein = new LinkedList<>();
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        procesarDatos();
        System.out.println();
//        nuevoFamoso();
//        System.out.println();
        buscarFamoso();
        System.out.println();
//        eliminarMenores();


    }
    static void procesarDatos(){
        EntradaDatos.generarDatos();
        System.out.println("Procesando datos desde EntradaDatos...");
        for (Famoso famoso : EntradaDatos.datos){
            System.out.println("--Grabando " + famoso);
            listaEpstein.add(famoso);
        }
    }
    static void nuevoFamoso(){
        inicio();
        Famoso famoso = new Famoso(nombre(),pais(),edad(),profesion());
        listaEpstein.add(famoso);
        System.out.println("Famoso insertado.");
    }
    static void inicio(){
        System.out.println("**** APP MANTENIMIENTO LISTA EPSTEIN ****");
        System.out.println();
        System.out.println("Insertr famoso...");
    }
    static String nombre(){
        System.out.println("Nombre:");
        String nombre = teclado.nextLine();
        return nombre;
    }
    static String pais(){
        System.out.println("Pais:");
        String pais = teclado.nextLine();
        return pais;
    }
    static String profesion(){
        System.out.println("Profesion:");
        String profesion = teclado.nextLine();
        return profesion;
    }
    static int edad(){
        System.out.println("Edad:");
        int edad = teclado.nextInt();
        teclado.nextLine();
        return edad;
    }

    static void buscarFamoso(){
        int contador = 0;
        System.out.println();
        System.out.println("Buscando famoso...");
        String nom = nombre();
        String pai = pais();
        int eda = edad();
        String prof = profesion();

        for (Famoso famoso : listaEpstein){
            if (famoso.getNombre() == nom && famoso.getPais()==pai && famoso.getEdad() == eda && famoso.getProfesion() == prof){
                System.out.println("El famosos HA ACUDIDO a la Isla...");
            }
            contador++;
        }
        if (contador==listaEpstein.size()){
            System.out.println("El famoso no esta en la lista de Epstein. No ha acudido a la Isla...");
        }
    }
    static void eliminarMenores(){
        Iterator<Famoso> it = listaEpstein.iterator();
        while (it.hasNext()){
            Famoso famoso = it.next();

            if (famoso.getEdad()<18){
                it.remove();
                System.out.println("-- " + famoso.getNombre() + " fulminado.");
            }
        }
    }
    static Estadisticas generarEstadisticas(){
        Estadisticas estadisticas = new Estadisticas()
        for (Famoso famoso : listaEpstein){
        }

        return ;
    }
}
