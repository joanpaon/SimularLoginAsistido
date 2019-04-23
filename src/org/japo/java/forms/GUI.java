/*
 * Copyright 2019 José A. Pacheco Ondoño - joanpaon@gmail.com.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.forms;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.util.Arrays;
import java.util.Properties;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import org.japo.java.components.BackgroundPanel;
import org.japo.java.libraries.UtilesSwing;

/**
 *
 * @author José A. Pacheco Ondoño - joanpaon@gmail.com
 */
public final class GUI extends JFrame {

    // Referencias
    private final Properties prp;

    // Componentes
    private JPanel pnlPpal;

    // Fuentes
    private Font fntPapiro;

    // Imágenes
    private Image imgBack;

    // Posición ventana
    private int xIni;
    private int yIni;

    // Constructor
    public GUI(Properties prp) {
        // Conectar Referencia
        this.prp = prp;

        // Inicialización Anterior
        initBefore();

        // Creación Interfaz
        initComponents();

        // Inicializacion Posterior
        initAfter();
    }

    // Construcción - GUI
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblUser = new javax.swing.JLabel();
        txfUser = new javax.swing.JTextField();
        lblPass = new javax.swing.JLabel();
        psfPass = new javax.swing.JPasswordField();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Swing Asistido #08");
        setFocusable(false);
        setUndecorated(true);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });

        lblUser.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        lblUser.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUser.setText("Usuario");

        txfUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfUserActionPerformed(evt);
            }
        });
        txfUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txfUserKeyPressed(evt);
            }
        });

        lblPass.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        lblPass.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPass.setText("Contraseña");

        psfPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                psfPassActionPerformed(evt);
            }
        });
        psfPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                psfPassKeyPressed(evt);
            }
        });

        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });
        btnAceptar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnAceptarKeyPressed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        btnCancelar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnCancelarKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPass, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                            .addComponent(lblUser, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txfUser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(psfPass, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(btnAceptar, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(87, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {psfPass, txfUser});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAceptar, btnCancelar, lblPass, lblUser});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblUser, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(txfUser, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblPass, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(psfPass, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptar, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addGap(63, 63, 63))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lblPass, lblUser, psfPass, txfUser});

        setSize(new java.awt.Dimension(500, 300));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txfUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfUserActionPerformed
        procesarAccion(evt);
    }//GEN-LAST:event_txfUserActionPerformed

    private void psfPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_psfPassActionPerformed
        procesarAccion(evt);
    }//GEN-LAST:event_psfPassActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        procesarAccion(evt);
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        procesarAccion(evt);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnAceptarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnAceptarKeyPressed
        procesarTecla(evt);
    }//GEN-LAST:event_btnAceptarKeyPressed

    private void btnCancelarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnCancelarKeyPressed
        procesarTecla(evt);
    }//GEN-LAST:event_btnCancelarKeyPressed

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        iniciarArrastre(evt);
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        procesarArrastre(evt);
    }//GEN-LAST:event_formMouseDragged

    private void txfUserKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfUserKeyPressed
        procesarTecla(evt);
    }//GEN-LAST:event_txfUserKeyPressed

    private void psfPassKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_psfPassKeyPressed
        procesarTecla(evt);
    }//GEN-LAST:event_psfPassKeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JLabel lblPass;
    private javax.swing.JLabel lblUser;
    private javax.swing.JPasswordField psfPass;
    private javax.swing.JTextField txfUser;
    // End of variables declaration//GEN-END:variables
    //
    // Inicialización Anterior    
    private void initBefore() {
        // Establecer LnF
        UtilesSwing.establecerLnFProfile(prp.getProperty("look_and_feel_profile"));

        // Fuentes
        fntPapiro = UtilesSwing.generarFuenteRecurso(prp.getProperty("font_resource"));

        // Imágenes
        imgBack = UtilesSwing.importarImagenRecurso(prp.getProperty("img_back_resource"));

        // Panel Principal
        pnlPpal = new BackgroundPanel(imgBack);

        // Ventana Principal
        setContentPane(pnlPpal);
    }

    // Inicialización Posterior
    private void initAfter() {
        // Establecer Favicon
        UtilesSwing.establecerFavicon(this, prp.getProperty("img_favicon_resource"));

        // Tipografías
        lblUser.setFont(fntPapiro.deriveFont(Font.BOLD + Font.ITALIC, 30f));
        lblPass.setFont(fntPapiro.deriveFont(Font.BOLD + Font.ITALIC, 30f));
        txfUser.setFont(fntPapiro.deriveFont(Font.BOLD + Font.ITALIC, 30f));
        psfPass.setFont(new Font("SansSerif", Font.BOLD + Font.ITALIC, 16));
        btnAceptar.setFont(fntPapiro.deriveFont(Font.BOLD + Font.ITALIC, 30f));
        btnCancelar.setFont(fntPapiro.deriveFont(Font.BOLD + Font.ITALIC, 30f));

        // Ventana Principal
        setBackground(new Color(0, 0, 0, 0));
        setTitle(prp.getProperty("form_title"));
        int width = Integer.parseInt(prp.getProperty("form_width"));
        int height = Integer.parseInt(prp.getProperty("form_height"));
        setSize(width, height);
        setLocationRelativeTo(null);
    }

    // Evento de Acción - Respuesta
    private void procesarAccion(ActionEvent e) {
        if (e.getSource().equals(txfUser)) {
            psfPass.requestFocus();
        } else if (e.getSource().equals(psfPass)) {
//            procesarCredencial();
            btnAceptar.requestFocus();
//            txfUser.requestFocus();
        } else if (e.getSource().equals(btnAceptar)) {
            procesarCredencial();
            txfUser.requestFocus();
        } else {
            JOptionPane.showMessageDialog(this, "Proceso CANCELADO");
            UtilesSwing.terminarPrograma(this);
        }
    }

    // Evento de Teclado - Respuesta
    private void procesarTecla(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_ESCAPE:
                JOptionPane.showMessageDialog(this, "Proceso CANCELADO");
                UtilesSwing.terminarPrograma(this);
                break;
            case KeyEvent.VK_SPACE:
                if (e.getSource() instanceof JButton) {
                    e.consume();
                }
                break;
            case KeyEvent.VK_ENTER:
                if (e.getSource().equals(btnAceptar)) {
                    procesarCredencial();
                    txfUser.requestFocus();
                } else if (e.getSource().equals(btnCancelar)) {
                    JOptionPane.showMessageDialog(this, "Proceso CANCELADO");
                    UtilesSwing.terminarPrograma(this);
                }
        }
    }

    // Valida la credencial
    private void procesarCredencial() {
        try {
            // Credencial Introducida
            String userAct = txfUser.getText();
            char[] passAct = psfPass.getPassword();

            // Credencial Referencia
            String userRef = prp.getProperty("user");
            char[] passRef = prp.getProperty("pass").toCharArray();

            // Procesar Credencial
            if (userAct.equals(userRef) && Arrays.equals(passAct, passRef)) {
                // Iniciar Sesión Trabajo
                JOptionPane.showMessageDialog(this, "Acceso PERMITIDO");

                // Finalizar Sesión Trabajo
                UtilesSwing.terminarPrograma(this);
            } else {
                // Acceso Denegado
                throw new Exception();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Acceso DENEGADO");
        }
    }

    // Inicio de Arrastre de Ventana
    private void iniciarArrastre(MouseEvent e) {
        // Posición inicio arrastre
        xIni = e.getXOnScreen();
        yIni = e.getYOnScreen();
    }

    // Arrastre de Ventana
    private void procesarArrastre(MouseEvent e) {
        // Coordenada X
        int xFin = e.getXOnScreen();
        int xOff = xFin - xIni;
        xIni = xFin;

        // Coordenada Y
        int yFin = e.getYOnScreen();
        int yOff = yFin - yIni;
        yIni = yFin;

        // Posición de la ventana
        int xWin = getLocation().x;
        int yWin = getLocation().y;

        // Posiciona la ventana
        setLocation(xWin + xOff, yWin + yOff);
    }
}
