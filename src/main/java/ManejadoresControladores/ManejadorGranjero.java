/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManejadoresControladores;

import InterfazGrafica.VentanaMyFarm;
import Jugador.Granjero;
import javax.swing.JLabel;

/**
 *
 * @author Marco Munguia <@markomannder>
 */
public class ManejadorGranjero {

    public void reiniciarJuego(JLabel vidaGranjero) {
        if (vidaGranjero.getText().equals("O")) {
            VentanaMyFarm reiniciarJuego = new VentanaMyFarm();
            reiniciarJuego.setVisible(true);
        }
    }

}
