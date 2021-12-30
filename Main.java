package supermariobros;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random gen = new Random();

        Personaje Mario = new Personaje("Mario", "Roja", "Azul claro", "Rojo", 'M');
        Personaje Luigi = new Personaje("Luigi", "Verde", "Azul oscuro", "Verde", 'L', gen.nextInt() % 51, 0, "Derecha");

        elEncuentro(Mario, Luigi);
    }

    public static void elEncuentro(Personaje Mario, Personaje Luigi) {
        Mario.MostrarUbicacion();
        Luigi.MostrarUbicacion();

        if (Mario.getEjeX() > Luigi.getEjeX()) {
            Mario.Girar();
            Mario.MostrarUbicacion();
        } else if (Luigi.getEjeX() >= Mario.getEjeX()) {
            Luigi.Girar();
            Luigi.MostrarUbicacion();
        }

        while (Mario.getEjeX() != Luigi.getEjeX()) {
            Mario.Caminar();
            Mario.MostrarUbicacion();
            if (Mario.getEjeX() != Luigi.getEjeX()) {
                Luigi.Caminar();
                Luigi.MostrarUbicacion();
            }
        }

        System.out.println(Mario.getNombre() + " y " + Luigi.getNombre() + " se encontraron!");
        Mario.Saludar();
        Luigi.Saludar();

    }
}
