package Componentes;

import Celdas.Celda;
import ManejadoresControladores.CreadorTerrenoInicial;

/**
 * Reepresenta el terreno principal del granjero.
 *
 * @author Marco Munguia <@markomannder>
 */
public class Terreno {

    private Celda[][] celda;

    /**
     * Crea el terreno del jugadr.
     */
    public Terreno() {
        this.celda = CreadorTerrenoInicial.crearTerrenoInicial();
    }

    public Celda[][] getCelda() {
        return celda;
    }

    public void setCelda(Celda[][] celda) {
        this.celda = celda;
    }

}
