package Celdas;

import javax.swing.ImageIcon;

/**
 *
 * @author Marco Munguia <@markomannder>
 */
public class Agua extends TipoDeCelda {

    private boolean pescarCelda;
    private String Agua;
    protected ImageIcon imagenCelda = new ImageIcon(getClass().getResource("/Imagenes/CeldaAgua.png"));

    public Agua(boolean pescarCelda, String Agua, String nombre) {
        super(nombre);
        this.pescarCelda = pescarCelda;

    }

    public ImageIcon getImagenCelda() {
        return imagenCelda;
    }

    public boolean isPescarCelda() {
        return pescarCelda;
    }

    public void setPescarCelda(boolean pescarCelda) {
        this.pescarCelda = pescarCelda;
    }

    public String getAgua() {
        return Agua;
    }

    public void setAgua(String Agua) {
        this.Agua = Agua;
    }

    public void setImagenCelda(ImageIcon imagenCelda) {
        this.imagenCelda = imagenCelda;
    }

    @Override
    public String toString() {
        return "Agua";
    }
    
    public ImageIcon remplazarImagen(){
        return this.imagenCelda;
    }

}
