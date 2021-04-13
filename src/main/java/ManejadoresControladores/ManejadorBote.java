/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
 *
 * @author Marco Munguia <@markomannder>
 */
public class ManejadorBote {

    public ManejadorBote() {
    }

    public void cambiarImagenAgua(JButton botonSeleccionado, TipoDeCelda celdaRandom, CeldaJButton celdaCliqueada, JLabel labelVida, JLabel labelObjeto, JLabel iconoObjeto) {
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
