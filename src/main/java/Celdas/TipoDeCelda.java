
package Celdas;

import javax.swing.ImageIcon;

/**
 * Clase padre que representa de manera global a las celdas del terreno.
 * @author Marco Munguia <@markomannder>
 */
public class TipoDeCelda {

    private String nombre;
    private ImageIcon iconoCelda;
    ImageIcon imagenCelda;
    /**
     * Crea un tipo de celda con referencia de nombre
     * @param nombre nombre que recibe la celda
     */
    public TipoDeCelda(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ImageIcon getIconoCelda() {
        return iconoCelda;
    }

    public void setIconoCelda(ImageIcon iconoCelda) {
        this.iconoCelda = iconoCelda;
    }

    public ImageIcon remplazarIcono() {
        return this.imagenCelda;
    }
}
