import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Espada nuevaEspada = new Espada(0, 6, "Aguijón", 15, 1.2, 0.70, 3.0);
        Lanza nuevaLanza = new Lanza(2, 9, "Lan Zadilla", 19.3, 1.4, 2.4, 5.5);
        Hacha nuevoHacha = new Hacha(3, 30, "Alabarda", 30.8, 1.9, 1.5, 6.5);
        Casco nuevoCasco = new Casco(0, 4, "Yelmo", 8, 1.1);
        Botas nuevasBotas = new Botas(4, 50, "Dr. Martens", 30.9, 1.6);
        Equipo[] arrayEquipo = new Equipo[5];
        arrayEquipo[0] = nuevaEspada;
        arrayEquipo[1] = nuevaLanza;
        arrayEquipo[2] = nuevoHacha;
        arrayEquipo[3] = nuevoCasco;
        arrayEquipo[4] = nuevasBotas;
        Random rd = new Random(); // se crea un objeto random para el booleano
        boolean proyectil = false;

        for (Equipo e : arrayEquipo) {
            if (e instanceof Arma) {
                System.out.println("Has hecho " + ((Arma) e).doing_damage(1.8) + " puntos de daño con " + e.getNombre());
            } else {
                if (e instanceof Botas) {
                    proyectil = rd.nextBoolean(); //el booleano es true o false de forma aleatoria, haciendo uso del objeto random
                    if (proyectil) {
                        System.out.println("Has bloqueado " + ((Botas) e).accion_especial(true, 2) + " puntos de daño.");
                    } else {
                        System.out.println("No te han hecho ningún ataque a melee.");
                    }
                } else {
                    proyectil = rd.nextBoolean();
                    if (proyectil) {
                        System.out.println("Has bloqueado " + e.accion_especial(true) + " puntos de daño.");
                    } else {
                        System.out.println("No ha caído ningún proyectil.");
                    }

                }
            }
        }

    }

}