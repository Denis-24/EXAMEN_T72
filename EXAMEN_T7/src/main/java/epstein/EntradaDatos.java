package epstein;

import java.util.LinkedList;
import java.util.Queue;

public class EntradaDatos {

    static Queue<Famoso> datos;

    public static void generarDatos(){

        datos = new LinkedList<>();
        datos.offer(new Famoso("Elon Musk", "EEUU", 52, "Empresario"));
        datos.offer(new Famoso("Donald Trump", "EEUU", 78, "Político"));
        datos.offer(new Famoso("Cristiano Ronaldo", "Portugal", 39, "Futbolista"));
        datos.offer(new Famoso("Shakira", "Colombia", 47, "Cantante"));
        datos.offer(new Famoso("Keanu Reeves", "Canadá", 59, "Actor"));
        datos.offer(new Famoso("Elon Musk", "EEUU", 52, "Empresario"));
        datos.offer(new Famoso("Elon Musk", "EEUU", 52, "Empresario"));
        datos.offer(new Famoso("El Cromas", "España", 16, "Youtuber"));
        datos.offer(new Famoso("The American Shockas Jr", "EEUU", 15, "Youtuber"));
        datos.offer(new Famoso("Santiago Abascal", "España", 52, "Político"));
        datos.offer(new Famoso("Donald Trump", "EEUU", 78, "Político"));
        datos.offer(new Famoso("Emmanuel Macron", "Francia", 46, "Político"));
        datos.offer(new Famoso("Lionel Messi", "Argentina", 37, "Futbolista"));
        datos.offer(new Famoso("Serena Williams", "EEUU", 42, "Tenista"));
        datos.offer(new Famoso("LeBron James", "EEUU", 39, "Baloncestista"));
        datos.offer(new Famoso("Lamine Yamal", "España", 16, "Futbolista"));

    }

    public static Queue<Famoso> getDatosActuales(){

        return datos;

    }

}
