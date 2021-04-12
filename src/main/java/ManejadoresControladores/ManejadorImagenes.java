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
import javax.swing.JMenuItem;

/**
 *
 * @author Marco Munguia <@markomannder>
 */
public class ManejadorImagenes {

    public ManejadorImagenes() {
    }

    public void cambiarImagenAgua(JButton botonSeleccionado, TipoDeCelda celdaRandom, CeldaJButton celdaCliqueada) {
        botonSeleccionado.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ImageIcon iconoNuevo = new ImageIcon(getClass().getResource("/Imagenes/CeldaAguaPesca.png"));
                celdaCliqueada.setIcon(iconoNuevo);
            }
        });
    }

    public void cambiarImagenGramaCerdito(JMenuItem botonSeleccionado, TipoDeCelda celdaRandom, CeldaJButton celdaCliqueada) {
        botonSeleccionado.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ImageIcon iconoNuevo = new ImageIcon(getClass().getResource("/Imagenes/CeldaGramaCerdo.png"));
                celdaCliqueada.setIcon(iconoNuevo);
            }
        });
    }

    public void cambiarImagenGramaOveja(JMenuItem botonSeleccionado, TipoDeCelda celdaRandom, CeldaJButton celdaCliqueada) {
        botonSeleccionado.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ImageIcon iconoNuevo = new ImageIcon(getClass().getResource("/Imagenes/CeldaGramaOveja.png"));
                celdaCliqueada.setIcon(iconoNuevo);
            }
        });
    }

    public void cambiarImagenGramaVaca(JMenuItem botonSeleccionado, TipoDeCelda celdaRandom, CeldaJButton celdaCliqueada) {
        botonSeleccionado.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ImageIcon iconoNuevo = new ImageIcon(getClass().getResource("/Imagenes/CeldaGramaVaca.png"));
                celdaCliqueada.setIcon(iconoNuevo);
            }
        });
    }

    public void cambiarImagenGramaGallina(JMenuItem botonSeleccionado, TipoDeCelda celdaRandom, CeldaJButton celdaCliqueada) {
        botonSeleccionado.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ImageIcon iconoNuevo = new ImageIcon(getClass().getResource("/Imagenes/CeldaGramaGallina.png"));
                celdaCliqueada.setIcon(iconoNuevo);
            }
        });
    }

    public void cambiarImagenGramaZanahoria(JMenuItem botonSeleccionado, TipoDeCelda celdaRandom, CeldaJButton celdaCliqueada) {
        botonSeleccionado.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ImageIcon iconoNuevo = new ImageIcon(getClass().getResource("/Imagenes/CeldaGramaZanahorias.png"));
                celdaCliqueada.setIcon(iconoNuevo);
            }
        });
    }

    public void cambiarImagenGramaManzana(JMenuItem botonSeleccionado, TipoDeCelda celdaRandom, CeldaJButton celdaCliqueada) {
        botonSeleccionado.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ImageIcon iconoNuevo = new ImageIcon(getClass().getResource("/Imagenes/CeldaGramaManzano.png"));
                celdaCliqueada.setIcon(iconoNuevo);
            }
        });
    }

    public void cambiarImagenGramaTomate(JMenuItem botonSeleccionado, TipoDeCelda celdaRandom, CeldaJButton celdaCliqueada) {
        botonSeleccionado.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ImageIcon iconoNuevo = new ImageIcon(getClass().getResource("/Imagenes/CeldaGramaTomate.png"));
                celdaCliqueada.setIcon(iconoNuevo);
            }
        });
    }

    public void cambiarImagenGramaMaiz(JMenuItem botonSeleccionado, TipoDeCelda celdaRandom, CeldaJButton celdaCliqueada) {
        botonSeleccionado.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ImageIcon iconoNuevo = new ImageIcon(getClass().getResource("/Imagenes/CeldaGramaMaiz.png"));
                celdaCliqueada.setIcon(iconoNuevo);
            }
        });
    }

}
