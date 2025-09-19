package App;

import model.Zoologico;
import model.Perro;
import model.Gato;
import model.Vaca;

public class Aplicacion {
    public static void main(String[] args) {
        // Crear zoológico
        Zoologico zoologico = new Zoologico("Zoo Uku");

        // Registrar 5 animales
        Perro perr1 = new Perro("Lupita", "001", 10, "Labrador");
        Perro perr2 = new Perro("Rocky", "002", 8, "Bulldog");
        Gato gato1 = new Gato("Michi", "003", 15, "Hembra");
        Gato gato2 = new Gato("Tom", "004", 12, "Macho");
        Vaca vaca1 = new Vaca("Lola", "005", 0, "Blanca");

        System.out.println(zoologico.registrarAnimal(perr1));
        System.out.println(zoologico.registrarAnimal(perr2));
        System.out.println(zoologico.registrarAnimal(gato1));
        System.out.println(zoologico.registrarAnimal(gato2));
        System.out.println(zoologico.registrarAnimal(vaca1));

        // Hacer que todos los animales hagan su sonido
        zoologico.hacerSonidos();
    }
}