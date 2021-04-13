/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManejadoresControladores;

import Animales.Cerdo;
import Animales.Gallina;
import Animales.Oveja;
import Animales.Vaca;
import Bote.Bote;
import Celdas.CeldaJButton;
import Celdas.TipoDeCelda;
import Siembra.Maiz;
import Siembra.Manzano;
import Siembra.Tomate;
import Siembra.Zanahoria;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JMenuItem;

/**
 *
 * @author Marco Munguia <@markomannder>
 */
public class ManejadorImagenes {

    public ManejadorImagenes() {
    }

    public void cambiarImagenAgua(JButton botonSeleccionado, TipoDeCelda celdaRandom, CeldaJButton celdaCliqueada, JLabel labelVida, JLabel labelObjeto, JLabel iconoObjeto) {
        botonSeleccionado.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ImageIcon iconoNuevo = new ImageIcon(getClass().getResource("/Imagenes/CeldaAguaPesca.png"));
                ImageIcon iconoMini = new ImageIcon(getClass().getResource("/Imagenes/imagenBarco.png"));
                Bote bote = new Bote("Lobo de Mar", 100);
                ManejadorVida menjadorVida =  new ManejadorVida(labelVida, bote, bote.getVidaBote(), 10);
                labelVida.setText(Integer.toString(bote.getVidaBote()));
                labelObjeto.setText(bote.getNombreBote());
                iconoObjeto.setIcon(iconoMini);
                celdaCliqueada.setIcon(iconoNuevo);
            }
        });
    }

    public void cambiarImagenGramaCerdito(JMenuItem botonSeleccionado, TipoDeCelda celdaRandom, CeldaJButton celdaCliqueada, JLabel labelVida, JLabel labelObjeto, JLabel iconoObjeto) {
        botonSeleccionado.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ImageIcon iconoNuevo = new ImageIcon(getClass().getResource("/Imagenes/CeldaGramaCerdo.png"));
                ImageIcon iconoMini = new ImageIcon(getClass().getResource("/Imagenes/imagenCerdito.png"));
                Cerdo cerdo = new Cerdo(100, "Cerdito");
                ManejadorVida manejadorVida = new ManejadorVida(labelVida, cerdo, cerdo.getVidaAnimal(), 2);
                labelVida.setText(Integer.toString(cerdo.getVidaAnimal()));
                labelObjeto.setText(cerdo.getNombreAnimal());
                iconoObjeto.setIcon(iconoMini);
                celdaCliqueada.setIcon(iconoNuevo);
            }
        });
    }

    public void cambiarImagenGramaOveja(JMenuItem botonSeleccionado, TipoDeCelda celdaRandom, CeldaJButton celdaCliqueada, JLabel labelVida, JLabel labelObjeto, JLabel iconoObjeto) {
        botonSeleccionado.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ImageIcon iconoNuevo = new ImageIcon(getClass().getResource("/Imagenes/CeldaGramaOveja.png"));
                ImageIcon iconoMini = new ImageIcon(getClass().getResource("/Imagenes/imagenOveja.png"));
                Oveja oveja = new Oveja(100, "Oveja");
                ManejadorVida manejadorVida = new ManejadorVida(labelVida, oveja, oveja.getVidaAnimal(), 2);
                labelVida.setText(Integer.toString(oveja.getVidaAnimal()));
                labelObjeto.setText(oveja.getNombreAnimal());
                iconoObjeto.setIcon(iconoMini);
                celdaCliqueada.setIcon(iconoNuevo);
            }
        });
    }

    public void cambiarImagenGramaVaca(JMenuItem botonSeleccionado, TipoDeCelda celdaRandom, CeldaJButton celdaCliqueada, JLabel labelVida, JLabel labelObjeto, JLabel iconoObjeto) {
        botonSeleccionado.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ImageIcon iconoNuevo = new ImageIcon(getClass().getResource("/Imagenes/CeldaGramaVaca.png"));
                ImageIcon iconoMini = new ImageIcon(getClass().getResource("/Imagenes/imagenVaca.png"));
                Vaca vaca = new Vaca(100, "Vaca");
                ManejadorVida manejadorVida = new ManejadorVida(labelVida, vaca, vaca.getVidaAnimal(), 2);
                labelVida.setText(Integer.toString(vaca.getVidaAnimal()));
                labelObjeto.setText(vaca.getNombreAnimal());
                iconoObjeto.setIcon(iconoMini);
                celdaCliqueada.setIcon(iconoNuevo);
            }
        });
    }

    public void cambiarImagenGramaGallina(JMenuItem botonSeleccionado, TipoDeCelda celdaRandom, CeldaJButton celdaCliqueada, JLabel labelVida, JLabel labelObjeto, JLabel iconoObjeto) {
        botonSeleccionado.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ImageIcon iconoNuevo = new ImageIcon(getClass().getResource("/Imagenes/CeldaGramaGallina.png"));
                ImageIcon iconoMini = new ImageIcon(getClass().getResource("/Imagenes/imagenGallina.png"));
                Gallina gallina = new Gallina(100, "Gallina");
                ManejadorVida manejadorVida = new ManejadorVida(labelVida, gallina, gallina.getVidaAnimal(), 2);
                labelObjeto.setText(gallina.getNombreAnimal());
                labelVida.setText(Integer.toString(gallina.getVidaAnimal()));
                iconoObjeto.setIcon(iconoMini);
                celdaCliqueada.setIcon(iconoNuevo);
            }
        });
    }

    public void cambiarImagenGramaZanahoria(JMenuItem botonSeleccionado, TipoDeCelda celdaRandom, CeldaJButton celdaCliqueada, JLabel labelVida, JLabel labelObjeto, JLabel iconoObjeto) {
        botonSeleccionado.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ImageIcon iconoNuevo = new ImageIcon(getClass().getResource("/Imagenes/CeldaGramaZanahorias.png"));
                ImageIcon iconoMini = new ImageIcon(getClass().getResource("/Imagenes/imagenZanahoria.png"));
                Zanahoria zanahoria = new Zanahoria(100, "Zanahoria");
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
                Manzano manzano = new Manzano(100, "Manzano");
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
                Tomate tomate = new Tomate(100, "Tomate");
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
                Maiz maiz = new Maiz(100, "Maiz");
                ManejadorVida manejadorVida = new ManejadorVida(labelVida, maiz, maiz.getVidaSemilla(), 6);
                labelObjeto.setText(maiz.getNombreSemilla());
                labelVida.setText(Integer.toString(maiz.getVidaSemilla()));
                iconoObjeto.setIcon(iconoMini);
                celdaCliqueada.setIcon(iconoNuevo);
            }
        });
    }

}
