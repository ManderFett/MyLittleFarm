package Siembra;

/**
 * Clae padre Semilla con atributos generales de Semilla
 * @author Marco Munguia <@markomannder>
 */
public class Semilla {

    private int vidaSemilla;
    private int tiempoCosecha;
    private String nombreSemilla;

    public Semilla(int vidaSemilla, int tiempoCosecha, String nombreSemilla) {
        this.vidaSemilla = vidaSemilla;
        this.tiempoCosecha = tiempoCosecha;
        this.nombreSemilla = nombreSemilla;
    }

    public int getVidaSemilla() {
        return vidaSemilla;
    }

    public void setVidaSemilla(int vidaSemilla) {
        this.vidaSemilla = vidaSemilla;
    }

    public int getTiempoCosecha() {
        return tiempoCosecha;
    }

    public void setTiempoCosecha(int tiempoCosecha) {
        this.tiempoCosecha = tiempoCosecha;
    }

    public String getNombreSemilla() {
        return nombreSemilla;
    }

    public void setNombreSemilla(String nombreSemilla) {
        this.nombreSemilla = nombreSemilla;
    }

}
