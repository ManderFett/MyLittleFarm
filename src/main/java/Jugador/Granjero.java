package Jugador;

import Siembra.Maiz;
import Siembra.Manzano;
import Siembra.Tomate;
import Siembra.Zanahoria;

/**
 * Representa al jugador principal que le llamaremos Granjero
 *
 * @author Marco Munguia <@markomannder>
 */
public class Granjero {

    private int vidaJugador;
    private int dineroJugador;
    private String nombreJugador;
    private String nicknameJugador;
    private Manzano manzanasGranjero;
    private Zanahoria zanahoriasGranjero;
    private Tomate tomatesGranjero;
    private Maiz semillasMaiz;

    /**
     * Crea al jugador principal con atributos
     *
     * @param vidaJugador vida inicial del jugador
     * @param dineroJugador dinero inicial del jugador
     * @param nombreJugador nombre inicial del jugador
     * @param nicknameJugador nickname inicial del jugador
     */
    public Granjero(int vidaJugador, int dineroJugador, String nombreJugador, String nicknameJugador) {
        this.vidaJugador = vidaJugador;
        this.dineroJugador = dineroJugador;
        this.nombreJugador = nombreJugador;
        this.nicknameJugador = nicknameJugador;
    }

    public int getVidaJugador() {
        return vidaJugador;
    }

    public void setVidaJugador(int vidaJugador) {
        this.vidaJugador = vidaJugador;
    }

    public int getDineroJugador() {
        return dineroJugador;
    }

    public void setDineroJugador(int dineroJugador) {
        this.dineroJugador = dineroJugador;
    }

    public String getNombreJugador() {
        return nombreJugador;
    }

    public void setNombreJugador(String nombreJugador) {
        this.nombreJugador = nombreJugador;
    }

    public String getNicknameJugador() {
        return nicknameJugador;
    }

    public void setNicknameJugador(String nicknameJugador) {
        this.nicknameJugador = nicknameJugador;
    }

    public Manzano getManzanasGranjero() {
        return manzanasGranjero;
    }

    public void setManzanasGranjero(Manzano manzanasGranjero) {
        this.manzanasGranjero = manzanasGranjero;
    }

    public Zanahoria getZanahoriasGranjero() {
        return zanahoriasGranjero;
    }

    public void setZanahoriasGranjero(Zanahoria zanahoriasGranjero) {
        this.zanahoriasGranjero = zanahoriasGranjero;
    }

    public Tomate getTomatesGranjero() {
        return tomatesGranjero;
    }

    public void setTomatesGranjero(Tomate tomatesGranjero) {
        this.tomatesGranjero = tomatesGranjero;
    }

    public Maiz getSemillasMaiz() {
        return semillasMaiz;
    }

    public void setSemillasMaiz(Maiz semillasMaiz) {
        this.semillasMaiz = semillasMaiz;
    }

}
