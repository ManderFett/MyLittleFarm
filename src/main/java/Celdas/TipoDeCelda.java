/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Celdas;

import javax.swing.ImageIcon;

/**
 *
 * @author Marco Munguia <@markomannder>
 */
public class TipoDeCelda {

    private String nombre;
    private ImageIcon iconoCelda;
    ImageIcon imagenCelda;

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

    public ImageIcon remplazarImagen() {
        return this.imagenCelda;
    }
}
