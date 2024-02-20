package Videogames;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        llenarHashSet();
        entregarJuegosySeries();
        contarEntregados();
        encontrarSerieMayorNumTemporadas();
        encontrarVideojuegoMayoresHoras();


    }
    static ArrayList<Serie> series = new ArrayList<>();
    static ArrayList<Videojuego> videojuegos = new ArrayList<>();
    public static void llenarHashSet(){
        series.add(new Serie("BreakingBad","Jessie"));
        series.add(new Serie("ShinChan",10,"Comedia","Genio"));
        series.add(new Serie("Doraemon",25,"Infantil","Pro"));
        series.add(new Serie("Juego de Tronos",8,"Fantasía","HBO"));
        series.add(new Serie("Ben 10","Omnitrix"));

        videojuegos.add(new Videojuego("Elden Ring",80));
        videojuegos.add(new Videojuego("New Super Mario Bross",40,"Plataformas","Nintendo"));
        videojuegos.add(new Videojuego("League of Legends",9999,"MOBA","Riot Games"));
        videojuegos.add(new Videojuego("Counter Strike",9999,"FPS","Valve"));
        videojuegos.add(new Videojuego("World of Warcraft",9999,"MMORPG","Blizzard"));
    }
    public static void entregarJuegosySeries(){
        series.get(2).entregar();
        series.get(3).entregar();

        videojuegos.get(1).entregar();
        videojuegos.get(3).entregar();
        videojuegos.get(4).entregar();
    }
    public static void contarEntregados(){
        System.out.println("Series entregadas: " + series.stream().filter(Serie::isEntregado).count());
        System.out.println("Videojuegos entregados: " + videojuegos.stream().filter(Videojuego::isEntregado).count());
    }
    public static String encontrarSerieMayorNumTemporadas(){
        return series.stream().max(Comparator.comparing(Serie::getNumTemporadas)).get().toString();
    }
    public static String encontrarVideojuegoMayoresHoras(){
        return videojuegos.stream().max(Comparator.comparing(Videojuego::getHorasEstimadas)).get().toString();
    }
}
