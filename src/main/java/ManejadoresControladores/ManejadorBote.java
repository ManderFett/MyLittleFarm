package ManejadoresControladores;

import Bote.Bote;
import Celdas.CeldaJButton;
import Celdas.TipoDeCelda;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 * Se encarga de colocar al bote pesquero en la celda de agua
 *
 * @author Marco Munguia <@markomannder>
 */
public class ManejadorBote {

    public ManejadorBote() {
    }

    /**
     * Coloca el bote dependiendo de los parametros
     * @param botonSeleccionado el boton que se encarga de colocarlo
     * @param celdaRandom el tipo de celda que se genero
     * @param celdaCliqueada la celda seleccionada 
     * @param labelVida JLabel que colocara la vida del bote
     * @param labelObjeto JLabel que coloca el nombre del bote
     * @param iconoObjeto JLabel que coloca el icono del bote
     */
    public void iniciarBote(JButton botonSeleccionado, TipoDeCelda celdaRandom, CeldaJButton celdaCliqueada, JLabel labelVida, JLabel labelObjeto, JLabel iconoObjeto) {
        botonSeleccionado.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ImageIcon iconoNuevo = new ImageIcon(getClass().getResource("/Imagenes/CeldaAguaPesca.png"));
                ImageIcon iconoMini = new ImageIcon(getClass().getResource("/Imagenes/imagenBarco.png"));
                Bote bote = new Bote("Lobo de Mar", 100);
                ManejadorVida manejadorVida = new ManejadorVida(labelVida, bote, bote.getVidaBote(), 10);
                labelVida.setText(Integer.toString(bote.getVidaBote()));
                labelObjeto.setText(bote.getNombreBote());
                iconoObjeto.setIcon(iconoMini);
                celdaCliqueada.setIcon(iconoNuevo);
            }
        });
    }

}
