package ManejadoresControladores;

import Celdas.CeldaJButton;
import Celdas.TipoDeCelda;
import InterfazGrafica.OpcionesAgua;
import InterfazGrafica.OpcionesDesierto;
import InterfazGrafica.OpcionesGrama;
import javax.swing.JFrame;

/**
 * Se encarga de manejar las opciones que arrojara el JFrame asignado a cada
 * tipo de celda
 *
 * @author Marco Munguia <@markomannder>
 */
public class ManejadorOpciones {

    public ManejadorOpciones() {
    }

    /**
     *
     * @param celdaCliqueada captura la celda cliqueada
     * @param celdaRandom captura el tipo de celda para hacer una comparacion
     * @return el JFrame asignado al tipo de celda
     */
    public JFrame opcionesDeCelda(CeldaJButton celdaCliqueada, TipoDeCelda celdaRandom) {
        switch (celdaCliqueada.getTipoCelda()) {
            case "Grama":
                OpcionesGrama opcionesGrama = new OpcionesGrama(celdaCliqueada, celdaRandom);
                opcionesGrama.setVisible(true);
                return opcionesGrama;
            case "Agua":
                OpcionesAgua opcionesAgua = new OpcionesAgua(celdaCliqueada, celdaRandom);
                opcionesAgua.setVisible(true);
                return opcionesAgua;
            default:
                OpcionesDesierto opcionesDesierto = new OpcionesDesierto(celdaCliqueada, celdaRandom);
                opcionesDesierto.setVisible(true);
                return opcionesDesierto;
        }
    }

}
