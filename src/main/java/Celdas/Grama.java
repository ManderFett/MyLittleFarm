package Celdas;

import javax.swing.ImageIcon;

/**
 * Clase que representa a nuestra celda grama, hereda de la clase TipoDeCelda
 * @author Marco Munguia <@markomannder>
 */
public class Grama extends TipoDeCelda {

    private boolean plantarSemilla;
    private boolean colocarAnimal;
    ImageIcon imagenCelda = new ImageIcon(getClass().getResource("/Imagenes/CeldaGrama.png"));
    /**
     * Crea la celda grama con los atributos
     * @param plantarSemilla booleano que nos indica si se puede plantar o no en la celda
     * @param colocarAnimal booleano que nos indica si es parcela
     * @param nombre nos indica el nombre de la celda
     */
    public Grama(boolean plantarSemilla, boolean colocarAnimal, String nombre) {
        super(nombre);
        this.plantarSemilla = plantarSemilla;
        this.colocarAnimal = colocarAnimal;
    }

    public ImageIcon getImagenCelda() {
        return imagenCelda;
    }

    public ImageIcon setImagenCelda() {
        return imagenCelda;
    }

    public boolean isPlantarSemilla() {
        return plantarSemilla;
    }

    public void setPlantarSemilla(boolean plantarSemilla) {
        this.plantarSemilla = plantarSemilla;
    }

    public boolean isColocarAnimal() {
        return colocarAnimal;
    }

    public void setColocarAnimal(boolean colocarAnimal) {
        this.colocarAnimal = colocarAnimal;
    }

    @Override
    public String toString() {
        return "Grama";
    }

    @Override
    public ImageIcon remplazarIcono() {
        return this.imagenCelda;
    }
}
