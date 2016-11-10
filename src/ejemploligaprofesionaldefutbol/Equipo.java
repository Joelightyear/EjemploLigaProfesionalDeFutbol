
package ejemploligaprofesionaldefutbol;

import java.util.ArrayList;


public abstract class Equipo {
    
    private String nombre;
    private int ano_fundacion;
    private static ArrayList < Jugador > jugadores = new ArrayList <>();
    private Entrenador entrenador;
    private Masajista masajista;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAno_fundacion() {
        return ano_fundacion;
    }

    public void setAno_fundacion(int ano_fundacion) {
        this.ano_fundacion = ano_fundacion;
    }

    public static ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public static void setJugadores(ArrayList<Jugador> jugadores) {
        Equipo.jugadores = jugadores;
    }

    public Entrenador getEntrenador() {
        return entrenador;
    }

    public void setEntrenador(Entrenador entrenador) {
        this.entrenador = entrenador;
    }

    public Masajista getMasajista() {
        return masajista;
    }

    public void setMasajista(Masajista masajista) {
        this.masajista = masajista;
    }
    
    public void addJugador (Jugador jug){
        this.jugadores.add(jug);
    }
    
    public void removJugador (Jugador jug){
        this.jugadores.remove(jug);
    }
            
}
