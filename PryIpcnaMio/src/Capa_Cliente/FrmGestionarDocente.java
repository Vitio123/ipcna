/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capa_Cliente;

import Capa_Datos.Lista_Docentes;
import Capa_Logica.Docente;
import TListas.TLista;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author USER
 */
public class FrmGestionarDocente extends javax.swing.JInternalFrame {

    /**
     * Creates new form FrmRegistrarDocente
     */
    public FrmGestionarDocente() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtDocIdentidad = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtEspecialidad = new javax.swing.JTextField();
        txtApellidos = new javax.swing.JTextField();
        txtTitulo = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnVerDocente = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cboSexo = new javax.swing.JComboBox();
        txtCodDocente = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Registro Docente");

        jLabel1.setText("Código del Docente:");

        jLabel2.setText("Documento de identidad:");

        txtDocIdentidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDocIdentidadActionPerformed(evt);
            }
        });
        txtDocIdentidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDocIdentidadKeyTyped(evt);
            }
        });

        jLabel3.setText("Nombre:");

        jLabel4.setText("Apellidos:");

        jLabel5.setText("Título:");

        jLabel6.setText("Especialidad:");

        txtEspecialidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEspecialidadKeyTyped(evt);
            }
        });

        txtApellidos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidosKeyTyped(evt);
            }
        });

        txtTitulo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTituloKeyTyped(evt);
            }
        });

        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setText("Gestionar Docente:");

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        btnVerDocente.setText("...");
        btnVerDocente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerDocenteActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        jButton4.setText("Eliminar ");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel8.setText("Lista De Docentes Registrados:");

        jLabel9.setText("Sexo:");

        cboSexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Sin asignar", "Masculino", "Femenino" }));

        txtCodDocente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodDocenteActionPerformed(evt);
            }
        });
        txtCodDocente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodDocenteKeyTyped(evt);
            }
        });

        jButton1.setText("Actualizar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel1)
                        .addGap(0, 138, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtDocIdentidad, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                                    .addComponent(txtEspecialidad, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                                    .addComponent(txtTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                                    .addComponent(txtApellidos, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                                    .addComponent(cboSexo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtCodDocente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE))))))
                .addComponent(btnVerDocente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(53, 53, 53))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(btnVerDocente)
                            .addComponent(txtCodDocente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtDocIdentidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(cboSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
public DefaultTableModel tabla(){
    DefaultTableModel tablaAlum = new DefaultTableModel();
    TLista datos= Lista_Docentes.Consultar();
    tablaAlum.addColumn("NOMBRE");
    tablaAlum.addColumn("APELLIDOS");
    tablaAlum.addColumn("DOCUMENTO DE IDENTIDAD");
    tablaAlum.addColumn("ESPECIALIDAD");
    tablaAlum.addColumn("TITULO");
    tablaAlum.addColumn("CODIGO DOCENTE");
    
    Object[] arreglo = new Object [6];
    for (int i = 0; i < datos.Cantidad(); i++) {
        Docente E =  (Docente) datos.Obtener(i);
        arreglo[0]=E.getNombre();
        arreglo[1]=E.getApellidos();
        arreglo[2]=E.getDocIdentidad();
        arreglo[3]=E.getEspecialidad();
        arreglo[4]=E.getTitulo();
        arreglo[5]=E.getCodigoDocente();
        tablaAlum.addRow(arreglo);
    }
    
return tablaAlum;}
public int camposNulos(){
 if(txtCodDocente.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Ingresar Codigo del Docente", "SISTEMA", JOptionPane.ERROR_MESSAGE);
            txtCodDocente.requestFocus();
            return 1;
        }
        if(txtDocIdentidad.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Ingresar Documento de Identidad", "SISTEMA", JOptionPane.ERROR_MESSAGE);
            txtDocIdentidad.requestFocus();
            return 1;
        }
        if(txtNombre.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Ingresar Nombre del Docente", "SISTEMA", JOptionPane.ERROR_MESSAGE);
            txtNombre.requestFocus();
            return 1;
        }
        if(txtApellidos.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Ingresar Apellidos del Docente", "SISTEMA", JOptionPane.ERROR_MESSAGE);
            txtApellidos.requestFocus();
            return 1;
        }
        if(cboSexo.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(this, "Ingresar Sexo del Docente", "SISTEMA", JOptionPane.ERROR_MESSAGE);
            cboSexo.requestFocus();
            return 1;
        }
        if(txtTitulo.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Ingresar Titulo del Docente", "SISTEMA", JOptionPane.ERROR_MESSAGE);
            txtTitulo.requestFocus();
            return 1;
        }
        if(txtEspecialidad.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Ingresar Especialidad del Docente", "SISTEMA", JOptionPane.ERROR_MESSAGE);
            txtEspecialidad.requestFocus();
            return 1;
        }
        else return 0;
}
    
    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        // TODO add your handling code here:
        
        if (camposNulos()!=1){
        String codDocente = txtCodDocente.getText();
        String docIdentidad = txtDocIdentidad.getText();
        String nombre = txtNombre.getText();
        String apellidos = txtApellidos.getText();
        String titulo = txtTitulo.getText();
        String especialidad = txtEspecialidad.getText();
        
        Lista_Docentes objDoc = new Lista_Docentes();
        
        int val = objDoc.BuscarDocente(codDocente);
        
        if(val==-1){
           Docente objDocente = new Docente();
           objDocente.setCodigoDocente(codDocente);
           objDocente.setDocIdentidad(docIdentidad);
           objDocente.setNombre(nombre);
           objDocente.setApellidos(apellidos);
           objDocente.setTitulo(titulo);
           objDocente.setEspecialidad(especialidad);
           Lista_Docentes.registrarDoc(objDocente);
           
           JOptionPane.showMessageDialog(this, "Docente registrado correctamente","Sistema",JOptionPane.INFORMATION_MESSAGE);
            txtCodDocente.setText("");
            txtDocIdentidad.setText("");
            txtNombre.setText("");
            txtApellidos.setText("");
             txtTitulo.setText("");
            txtEspecialidad.setText("");
            txtCodDocente.requestFocus();
        }else{
            JOptionPane.showMessageDialog(this,"Docente ya Registrado","Sistema",JOptionPane.ERROR_MESSAGE);
        }}
       
        
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
       
        if(camposNulos()!=1){
        String codDocente = txtCodDocente.getText();
        
        String docIdentidad = txtDocIdentidad.getText();
        String nombre = txtNombre.getText();
        String apellidos = txtApellidos.getText();
        String titulo = txtTitulo.getText();
        String especialidad = txtEspecialidad.getText();
     
        int pos = Lista_Docentes.BuscarDocente(codDocente);
          if(pos!=-1){
        Docente objDocente = new Docente();
        objDocente.setCodigoDocente(codDocente);
        objDocente.setDocIdentidad(docIdentidad);
        objDocente.setNombre(nombre);
        objDocente.setApellidos(apellidos);
        objDocente.setTitulo(titulo);
        objDocente.setEspecialidad(especialidad);
            
        Lista_Docentes.Modificar(objDocente,pos);
        
        JOptionPane.showMessageDialog(this,"Se modificaron correctamente los datos del docente","Sistema",JOptionPane.INFORMATION_MESSAGE);
          }
          else
              JOptionPane.showMessageDialog(this,"INGRESE UN DOCENTE EXISTENTE","Sistema",JOptionPane.INFORMATION_MESSAGE);}
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnVerDocenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerDocenteActionPerformed
        // TODO add your handling code here:
        String codDocente = txtCodDocente.getText();
        
        Lista_Docentes objDocente = new Lista_Docentes();
        int pos = objDocente.BuscarDocente(codDocente);
        
        TLista lista = Lista_Docentes.Consultar();
        if(pos!=-1){
            Docente objDoc = (Docente)lista.Obtener(pos);

            txtCodDocente.setText(objDoc.getCodigoDocente());
            txtDocIdentidad.setText(objDoc.getDocIdentidad());
            txtNombre.setText(objDoc.getNombre());
            txtApellidos.setText(objDoc.getApellidos());
            txtTitulo.setText(objDoc.getTitulo());
            txtEspecialidad.setText(objDoc.getEspecialidad());
        
        }else{
            JOptionPane.showMessageDialog(this,"Docente no registrado","Sistema",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnVerDocenteActionPerformed

    private void txtDocIdentidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDocIdentidadKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(!Character.isDigit(c)||txtDocIdentidad.getText().length()==8){
            evt.consume();
        }
    }//GEN-LAST:event_txtDocIdentidadKeyTyped

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(Character.isDigit(c))
            evt.consume();
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtApellidosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidosKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(Character.isDigit(c))
            evt.consume();
    }//GEN-LAST:event_txtApellidosKeyTyped

    private void txtTituloKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTituloKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(Character.isDigit(c))
            evt.consume();
    }//GEN-LAST:event_txtTituloKeyTyped

    private void txtEspecialidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEspecialidadKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(Character.isDigit(c))
            evt.consume();
    }//GEN-LAST:event_txtEspecialidadKeyTyped

    private void txtCodDocenteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodDocenteKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodDocenteKeyTyped

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       
        if(txtCodDocente.getText().isEmpty()){
            JOptionPane.showMessageDialog(txtCodDocente,"REGISTRE DOCENTE A ELIMINAR", "mesaje del sistema", HEIGHT);
        }else{
            int index = Lista_Docentes.BuscarDocente(txtCodDocente.getText());
          if(index !=-1){
            TLista datos=Lista_Docentes.Consultar();
            Docente doc = (Docente) datos.Obtener(index); 
            txtNombre.setText(doc.getNombre());
            txtApellidos.setText(doc.getApellidos());
            txtDocIdentidad.setText(doc.getDocIdentidad());
            txtEspecialidad.setText(doc.getEspecialidad());
            txtTitulo.setText(doc.getTitulo());
            String sexo = (String) cboSexo.getSelectedItem();
            if(sexo.equalsIgnoreCase("masculino"))
                cboSexo.setSelectedIndex(1);
            else
                cboSexo.setSelectedIndex(2);
            
             int desicion = JOptionPane.showConfirmDialog(txtCodDocente, "¿DESEA ELIMINAR EL DOCENTE?", "mensaje del sistema", WIDTH);
                if(desicion == JOptionPane.YES_OPTION)
                {
                    Lista_Docentes.eliminar(txtCodDocente.getText());
                     txtCodDocente.setText("");
                     txtDocIdentidad.setText("");
                      txtNombre.setText("");
                     txtApellidos.setText("");
                     txtTitulo.setText("");
                     txtEspecialidad.setText("");
                     txtCodDocente.requestFocus();
                     JOptionPane.showMessageDialog(txtCodDocente, "DOCENTE ELIMINADO", "mesaje del sistema", WIDTH);
                }
          }
          else
              JOptionPane.showMessageDialog(txtCodDocente, "DOCENTE NO ENCONTRADO", "mesaje del sistema", WIDTH);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      jTable1.setModel(tabla());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtCodDocenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodDocenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodDocenteActionPerformed

    private void txtDocIdentidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDocIdentidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDocIdentidadActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnVerDocente;
    private javax.swing.JComboBox cboSexo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtCodDocente;
    private javax.swing.JTextField txtDocIdentidad;
    private javax.swing.JTextField txtEspecialidad;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
}
