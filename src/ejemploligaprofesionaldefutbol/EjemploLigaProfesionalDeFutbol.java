package ejemploligaprofesionaldefutbol;

import java.util.ArrayList;

public class EjemploLigaProfesionalDeFutbol {

    static ArrayList< Equipo> lpf = new ArrayList<>();

    public static void rellenarDatos() {

        EquipoPrimera e1;
        Equipo e2;
        Entrenador ent;
        Masajista mas;
        Jugador jug;

        // -------------------EQUIPO PRIMERA ---------------------
        for (int i = 0; i < 20; i++) {
            //Creo 20 equipos de primera
            e1 = new EquipoPrimera();
            e1.setNombre("Equipo Primera " + i);
            e1.setCapacidad(2000 + i);
            e1.setAno_fundacion(1975 + i);
            e1.setNombre_estadio("Estadio " + i);

            for (int j = 0; j < 22; j++) {
                //Le añado 22 jugadores a cada equipo
                jug = new Jugador();
                jug.setNombre("Jugador " + j);
                jug.setEdad(22 + j);
                jug.setPeso(65 + j);
                jug.setAltura(70 + j);
                e1.addJugador(jug);
            }

            //añado 1 entrenador a cada equipo de primera
            ent = new Entrenador();
            ent.setNombre("Entrenador Primera " + i);
            ent.setEdad(65 + i);
            ent.setNacionalidad("Español ");
            e1.setEntrenador(ent);

            //añado 1 masajista a cada equipo de primera
            mas = new Masajista();
            mas.setNombre("Masajista Primera " + i);
            mas.setEdad(25 + i);
            mas.setNum_colegiado(7786 + i);
            e1.setMasajista(mas);

            lpf.add(e1);
        }
        // -------------------EQUIPO SEGUNDA ---------------------
        for (int i = 0; i < 20; i++) {
            //Creo 20 equipos de segunda
            e2 = new EquipoSegunda();
            e2.setNombre("Equipo Segunda" + i);
            e2.setAno_fundacion(1960 + i);
            //Le añado 22 jugadores a cada equipo
            for (int j = 0; j < 22; j++) {
                jug = new Jugador();
                jug.setNombre("Jugador " + j);
                jug.setEdad(22 + j);
                jug.setPeso(65 + j);
                jug.setAltura(70 + j);
                e2.addJugador(jug);
            }

            //añado 1 entrenador acada equipo de segunda
            ent = new Entrenador();
            ent.setNombre("Entrenador Segunda " + i);
            ent.setEdad(65 + i);
            ent.setNacionalidad("Español ");
            e2.setEntrenador(ent);

            //añado 1 masajista a cada equipo de segunda
            mas = new Masajista();
            mas.setNombre("Masajista Segunda " + i);
            mas.setEdad(25 + i);
            mas.setNum_colegiado(7786 + i);
            e2.setMasajista(mas);

            lpf.add(e2);
        }
    }

    // 1) TRASPASAR UN JUGADOR DE UN EQUIPO A OTRO
    public static void traspasar(Equipo origen, Equipo destino, Jugador j) {
        destino.addJugador(j);
        origen.removJugador(j);
    }

    // 2) ALTA DE UN JUGADOR EN UN EQUIPO
    public static void altaJugador() {

    }

    // 3) BAJA DE UN JUGADOR EN UN EQUIPO
    public static void bajaJugador() {

    }

    // 4) CAMBIAR UN ENTRENADOR POR OTRO
    public static void cambiarEntrenador() {

    }

    // 5) CAMBIAR UN MASAJISTA POR OTRO
    public static void cambiarMasajista() {

    }

    // 6) FUSIONAR UN JUGADOR CON OTRO LLAMADO "Messitiano Ronaldo"
    public static void fusionarJugador() {

    }

    public static void main(String[] args) {

        rellenarDatos();

        // 1) ----------------- TRASPASAR ---------------------------
        
        Jugador jug = lpf.get(2).getJugadores().get(10);
        
        traspasar(lpf.get(2), lpf.get(8),jug);
        traspasar(lpf.get(6), lpf.get(8),jug);
        traspasar(lpf.get(5), lpf.get(8),jug);
        traspasar(lpf.get(7), lpf.get(8),jug);
        
        
        altaJugador();
        bajaJugador();
        cambiarEntrenador();
        cambiarMasajista();
        fusionarJugador();

    }
}
