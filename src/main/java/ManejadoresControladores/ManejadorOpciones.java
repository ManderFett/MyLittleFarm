/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManejadoresControladores;

import Celdas.CeldaJButton;
import Celdas.TipoDeCelda;
import InterfazGrafica.OpcionesAgua;
import InterfazGrafica.OpcionesDesierto;
import InterfazGrafica.OpcionesGrama;
import javax.swing.JFrame;

/**
 *
 * @author Marco Munguia <@markomannder>
 */
public class ManejadorOpciones {

    public ManejadorOpciones() {
    }

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
