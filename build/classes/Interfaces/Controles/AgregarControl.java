/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces.Controles;

import Clases.GuardadoDatos;
import GestionRiesgos.Control;
import GestionRiesgos.Riesgo;
import GestionRiesgos.TipoControl;
import Interfaces.Inicio;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author josue
 */
public class AgregarControl extends javax.swing.JFrame {
    private ArrayList<Riesgo> riesgosGuardados = new ArrayList<Riesgo>(); 
    /**
     * Creates new form AgregarControl
     */
    public AgregarControl() {
        initComponents();
        
        
        DefaultTableModel modeloTabla = new DefaultTableModel();
        
        ArrayList<Object> columnasModel = new ArrayList<Object>();
        
        //Columnas
        columnasModel.add("Nombre");
        columnasModel.add("Amenaza");
        
        for(Object columna : columnasModel){
            modeloTabla.addColumn(columna);
        }
        
        
        //Riesgos
        List<Riesgo> riesgosGuardados = GuardadoDatos.getRiesgos();
        
        ArrayList<List<String>> riesgosParaMostrar = new ArrayList<List<String>>(); 
        
        /*String nombreActivo, TipoDeActivo tipoActivo, Tag tagActivo, ValoracionCorta disponibilidad, ValoracionCorta integridad, ValoracionLarga confidencialidad*/
        
        for(Riesgo riesgo : riesgosGuardados){
            List<String> nuevo = new ArrayList<String>();
            nuevo.add(riesgo.getNombre());
            nuevo.add(riesgo.getCategoriaAmenaza().getAmenaza());
            
            riesgosParaMostrar.add(nuevo);
        }
        
        for(List<String> lista : riesgosParaMostrar){
            Object[] ingreso = lista.toArray();
            
           modeloTabla.addRow(ingreso);
        }
        
        
        this.tablaRiesgos.setModel(modeloTabla);
        tablaRiesgos.setAutoCreateRowSorter(true);
        
        //Setear combo box
        this.comboTipoControl.setModel(new DefaultComboBoxModel(TipoControl.values()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnRegresar = new javax.swing.JButton();
        labelTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaRiesgos = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaRiesgosSeleccionados = new javax.swing.JTable();
        labelTitulo1 = new javax.swing.JLabel();
        btnSeleccionar = new javax.swing.JButton();
        labelTitulo2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        labelText = new javax.swing.JLabel();
        txtDescripcion = new javax.swing.JTextField();
        labelText1 = new javax.swing.JLabel();
        comboTipoControl = new javax.swing.JComboBox<>();
        labelTag1 = new javax.swing.JLabel();
        labelTag2 = new javax.swing.JLabel();
        spinnerEficacia = new javax.swing.JSpinner();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(828, 549));
        setSize(new java.awt.Dimension(828, 549));

        jPanel1.setBackground(new java.awt.Color(189, 221, 211));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/atras.png"))); // NOI18N
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 14, 46, -1));

        labelTitulo.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        labelTitulo.setText("Nuevo Control");
        jPanel1.add(labelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(306, 25, -1, 24));

        tablaRiesgos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        tablaRiesgos.setMinimumSize(new java.awt.Dimension(921, 565));
        tablaRiesgos.setPreferredSize(new java.awt.Dimension(921, 565));
        jScrollPane1.setViewportView(tablaRiesgos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 108, 271, 162));

        tablaRiesgosSeleccionados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        tablaRiesgosSeleccionados.setMinimumSize(new java.awt.Dimension(921, 565));
        tablaRiesgosSeleccionados.setPreferredSize(new java.awt.Dimension(921, 565));
        jScrollPane2.setViewportView(tablaRiesgosSeleccionados);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 366, 271, 162));

        labelTitulo1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        labelTitulo1.setText("Riesgos Agregados");
        jPanel1.add(labelTitulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 326, -1, -1));

        btnSeleccionar.setText("AGREGAR");
        btnSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarActionPerformed(evt);
            }
        });
        jPanel1.add(btnSeleccionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 288, -1, -1));

        labelTitulo2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        labelTitulo2.setText("Riesgos");
        jPanel1.add(labelTitulo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 72, -1, 24));
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(516, 108, 250, -1));

        labelText.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labelText.setText("Nombre:");
        jPanel1.add(labelText, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 110, -1, -1));
        jPanel1.add(txtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(516, 150, 250, -1));

        labelText1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labelText1.setText("Descripción:");
        jPanel1.add(labelText1, new org.netbeans.lib.awtextra.AbsoluteConstraints(391, 152, -1, -1));

        jPanel1.add(comboTipoControl, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 192, 246, -1));

        labelTag1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labelTag1.setText("Tipo De Control:");
        jPanel1.add(labelTag1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 192, -1, -1));

        labelTag2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labelTag2.setText("Eficacia:");
        jPanel1.add(labelTag2, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 236, -1, -1));
        jPanel1.add(spinnerEficacia, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 236, 246, -1));

        btnGuardar.setText("GUARDAR");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(618, 411, 100, 40));

        btnCancelar.setText("CANCELAR");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(468, 411, 100, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 830, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        Inicio inicio = new Inicio();

        inicio.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarActionPerformed

        if(this.tablaRiesgos.getSelectedRow() > -1){
            String nombre;
            
            DefaultTableModel tm = (DefaultTableModel) tablaRiesgos.getModel();
            
            nombre = (String) tm.getValueAt(tablaRiesgos.getSelectedRow(),0);

            Riesgo riesgo = GuardadoDatos.buscarRiesgoPorNombre(nombre);

            System.out.println("Riesgo encontrado: "+ riesgo.toString());

            if(riesgo != null){
                //Se agrega el riesgo a la lista para luego ser añadido
                if(riesgosGuardados.add(riesgo)){
                    JOptionPane.showMessageDialog(null, "El riesgo se agregó correctamente");
                    
                    //Imprimir riesgos seleccionados en tabla secundaria
                    listarRiesgosSeelccionados();
                }
            }else{
                JOptionPane.showMessageDialog(null, "No se pudo seleccionar el riesgo, algo falló...");
            }

        }

    }//GEN-LAST:event_btnSeleccionarActionPerformed

    private void listarRiesgosSeelccionados(){
        //tablaRiesgosSeleccionados
                
        DefaultTableModel modeloTabla = new DefaultTableModel();
        
        ArrayList<Object> columnasModel = new ArrayList<Object>();
        
        //Columnas
        columnasModel.add("Nombre");
        columnasModel.add("Amenaza");
        
        for(Object columna : columnasModel){
            modeloTabla.addColumn(columna);
        }
        
        
        //Riesgos
        //List<Riesgo> riesgosGuardados = GuardadoDatos.getRiesgos();
        
        ArrayList<List<String>> riesgosParaMostrar = new ArrayList<List<String>>(); 
        
        /*String nombreActivo, TipoDeActivo tipoActivo, Tag tagActivo, ValoracionCorta disponibilidad, ValoracionCorta integridad, ValoracionLarga confidencialidad*/
        
        for(Riesgo riesgo : riesgosGuardados){
            List<String> nuevo = new ArrayList<String>();
            nuevo.add(riesgo.getNombre());
            nuevo.add(riesgo.getCategoriaAmenaza().getAmenaza());
            
            riesgosParaMostrar.add(nuevo);
        }
        
        for(List<String> lista : riesgosParaMostrar){
            Object[] ingreso = lista.toArray();
            
           modeloTabla.addRow(ingreso);
        }
        
        
        this.tablaRiesgosSeleccionados.setModel(modeloTabla);
        tablaRiesgosSeleccionados.setAutoCreateRowSorter(true);
    }
    
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        //Si el nombre está vacío
        if(!txtNombre.getText().isEmpty() && !txtDescripcion.getText().isEmpty() && !txtNombre.getText().isBlank() && !txtDescripcion.getText().isBlank()){
            //Si el nivel de eficacia no está en el rango de 0-10
            if(Integer.parseInt(spinnerEficacia.getValue().toString()) >= 0 && Integer.parseInt(spinnerEficacia.getValue().toString()) <= 10 ){
                
                    String nombre = this.txtNombre.getText();
                    String descripcion = this.txtDescripcion.getText();
                    String tipoControl = this.comboTipoControl.getSelectedItem().toString();
                    float eficacia = Float.parseFloat(String.valueOf(this.spinnerEficacia.getValue()));


                    //Creamos el nuevo control
                    Control nuevoControl = new Control(nombre, descripcion, TipoControl.valueOf(tipoControl), eficacia);

                    if(nuevoControl != null){

                        //Corroboramos que haya al menos un riesgo seleccionado
                        if(!riesgosGuardados.isEmpty()){
                            //Agregamos los riesgos seleccionados
                            for(Riesgo riesgo : riesgosGuardados){
                                //añadimos cada riesgo
                                nuevoControl.agregarRiesgo(riesgo);
                            }

                            //Guardamos los controles a la clase que almacena los datos
                            if(GuardadoDatos.agregarControl(nuevoControl)){
                                //Si se guardó correctamente
                                String mensaje = "Control guardado correctamente: Nombre:"+nuevoControl.getNombre()+" Tipo: "+nuevoControl.getTipoControl().toString();

                                JOptionPane.showMessageDialog(null, mensaje);
                            }else{
                                JOptionPane.showMessageDialog(null, "No se guardó el control correctamente.");
                            }

                            //Cerrar ventana
                            Inicio inicio = new Inicio();

                            inicio.setVisible(true);
                            this.dispose();
                        }else{
                            JOptionPane.showMessageDialog(null, "Debe seleccionar almenos un riesgo. No se guarda la información.");
                        }
                    }else{
                        JOptionPane.showMessageDialog(null, "El nuevo control no se generó correctamente");
                    }
            }else{
                JOptionPane.showMessageDialog(null, "El nivel de eficacia debe estar entre 0 y 10.");
            }
            
        }else{
            JOptionPane.showMessageDialog(null, "Debes ingresar un nombre y una descripción de riesgo.");
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        Inicio inicio = new Inicio();

        inicio.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AgregarControl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarControl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarControl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarControl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarControl().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnSeleccionar;
    private javax.swing.JComboBox<String> comboTipoControl;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelTag1;
    private javax.swing.JLabel labelTag2;
    private javax.swing.JLabel labelText;
    private javax.swing.JLabel labelText1;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JLabel labelTitulo1;
    private javax.swing.JLabel labelTitulo2;
    private javax.swing.JSpinner spinnerEficacia;
    private javax.swing.JTable tablaRiesgos;
    private javax.swing.JTable tablaRiesgosSeleccionados;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
