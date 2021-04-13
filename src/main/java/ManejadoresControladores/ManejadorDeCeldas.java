package ManejadoresControladores;

import Celdas.Celda;
import javax.swing.JPanel;

/**
 * Se encarga de manejar las celdas creadas y comunicarlas con la interfaz
 *
 * @author Marco Munguia <@markomannder>
 */
public class ManejadorDeCeldas {

    private JPanel terrenoPanel;
    private Celda[][] distribucionTerreno;

    /**
     * Crea la comunicacion entre el JFrame y los metodos que crean el terreno
     *
     * @param terrenoPanel panel donde se colocara el terreno
     * @param distribucionTerreno distribucion creada tipo celda
     */
    public ManejadorDeCeldas(JPanel terrenoPanel, Celda[][] distribucionTerreno) {
        this.terrenoPanel = terrenoPanel;
        this.distribucionTerreno = distribucionTerreno;
        imprimirTerreno();
    }

    /**
     * Metodo encargado de imprimir el terreno 
     */
    public void imprimirTerreno() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                Celda nuevaCelda = this.distribucionTerreno[i][j];
                this.terrenoPanel.add(nuevaCelda.getCeldaJButton());
            }
        }
    }

}
