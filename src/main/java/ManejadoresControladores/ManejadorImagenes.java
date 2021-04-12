/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManejadoresControladores;

import Celdas.CeldaJButton;
import Celdas.TipoDeCelda;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author Marco Munguia <@markomannder>
 */
public class ManejadorImagenes {

    public ManejadorImagenes() {
    }

    public void cambiarImagen(JButton botonSeleccionado, TipoDeCelda celdaRandom, CeldaJButton celdaCliqueada) {
        botonSeleccionado.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ImageIcon iconoNuevo = new ImageIcon(getClass().getResource("/Imagenes/CeldaAguaPesca.png"));
                celdaCliqueada.setIcon(iconoNuevo);
            }
        });
    }

}
