package Celdas;

import javax.swing.ImageIcon;

/**
 * Clase que representa la celda Desierto
 * @author Marco Munguia <@markomannder>
 */
public class Desierto extends TipoDeCelda {

    private String nombre;
    ImageIcon imagenCelda = new ImageIcon(getClass().getResource("/Imagenes/CeldaDesierto.png"));
    /**
     * Crea la celda desierto unicamente con el parametro
     * @param nombre indica el nombre de referencia de la celda 
     */
    public Desierto(String nombre) {
        super(nombre);
    }

    public ImageIcon getImagenCelda() {
        return imagenCelda;
    }

    @Override
    public String toString() {
        return "Desierto";
    }

    @Override
    public ImageIcon remplazarIcono() {
        return this.imagenCelda;
    }

}
