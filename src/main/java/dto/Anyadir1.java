/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import gp.Pelicula;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;

/**
 *
 * @author Santos Castillo
 */
public class Anyadir1 extends javax.swing.JDialog {

    ListaPeliculas lst;

    /**
     * Creates new form Anyadir1
     */
    public Anyadir1(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        lst = (ListaPeliculas) parent;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblGenero = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        btnSiguiente = new javax.swing.JButton();
        accion = new javax.swing.JCheckBox();
        comedia = new javax.swing.JCheckBox();
        cficcion = new javax.swing.JCheckBox();
        musical = new javax.swing.JCheckBox();
        fantasia = new javax.swing.JCheckBox();
        melodrama = new javax.swing.JCheckBox();
        drama = new javax.swing.JCheckBox();
        romance = new javax.swing.JCheckBox();
        thriller = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        lblNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblNombre.setText("Nombre:");

        lblGenero.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblGenero.setText("Género:");

        lblTitulo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTitulo.setText("Añadir película");

        btnSalir.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnSalir.setText("Atrás");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnSiguiente.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnSiguiente.setText("Siguiente");
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });

        accion.setText("Acción");

        comedia.setText("Comedia");

        cficcion.setText("C. Ficción");

        musical.setText("Musical");

        fantasia.setText("Fantasía");

        melodrama.setText("Melodrama");

        drama.setText("Drama");

        romance.setText("Romance");

        thriller.setText("Thriller");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addComponent(lblTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(66, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblGenero)
                                .addComponent(lblNombre))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnSalir)
                                .addGap(5, 5, 5)))
                        .addGap(67, 67, 67)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(musical, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(accion)
                                    .addComponent(drama))
                                .addGap(4, 4, 4)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSiguiente)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cficcion)
                                            .addComponent(fantasia)))
                                    .addComponent(romance))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(thriller)
                                    .addComponent(melodrama)
                                    .addComponent(comedia))))
                        .addGap(22, 22, 22))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comedia)
                    .addComponent(accion)
                    .addComponent(cficcion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fantasia)
                            .addComponent(melodrama))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(romance)
                            .addComponent(thriller)
                            .addComponent(musical)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lblGenero)
                        .addComponent(drama)))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalir)
                    .addComponent(btnSiguiente))
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed

        if (validarFormulario()) {

            Anyadir2 anyadir2 = new Anyadir2(this, true);

            anyadir2.setVisible(true);

        }

    }//GEN-LAST:event_btnSiguienteActionPerformed

    /**
     * @param args the command line arguments
     */
    public Pelicula parte1(String nombre, String genero) {

        return new Pelicula(nombre, genero, null, null, null);

    }

    public String getTxtNombre() {

        return txtNombre.getText();

    }

    public String getGenero() {

        List<String> generos = new LinkedList<>();
        
        if (accion.isSelected()) {
            
            generos.add("Acción");
            
        }
        
        if (cficcion.isSelected()) {
            
            generos.add("C. Ficción");
            
        }
        
        if (comedia.isSelected()) {
            
            generos.add("Comedia");
            
        }
        
        if (drama.isSelected()) {
            
            generos.add("Drama");
            
        }
        
        if (fantasia.isSelected()) {
            
            generos.add("Fantasía");
            
        }
        
         if (melodrama.isSelected()) {
            
            generos.add("Melodrama");
            
        }
         
         if (musical.isSelected()) {
            
            generos.add("Musical");
            
        }
         
         if (romance.isSelected()) {
            
            generos.add("Romance");
            
        }
         
         if (thriller.isSelected()) {
            
            generos.add("Thriller");
            
        }
         
         return generos.stream().collect(Collectors.joining(", "));

    }

    public boolean validarFormulario() {

        if (getTxtNombre().isEmpty() || getTxtNombre() == null) {

            JOptionPane.showMessageDialog(this, "El nombre no es válido", "ERROR", JOptionPane.ERROR_MESSAGE);

            return false;
        }

        if (getGenero().isEmpty() || getGenero() == null) {

            JOptionPane.showMessageDialog(this, "Debe seleccionar al menos 1 género", "ERROR", JOptionPane.ERROR_MESSAGE);

            return false;
        }

        return true;

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox accion;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JCheckBox cficcion;
    private javax.swing.JCheckBox comedia;
    private javax.swing.JCheckBox drama;
    private javax.swing.JCheckBox fantasia;
    private javax.swing.JLabel lblGenero;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JCheckBox melodrama;
    private javax.swing.JCheckBox musical;
    private javax.swing.JCheckBox romance;
    private javax.swing.JCheckBox thriller;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
