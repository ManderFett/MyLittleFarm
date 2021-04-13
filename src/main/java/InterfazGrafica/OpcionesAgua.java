package InterfazGrafica;

import Celdas.CeldaJButton;
import Celdas.TipoDeCelda;
import ManejadoresControladores.ManejadorBote;
import ManejadoresControladores.ManejadorOpciones;

/**
 *
 * @author Marco Munguia <@markomannder>
 */
public class OpcionesAgua extends javax.swing.JFrame {

    ManejadorOpciones manejadorOpciones;

    /**
     * Creates new form NewJFrame
     *
     * @param celdaCliqueada
     * @param tipoDeCelda
     */
    public OpcionesAgua(CeldaJButton celdaCliqueada, TipoDeCelda celdaRandom) {
        initComponents();
        this.setLocation(430, 480);
        ManejadorBote manejadorImagenes = new ManejadorBote();
        manejadorImagenes.cambiarImagenAgua(colocarBotejButton, celdaRandom, celdaCliqueada, vidaBotejLabel, botejLabel, imagenBotejLabel);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        vidaBotejLabel = new javax.swing.JLabel();
        botejLabel = new javax.swing.JLabel();
        imagenBotejLabel = new javax.swing.JLabel();
        imagenVidajLabel = new javax.swing.JLabel();
        colocarBotejButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        vidaBotejLabel.setForeground(new java.awt.Color(0, 0, 0));
        vidaBotejLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(vidaBotejLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 130, 40));

        botejLabel.setForeground(new java.awt.Color(0, 0, 0));
        botejLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(botejLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 130, 40));
        getContentPane().add(imagenBotejLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 40, 40));

        imagenVidajLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/imagenVida.png"))); // NOI18N
        getContentPane().add(imagenVidajLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 40, 40));

        colocarBotejButton.setBackground(new java.awt.Color(0,0,0,0));
        colocarBotejButton.setForeground(new java.awt.Color(0, 0, 0));
        colocarBotejButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoOpcionesBoton.png"))); // NOI18N
        colocarBotejButton.setText("Colocar Bote Pesquero");
        colocarBotejButton.setToolTipText("");
        colocarBotejButton.setBorder(null);
        colocarBotejButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(colocarBotejButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 195, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoOpciones.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 213, 353));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel botejLabel;
    private javax.swing.JButton colocarBotejButton;
    private javax.swing.JLabel imagenBotejLabel;
    private javax.swing.JLabel imagenVidajLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel vidaBotejLabel;
    // End of variables declaration//GEN-END:variables

}
