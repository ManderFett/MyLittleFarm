package ManejadoresControladores;

import Celdas.CeldaJButton;
import Celdas.TipoDeCelda;
import Siembra.Maiz;
import Siembra.Manzano;
import Siembra.Tomate;
import Siembra.Zanahoria;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JMenuItem;

/**
 * Se encarga de manejar las semillas que queremos plantar en las celdas
 *
 * @author Marco Munguia <@markomannder>
 */
public class ManejadorSiembras {

    /**
     * Se encarga de sembrar la zanahoria en la celda
     *
     * @param botonSeleccionado captura la seleccion
     * @param celdaRandom tipo de celda que se genero
     * @param celdaCliqueada la celda donde se cliqueo
     * @param labelVida JLabel que coloca la vida de la siembra
     * @param labelObjeto JLabel que rrecibe el nombre de la semilla
     * @param iconoObjeto JLabel donde se cambia la imagen de la semilla
     */
    public void iniciarZanahoria(JMenuItem botonSeleccionado, TipoDeCelda celdaRandom, CeldaJButton celdaCliqueada, JLabel labelVida, JLabel labelObjeto, JLabel iconoObjeto) {
        botonSeleccionado.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ImageIcon iconoNuevo = new ImageIcon(getClass().getResource("/Imagenes/CeldaGramaZanahorias.png"));
                ImageIcon iconoMini = new ImageIcon(getClass().getResource("/Imagenes/imagenZanahoria.png"));
                Zanahoria zanahoria = new Zanahoria(100, 20, "Zanahoria");
                ManejadorVida manejadorVida = new ManejadorVida(labelVida, zanahoria, zanahoria.getVidaSemilla(), 4);
                labelObjeto.setText(zanahoria.getNombreSemilla());
                labelVida.setText(Integer.toString(zanahoria.getVidaSemilla()));
                iconoObjeto.setIcon(iconoMini);
                celdaCliqueada.setIcon(iconoNuevo);
            }
        });
    }

    /**
     * Se encarga de sembrar el manzano en la celda
     *
     * @param botonSeleccionado captura la seleccion
     * @param celdaRandom tipo de celda que se genero
     * @param celdaCliqueada la celda donde se cliqueo
     * @param labelVida JLabel que coloca la vida de la siembra
     * @param labelObjeto JLabel que rrecibe el nombre de la semilla
     * @param iconoObjeto JLabel donde se cambia la imagen de la semilla
     */
    public void iniciarManzano(JMenuItem botonSeleccionado, TipoDeCelda celdaRandom, CeldaJButton celdaCliqueada, JLabel labelVida, JLabel labelObjeto, JLabel iconoObjeto) {
        botonSeleccionado.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ImageIcon iconoNuevo = new ImageIcon(getClass().getResource("/Imagenes/CeldaGramaManzano.png"));
                ImageIcon iconoMini = new ImageIcon(getClass().getResource("/Imagenes/imagenManzana.png"));
                Manzano manzano = new Manzano(100, 30, "Manzano");
                ManejadorVida manejadorVida = new ManejadorVida(labelVida, manzano, manzano.getVidaSemilla(), 1);
                labelObjeto.setText(manzano.getNombreSemilla());
                labelVida.setText(Integer.toString(manzano.getVidaSemilla()));
                iconoObjeto.setIcon(iconoMini);
                celdaCliqueada.setIcon(iconoNuevo);
            }
        });
    }

    /**
     * Se encarga de sembrar el tomate en la celda
     *
     * @param botonSeleccionado captura la seleccion
     * @param celdaRandom tipo de celda que se genero
     * @param celdaCliqueada la celda donde se cliqueo
     * @param labelVida JLabel que coloca la vida de la siembra
     * @param labelObjeto JLabel que rrecibe el nombre de la semilla
     * @param iconoObjeto JLabel donde se cambia la imagen de la semilla
     */
    public void iniciarTomate(JMenuItem botonSeleccionado, TipoDeCelda celdaRandom, CeldaJButton celdaCliqueada, JLabel labelVida, JLabel labelObjeto, JLabel iconoObjeto) {
        botonSeleccionado.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ImageIcon iconoNuevo = new ImageIcon(getClass().getResource("/Imagenes/CeldaGramaTomate.png"));
                ImageIcon iconoMini = new ImageIcon(getClass().getResource("/Imagenes/imagenTomate.png"));
                Tomate tomate = new Tomate(100, 50, "Tomate");
                ManejadorVida manejadorVida = new ManejadorVida(labelVida, tomate, tomate.getVidaSemilla(), 10);
                labelObjeto.setText(tomate.getNombreSemilla());
                labelVida.setText(Integer.toString(tomate.getVidaSemilla()));
                iconoObjeto.setIcon(iconoMini);
                celdaCliqueada.setIcon(iconoNuevo);
            }
        });
    }

    /**
     * Se encarga de sembrar el maiz en la celda
     *
     * @param botonSeleccionado captura la seleccion
     * @param celdaRandom tipo de celda que se genero
     * @param celdaCliqueada la celda donde se cliqueo
     * @param labelVida JLabel que coloca la vida de la siembra
     * @param labelObjeto JLabel que rrecibe el nombre de la semilla
     * @param iconoObjeto JLabel donde se cambia la imagen de la semilla
     */
    public void iniciarMaiz(JMenuItem botonSeleccionado, TipoDeCelda celdaRandom, CeldaJButton celdaCliqueada, JLabel labelVida, JLabel labelObjeto, JLabel iconoObjeto) {
        botonSeleccionado.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ImageIcon iconoNuevo = new ImageIcon(getClass().getResource("/Imagenes/CeldaGramaMaiz.png"));
                ImageIcon iconoMini = new ImageIcon(getClass().getResource("/Imagenes/imagenMaiz.png"));
                Maiz maiz = new Maiz(100, 40, "Maiz");
                ManejadorVida manejadorVida = new ManejadorVida(labelVida, maiz, maiz.getVidaSemilla(), 6);
                labelObjeto.setText(maiz.getNombreSemilla());
                labelVida.setText(Integer.toString(maiz.getVidaSemilla()));
                iconoObjeto.setIcon(iconoMini);
                celdaCliqueada.setIcon(iconoNuevo);
            }
        });
    }
}
