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
public class EditarControl extends javax.swing.JFrame {
    private ArrayList<Riesgo> riesgosGuardados = new ArrayList<Riesgo>(); 
    Control controlEditado;
    /**
     * Creates new form EditarControl
     */
    public EditarControl() {
        initComponents();
        
        DefaultTableModel modeloTabla = new DefaultTableModel();
        
        ArrayList<Object> columnasModel = new ArrayList<Object>();
        
        //Agregar columnas
        columnasModel.add("Nombre");
        columnasModel.add("Tipo Control");
        
        
        for(Object columna : columnasModel){
            modeloTabla.addColumn(columna);
        }
        
        
        //Recuperas controles
        List<Control> controlesGuardados = GuardadoDatos.getControles();
        ArrayList<List<String>> controlesParaMostrar = new ArrayList<List<String>>(); 
        
        for(Control control : controlesGuardados){
            List<String> nuevo = new ArrayList<String>();
            
            
            nuevo.add(control.getNombre());
            nuevo.add(control.getTipoControl().toString());
            
            
            String riesgos = "";
            for(Riesgo riesgo : control.getRiesgos()){
                riesgos = riesgos+", "+riesgo.getNombre();
            }
            
            riesgos = riesgos.replaceFirst(",", "");
            
            nuevo.add(riesgos);
            
            controlesParaMostrar.add(nuevo);
        }
        
        for(List<String> lista : controlesParaMostrar){
            Object[] ingreso = lista.toArray();
            
           modeloTabla.addRow(ingreso);
        }
        
        this.tablaControlesExistentes.setModel(modeloTabla);
        tablaControlesExistentes.setAutoCreateRowSorter(true);
        
        
        //Listas Riesgos
        DefaultTableModel modeloTablaRiesgos = new DefaultTableModel();
        
        ArrayList<Object> columnasModelRiesgos = new ArrayList<Object>();
        
        //Agregar columnas
        columnasModelRiesgos.add("Nombre");
        columnasModelRiesgos.add("Amenaza");
        
        for(Object columna : columnasModelRiesgos){
            modeloTablaRiesgos.addColumn(columna);
        }
        
        
        //Recuperas riesgos
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
            
           modeloTablaRiesgos.addRow(ingreso);
        }
        
        this.tablaRiesgos.setModel(modeloTablaRiesgos);
        tablaRiesgos.setAutoCreateRowSorter(true);
        
        
        //Setear Combo Box
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
        txtNombre = new javax.swing.JTextField();
        labelText = new javax.swing.JLabel();
        labelText1 = new javax.swing.JLabel();
        txtDescripcion = new javax.swing.JTextField();
        comboTipoControl = new javax.swing.JComboBox<>();
        labelTag1 = new javax.swing.JLabel();
        labelTag2 = new javax.swing.JLabel();
        spinnerEficacia = new javax.swing.JSpinner();
        labelTitulo1 = new javax.swing.JLabel();
        labelTag3 = new javax.swing.JLabel();
        txtRiesgos = new javax.swing.JTextField();
        labelTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaControlesExistentes = new javax.swing.JTable();
        btnSeleccionar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaRiesgos = new javax.swing.JTable();
        labelTitulo2 = new javax.swing.JLabel();
        btnAgregarRiesgo = new javax.swing.JButton();
        labelTitulo3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaRiesgosSeleccionados = new javax.swing.JTable();
        btnCancelar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(848, 533));
        setSize(new java.awt.Dimension(848, 533));

        jPanel1.setBackground(new java.awt.Color(189, 221, 211));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/atras.png"))); // NOI18N
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 46, -1));
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 112, 250, -1));

        labelText.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labelText.setText("Nombre:");
        jPanel1.add(labelText, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 114, -1, -1));

        labelText1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labelText1.setText("Descripción:");
        jPanel1.add(labelText1, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 156, -1, -1));
        jPanel1.add(txtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 154, 250, -1));

        jPanel1.add(comboTipoControl, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 196, 250, -1));

        labelTag1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labelTag1.setText("Tipo De Control:");
        jPanel1.add(labelTag1, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 196, -1, -1));

        labelTag2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labelTag2.setText("Eficacia:");
        jPanel1.add(labelTag2, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 240, -1, -1));
        jPanel1.add(spinnerEficacia, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 240, 246, -1));

        labelTitulo1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        labelTitulo1.setText("Editar Control");
        jPanel1.add(labelTitulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 51, -1, -1));

        labelTag3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labelTag3.setText("Riesgos:");
        jPanel1.add(labelTag3, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 284, -1, -1));

        txtRiesgos.setEditable(false);
        jPanel1.add(txtRiesgos, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 284, 250, -1));

        labelTitulo.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        labelTitulo.setText("Existentes");
        jPanel1.add(labelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(702, 51, -1, 24));

        tablaControlesExistentes.setModel(new javax.swing.table.DefaultTableModel(
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
        tablaControlesExistentes.setMinimumSize(new java.awt.Dimension(921, 565));
        tablaControlesExistentes.setPreferredSize(new java.awt.Dimension(921, 565));
        jScrollPane1.setViewportView(tablaControlesExistentes);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(617, 109, 300, 273));

        btnSeleccionar.setText("Seleccionar");
        btnSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarActionPerformed(evt);
            }
        });
        jPanel1.add(btnSeleccionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(727, 400, 100, 30));

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
        jScrollPane2.setViewportView(tablaRiesgos);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 388, 271, 162));

        labelTitulo2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        labelTitulo2.setText("Riesgos");
        jPanel1.add(labelTitulo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 344, -1, -1));

        btnAgregarRiesgo.setText("AGREGAR");
        btnAgregarRiesgo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarRiesgoActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregarRiesgo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 565, -1, -1));

        labelTitulo3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        labelTitulo3.setText("Nuevos Riesgos");
        jPanel1.add(labelTitulo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(343, 350, -1, -1));

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
        jScrollPane3.setViewportView(tablaRiesgosSeleccionados);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(328, 388, 271, 162));

        btnCancelar.setText("CANCELAR");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(659, 557, 100, 40));

        btnGuardar.setText("GUARDAR");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(809, 557, 100, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 950, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        Inicio inicio = new Inicio();

        inicio.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarActionPerformed

        if(this.tablaControlesExistentes.getSelectedRow() > -1){
            String nombreRiesgo;
            DefaultTableModel tm = (DefaultTableModel) tablaControlesExistentes.getModel();
            nombreRiesgo = (String) tm.getValueAt(tablaControlesExistentes.getSelectedRow(),0);

            controlEditado = GuardadoDatos.buscarControlPorNombre(nombreRiesgo);

            System.out.println("Riesgo encontrado: "+ controlEditado.toString());

            txtNombre.setText(controlEditado.getNombre());
            txtDescripcion.setText(controlEditado.getDescripcion());
            
            comboTipoControl.setSelectedItem(controlEditado.getTipoControl().toString());

            spinnerEficacia.setValue(controlEditado.getEficaciaEsperada());
             
            String riesgos = "";
            for(Riesgo riesgo : controlEditado.getRiesgos()){
                riesgos = riesgos+", "+riesgo.getNombre();
            }
            
            riesgos = riesgos.replaceFirst(",", "");
            
            txtRiesgos.setText(riesgos);
            
            
            

        }
    }//GEN-LAST:event_btnSeleccionarActionPerformed

    private void btnAgregarRiesgoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarRiesgoActionPerformed

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
    }//GEN-LAST:event_btnAgregarRiesgoActionPerformed

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
    
    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        Inicio inicio = new Inicio();

        inicio.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        
        //Si el nombre está vacío
        if(!txtNombre.getText().isEmpty() && !txtDescripcion.getText().isEmpty() && !txtNombre.getText().isBlank() && !txtDescripcion.getText().isBlank()){
            //Si el nivel de eficacia no está en el rango de 0-10
            if(Float.parseFloat(spinnerEficacia.getValue().toString()) >= 0 && Float.parseFloat(spinnerEficacia.getValue().toString()) <= 10 ){
                controlEditado.setNombre(this.txtNombre.getText());
                controlEditado.setDescripcion(this.txtDescripcion.getText());
                controlEditado.setTipoControl(TipoControl.valueOf(this.comboTipoControl.getSelectedItem().toString()));
                controlEditado.setEficaciaEsperada(Integer.parseInt(this.spinnerEficacia.getValue().toString()));

                //Si no hay nuevos riesgos seleccionados
                if(riesgosGuardados.isEmpty()){
                    for(Riesgo riesgo : controlEditado.getRiesgos()){
                        riesgosGuardados.add(riesgo);
                    }
                }
                controlEditado.setRiesgos(riesgosGuardados);

                //Si fue guardado correctamente
                if(controlEditado.getNombre().compareTo(this.txtNombre.getText()) == 0){
                    //Si se guardó correctamente
                    String mensaje = "Control editado correctamente: Nombre:"+controlEditado.getNombre()+" Tipo: "+controlEditado.getTipoControl().toString();

                    JOptionPane.showMessageDialog(null, mensaje);

                    //Cerrar ventana
                    Inicio inicio = new Inicio();

                    inicio.setVisible(true);
                    this.dispose();

                }else{
                    JOptionPane.showMessageDialog(null, "El control no se pudo editar correctamente.");
                }
                
            }else{
                JOptionPane.showMessageDialog(null, "El nivel de eficacia debe estar entre 0 y 10.");
            }
            
        }else{
            JOptionPane.showMessageDialog(null, "Debes ingresar un nombre y una descripción de riesgo.");
        }
        
    }//GEN-LAST:event_btnGuardarActionPerformed

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
            java.util.logging.Logger.getLogger(EditarControl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditarControl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditarControl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditarControl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditarControl().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarRiesgo;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnSeleccionar;
    private javax.swing.JComboBox<String> comboTipoControl;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel labelTag1;
    private javax.swing.JLabel labelTag2;
    private javax.swing.JLabel labelTag3;
    private javax.swing.JLabel labelText;
    private javax.swing.JLabel labelText1;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JLabel labelTitulo1;
    private javax.swing.JLabel labelTitulo2;
    private javax.swing.JLabel labelTitulo3;
    private javax.swing.JSpinner spinnerEficacia;
    private javax.swing.JTable tablaControlesExistentes;
    private javax.swing.JTable tablaRiesgos;
    private javax.swing.JTable tablaRiesgosSeleccionados;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtRiesgos;
    // End of variables declaration//GEN-END:variables
}