package ManejadoresControladores;

import Animales.Cerdo;
import Animales.Gallina;
import Animales.Oveja;
import Animales.Vaca;
import Celdas.CeldaJButton;
import Celdas.TipoDeCelda;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JMenuItem;

/**
 * Maneja los animales y se encarga de crear los hilos de estos una vez son
 * colocados en cada celda
 *
 * @author Marco Munguia <@markomannder>
 */
public class ManejadorAnimales {

    /**
     * Inicia el hilo del animal cerdo y lo coloca en la celda
     *
     * @param botonSeleccionado la celda seleccionada para colocar al cerdito
     * @param celdaRandom el tipo de celda generada
     * @param celdaCliqueada la celda que captura el click
     * @param labelVida JLabel donde se colocara la vida del cerdito
     * @param labelObjeto JLabel donde se colocara el nombre del animal
     * @param iconoObjeto JLabel donde se colocara la imagen del animal
     */
    public void iniciarCerdito(JMenuItem botonSeleccionado, TipoDeCelda celdaRandom, CeldaJButton celdaCliqueada, JLabel labelVida, JLabel labelObjeto, JLabel iconoObjeto) {
        botonSeleccionado.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ImageIcon iconoNuevo = new ImageIcon(getClass().getResource("/Imagenes/CeldaGramaCerdo.png"));
                ImageIcon iconoMini = new ImageIcon(getClass().getResource("/Imagenes/imagenCerdito.png"));
                Cerdo cerdo = new Cerdo(100, 70, "Cerdito");
                ManejadorVida manejadorVida = new ManejadorVida(labelVida, cerdo, cerdo.getVidaAnimal(), 2);
                labelVida.setText(Integer.toString(cerdo.getVidaAnimal()));
                labelObjeto.setText(cerdo.getNombreAnimal());
                iconoObjeto.setIcon(iconoMini);
                celdaCliqueada.setIcon(iconoNuevo);
            }
        });
    }

    /**
     * Inicia el hilo del animal oveja y lo coloca en la celda
     *
     * @param botonSeleccionado la celda seleccionada para colocar a la oveja
     * @param celdaRandom el tipo de celda generada
     * @param celdaCliqueada la celda que captura el click
     * @param labelVida JLabel donde se colocara la vida de la oveja
     * @param labelObjeto JLabel donde se colocara el nombre del animal
     * @param iconoObjeto JLabel donde se colocara la imagen del animal
     */
    public void iniciarOveja(JMenuItem botonSeleccionado, TipoDeCelda celdaRandom, CeldaJButton celdaCliqueada, JLabel labelVida, JLabel labelObjeto, JLabel iconoObjeto) {
        botonSeleccionado.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ImageIcon iconoNuevo = new ImageIcon(getClass().getResource("/Imagenes/CeldaGramaOveja.png"));
                ImageIcon iconoMini = new ImageIcon(getClass().getResource("/Imagenes/imagenOveja.png"));
                Oveja oveja = new Oveja(100, 77, "Oveja");
                ManejadorVida manejadorVida = new ManejadorVida(labelVida, oveja, oveja.getVidaAnimal(), 2);
                labelVida.setText(Integer.toString(oveja.getVidaAnimal()));
                labelObjeto.setText(oveja.getNombreAnimal());
                iconoObjeto.setIcon(iconoMini);
                celdaCliqueada.setIcon(iconoNuevo);
            }
        });
    }

    /**
     * Inicia el hilo del animal vaca y lo coloca en la celda
     *
     * @param botonSeleccionado la celda seleccionada para colocar a la vaca
     * @param celdaRandom el tipo de celda generada
     * @param celdaCliqueada la celda que captura el click
     * @param labelVida JLabel donde se colocara la vida de la vaca
     * @param labelObjeto JLabel donde se colocara el nombre del animal
     * @param iconoObjeto JLabel donde se colocara la imagen del animal
     */
    public void iniciarVaca(JMenuItem botonSeleccionado, TipoDeCelda celdaRandom, CeldaJButton celdaCliqueada, JLabel labelVida, JLabel labelObjeto, JLabel iconoObjeto) {
        botonSeleccionado.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ImageIcon iconoNuevo = new ImageIcon(getClass().getResource("/Imagenes/CeldaGramaVaca.png"));
                ImageIcon iconoMini = new ImageIcon(getClass().getResource("/Imagenes/imagenVaca.png"));
                Vaca vaca = new Vaca(100, 90, "Vaca");
                ManejadorVida manejadorVida = new ManejadorVida(labelVida, vaca, vaca.getVidaAnimal(), 2);
                labelVida.setText(Integer.toString(vaca.getVidaAnimal()));
                labelObjeto.setText(vaca.getNombreAnimal());
                iconoObjeto.setIcon(iconoMini);
                celdaCliqueada.setIcon(iconoNuevo);
            }
        });
    }

    /**
     * Inicia el hilo del animal gallina y lo coloca en la celda
     *
     * @param botonSeleccionado la celda seleccionada para colocar a la gallina
     * @param celdaRandom el tipo de celda generada
     * @param celdaCliqueada la celda que captura el click
     * @param labelVida JLabel donde se colocara la vida de la gallina
     * @param labelObjeto JLabel donde se colocara el nombre del animal
     * @param iconoObjeto JLabel donde se colocara la imagen del animal
     */
    public void iniciarGallina(JMenuItem botonSeleccionado, TipoDeCelda celdaRandom, CeldaJButton celdaCliqueada, JLabel labelVida, JLabel labelObjeto, JLabel iconoObjeto) {
        botonSeleccionado.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ImageIcon iconoNuevo = new ImageIcon(getClass().getResource("/Imagenes/CeldaGramaGallina.png"));
                ImageIcon iconoMini = new ImageIcon(getClass().getResource("/Imagenes/imagenGallina.png"));
                Gallina gallina = new Gallina(100, 30, "Gallina");
                ManejadorVida manejadorVida = new ManejadorVida(labelVida, gallina, gallina.getVidaAnimal(), 2);
                labelObjeto.setText(gallina.getNombreAnimal());
                labelVida.setText(Integer.toString(gallina.getVidaAnimal()));
                iconoObjeto.setIcon(iconoMini);
                celdaCliqueada.setIcon(iconoNuevo);
            }
        });
    }

}
