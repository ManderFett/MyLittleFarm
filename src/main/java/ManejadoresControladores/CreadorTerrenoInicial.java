package ManejadoresControladores;

import Celdas.Celda;
import Celdas.CeldaJButton;
import Celdas.TipoDeCelda;

/**
 *
 * @author Marco Munguia <@markomannder>
 */
public class CreadorTerrenoInicial {

    public static Celda[][] crearTerrenoInicial() {
        Celda celdaTerreno;
        Celda[][] celda = new Celda[5][5];
        ProbabilidadCeldas tipoDeCelda = new ProbabilidadCeldas();
        TipoDeCelda celdaRandom = tipoDeCelda.dibujarRandom();
        ManejadorOpciones manejadorOpciones = new ManejadorOpciones();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                String tipoCelda = tipoDeCelda.dibujarRandom().toString();
                CeldaJButton nuevaCelda = new CeldaJButton(i, j, tipoCelda, tipoDeCelda.getImagen());
                nuevaCelda.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        CeldaJButton opcionDeCelda = (CeldaJButton) evt.getComponent();
                        manejadorOpciones.opcionesDeCelda(opcionDeCelda, celdaRandom);
                    }
                });
                celdaTerreno = new Celda(celdaRandom, nuevaCelda);
                celda[i][j] = celdaTerreno;
            }
        }
        return celda;

    }
}
