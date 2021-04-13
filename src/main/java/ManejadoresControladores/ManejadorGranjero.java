package ManejadoresControladores;

import InterfazGrafica.VentanaMyFarm;
import Jugador.Granjero;
import javax.swing.JLabel;

/**
 * Se encarga de validar la vida del granjero
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
