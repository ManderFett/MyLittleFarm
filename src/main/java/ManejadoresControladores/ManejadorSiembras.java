/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
 *
 * @author Marco Munguia <@markomannder>
 */
public class ManejadorSiembras {

    public void cambiarImagenGramaZanahoria(JMenuItem botonSeleccionado, TipoDeCelda celdaRandom, CeldaJButton celdaCliqueada, JLabel labelVida, JLabel labelObjeto, JLabel iconoObjeto) {
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

    public void cambiarImagenGramaManzana(JMenuItem botonSeleccionado, TipoDeCelda celdaRandom, CeldaJButton celdaCliqueada, JLabel labelVida, JLabel labelObjeto, JLabel iconoObjeto) {
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

    public void cambiarImagenGramaTomate(JMenuItem botonSeleccionado, TipoDeCelda celdaRandom, CeldaJButton celdaCliqueada, JLabel labelVida, JLabel labelObjeto, JLabel iconoObjeto) {
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

    public void cambiarImagenGramaMaiz(JMenuItem botonSeleccionado, TipoDeCelda celdaRandom, CeldaJButton celdaCliqueada, JLabel labelVida, JLabel labelObjeto, JLabel iconoObjeto) {
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
