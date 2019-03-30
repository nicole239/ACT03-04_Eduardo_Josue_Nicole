/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.Controlador;
import controller.DTOFarmacia;
import javax.swing.table.DefaultTableModel;
import model.Producto;


/**
 *
 * @author ericka
 */
public class FrmCatalogos extends javax.swing.JFrame {

  
    private Controlador elCtrl = Controlador.getInstance();
    private DTOFarmacia dtoFarmacia;
    
    
    /**
     * Creates new form FrmCatalogos
     */
    public FrmCatalogos() {
        initComponents();
        cargaTablaProductos();
        dtoFarmacia = new DTOFarmacia();
    }

    private void cargaTablaProductos(){
        elCtrl.recuperarProductos();
        DefaultTableModel modelo = new DefaultTableModel(elCtrl.getdTOProductos().getLosProductos().size(), 4);
        for (int i = 0; i < elCtrl.getdTOProductos().getLosProductos().size(); i++) {
            Producto p = (Producto) elCtrl.getdTOProductos().getLosProductos().get(i);
            modelo.setValueAt(p.getCodigo(), i, 0);
            modelo.setValueAt(p.getDescripcion(), i, 1);
            modelo.setValueAt(p.getUnidadesReq(), i, 2);
            modelo.setValueAt(p.getPuntos(), i, 3);
        }
        jTable1.setModel(modelo);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        panelProductos = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lblCodigo = new javax.swing.JLabel();
        txtCodigoPrd = new javax.swing.JTextField();
        lblDescripcion = new javax.swing.JLabel();
        lblUnidades = new javax.swing.JLabel();
        spUnidades = new javax.swing.JSpinner();
        txtDescripcion = new javax.swing.JTextField();
        btnRegistrarPrd = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        lblPuntos = new javax.swing.JLabel();
        txtPuntos = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableFarmacias = new javax.swing.JTable();
        lbTablaFarmaciasDisponibles = new javax.swing.JLabel();
        lbDescripcionFarmacia = new javax.swing.JLabel();
        lbTituloFarmacias = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        txtDescripcionFarmacia = new javax.swing.JTextField();
        lbTelefonoFarmacia = new javax.swing.JLabel();
        txtTelefonoFarmacia = new javax.swing.JTextField();
        btnRegistrarFarmacia = new javax.swing.JButton();
        btnConsultarFarmacia = new javax.swing.JButton();
        lbCodigoFarmacia = new javax.swing.JLabel();
        txtCodigoFarmacia = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Código", "Descripción", "Unidades Req.", "Puntos"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable1);

        lblCodigo.setText("Codigo");

        lblDescripcion.setText("Descripcion");

        lblUnidades.setText("Unidades requeridas");

        txtDescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescripcionActionPerformed(evt);
            }
        });

        btnRegistrarPrd.setText("Registrar");
        btnRegistrarPrd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarPrdActionPerformed(evt);
            }
        });

        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        lblPuntos.setText("Puntos ");

        javax.swing.GroupLayout panelProductosLayout = new javax.swing.GroupLayout(panelProductos);
        panelProductos.setLayout(panelProductosLayout);
        panelProductosLayout.setHorizontalGroup(
            panelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProductosLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(panelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelProductosLayout.createSequentialGroup()
                        .addGroup(panelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelProductosLayout.createSequentialGroup()
                                .addComponent(lblUnidades)
                                .addGap(28, 28, 28)
                                .addComponent(spUnidades, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblPuntos))
                            .addGroup(panelProductosLayout.createSequentialGroup()
                                .addComponent(lblCodigo)
                                .addGap(75, 75, 75)
                                .addComponent(txtCodigoPrd, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblDescripcion)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPuntos, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelProductosLayout.createSequentialGroup()
                        .addComponent(btnRegistrarPrd)
                        .addGap(37, 37, 37)
                        .addComponent(btnConsultar))
                    .addComponent(jScrollPane2))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        panelProductosLayout.setVerticalGroup(
            panelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProductosLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(panelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDescripcion, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblCodigo)
                        .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtCodigoPrd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(panelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUnidades)
                    .addComponent(spUnidades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPuntos)
                    .addComponent(txtPuntos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(panelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrarPrd)
                    .addComponent(btnConsultar))
                .addGap(51, 51, 51)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Productos", panelProductos);

        tableFarmacias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tableFarmacias);

        lbTablaFarmaciasDisponibles.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbTablaFarmaciasDisponibles.setText("Tabla de farmacias disponibles");

        lbDescripcionFarmacia.setText("Descripción");

        lbTituloFarmacias.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lbTituloFarmacias.setText("Farmacias");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setText("Crear farmacia");

        txtDescripcionFarmacia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescripcionFarmaciaActionPerformed(evt);
            }
        });

        lbTelefonoFarmacia.setText("Teléfono");

        btnRegistrarFarmacia.setText("Registrar");
        btnRegistrarFarmacia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarFarmaciaActionPerformed(evt);
            }
        });

        btnConsultarFarmacia.setText("Consultar");

        lbCodigoFarmacia.setText("Código");

        txtCodigoFarmacia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoFarmaciaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 645, Short.MAX_VALUE)
            .addComponent(jSeparator1)
            .addComponent(jSeparator2)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lbCodigoFarmacia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbTelefonoFarmacia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbDescripcionFarmacia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(49, 49, 49)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtTelefonoFarmacia, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                                    .addComponent(txtDescripcionFarmacia)
                                    .addComponent(txtCodigoFarmacia))
                                .addGap(40, 40, 40)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnRegistrarFarmacia, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnConsultarFarmacia, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbTablaFarmaciasDisponibles))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(260, 260, 260)
                        .addComponent(lbTituloFarmacias)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTituloFarmacias)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(jLabel4)
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigoFarmacia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbCodigoFarmacia)
                    .addComponent(btnRegistrarFarmacia))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnConsultarFarmacia)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbDescripcionFarmacia)
                        .addComponent(txtDescripcionFarmacia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelefonoFarmacia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTelefonoFarmacia))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbTablaFarmaciasDisponibles)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("Farmacias", jPanel1);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescripcionActionPerformed

    private void btnRegistrarPrdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarPrdActionPerformed
        
        // revisa las condiciones de ingreso de los datos y hace verificaciones
        
        
        int codigo = Integer.parseInt(txtCodigoPrd.getText());
        String descripcion = txtDescripcion.getText();
        int unidades = (int) spUnidades.getValue();
        int puntos = Integer.parseInt(txtPuntos.getText());
        
        
        // se carga el DTO que está en el controlador... 
        elCtrl.getdTOProductos().getUnProducto().setCodigo(codigo);
        elCtrl.getdTOProductos().getUnProducto().setDescripcion(descripcion);
        elCtrl.getdTOProductos().getUnProducto().setUnidadesReq(unidades);
        elCtrl.getdTOProductos().getUnProducto().setPuntos(puntos);
        
        boolean resultado = elCtrl.registrarProducto();
       
        System.out.println(resultado? "ingreso producto" : "problemas para ingresar producto");
        
        cargaTablaProductos();
    }//GEN-LAST:event_btnRegistrarPrdActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        int codigo = Integer.parseInt(txtCodigoPrd.getText());
        elCtrl.getdTOProductos().getUnProducto().setCodigo(codigo);
        boolean respuesta = elCtrl.recuperarProducto();
        if (respuesta){
            txtDescripcion.setText(""+ elCtrl.getdTOProductos().getUnProducto().getDescripcion());
            txtPuntos.setText(""+ elCtrl.getdTOProductos().getUnProducto().getPuntos());
            spUnidades.setValue(elCtrl.getdTOProductos().getUnProducto().getUnidadesReq());
            System.out.println("mostrar el contenido del producto");
        }
        else{
            System.out.println("reportar que el producto no existe.");
        }
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void txtCodigoFarmaciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoFarmaciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoFarmaciaActionPerformed

    private void btnRegistrarFarmaciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarFarmaciaActionPerformed
        // TODO add your handling code here:
        int codigo = Integer.parseInt(this.txtCodigoFarmacia.getText());
        String descripcion = this.txtDescripcionFarmacia.getText();
        String telefono = this.txtTelefonoFarmacia.getText();
        dtoFarmacia.getUnaFarmacia().setCodigo(codigo);
        elCtrl.registrarFarmacia(dtoFarmacia);
    }//GEN-LAST:event_btnRegistrarFarmaciaActionPerformed

    private void txtDescripcionFarmaciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescripcionFarmaciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescripcionFarmaciaActionPerformed

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
            java.util.logging.Logger.getLogger(FrmCatalogos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCatalogos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCatalogos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCatalogos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCatalogos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnConsultarFarmacia;
    private javax.swing.JButton btnRegistrarFarmacia;
    private javax.swing.JButton btnRegistrarPrd;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbCodigoFarmacia;
    private javax.swing.JLabel lbDescripcionFarmacia;
    private javax.swing.JLabel lbTablaFarmaciasDisponibles;
    private javax.swing.JLabel lbTelefonoFarmacia;
    private javax.swing.JLabel lbTituloFarmacias;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblPuntos;
    private javax.swing.JLabel lblUnidades;
    private javax.swing.JPanel panelProductos;
    private javax.swing.JSpinner spUnidades;
    private javax.swing.JTable tableFarmacias;
    private javax.swing.JTextField txtCodigoFarmacia;
    private javax.swing.JTextField txtCodigoPrd;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtDescripcionFarmacia;
    private javax.swing.JTextField txtPuntos;
    private javax.swing.JTextField txtTelefonoFarmacia;
    // End of variables declaration//GEN-END:variables
}
