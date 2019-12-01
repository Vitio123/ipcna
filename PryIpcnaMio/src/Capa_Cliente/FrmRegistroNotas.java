/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capa_Cliente;

import Capa_Datos.Lista_Estudiantes;
import Capa_Datos.Lista_Notas;
import Capa_Logica.Estudiante;
import Capa_Logica.Matricula;
import Capa_Logica.Notas;
import TListas.TLista;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class FrmRegistroNotas extends javax.swing.JInternalFrame {

    /**
     * Creates new form FrmRegistroNotas
     */
    public FrmRegistroNotas() {
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

        notas1 = new Capa_Logica.Notas();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtCodigoEst = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtCodGrupo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtNota1 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        txtNota2 = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        setTitle("Registrar Notas");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setText("Registrar Notas:");

        jLabel1.setText("Codigo de estudiante :");

        jButton2.setText("...");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setText("Nombre:");

        jLabel4.setText("Apellidos:");

        txtApellido.setEditable(false);
        txtApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoKeyTyped(evt);
            }
        });

        txtNombre.setEditable(false);
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });

        jLabel2.setText("Codigo de Matricula:");

        txtCodGrupo.setEditable(false);

        jLabel5.setText("Nota Primera Evalución:");

        txtNota1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNota1ActionPerformed(evt);
            }
        });
        txtNota1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNota1KeyTyped(evt);
            }
        });

        jButton4.setText("+");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("-");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel6.setText("Nota Segunda Evalución:");

        jButton6.setText("-");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        txtNota2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNota2ActionPerformed(evt);
            }
        });
        txtNota2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNota2KeyTyped(evt);
            }
        });

        jButton7.setText("+");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jLabel8.setText("Situcación:");

        jLabel9.setText("???????????");

        jButton1.setText("Colocar");
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
                        .addGap(28, 28, 28)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(227, 227, 227)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel6))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtNota2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton7))
                                    .addComponent(jLabel9))
                                .addGap(30, 30, 30))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(txtCodGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(25, 25, 25)
                                        .addComponent(jButton5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtNota1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton4))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(17, 17, 17))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCodigoEst, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(jButton2)))))
                .addContainerGap(198, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCodigoEst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCodGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtNota1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4)
                    .addComponent(jButton5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtNota2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7)
                    .addComponent(jButton6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String estudiante = txtCodigoEst.getText();
       if(Matricula.matriculaAlumno(estudiante)==null){
       JOptionPane.showMessageDialog(rootPane, "ESTE ALUMNO NO ESTA MATRICULADO", "mensaje del sistema", HEIGHT);
       }else{
        Lista_Estudiantes objEstud = new Lista_Estudiantes();
        //listaEstudiant de la clase Estudiante
        TLista listaEstudiant  = objEstud.obtener();
        int pos = objEstud.BuscarAlumno(estudiante);
          
        
        if (pos != -1) {
            Estudiante objEstu = (Estudiante) listaEstudiant.Obtener(pos);
            txtNombre.setText(objEstu.getNombre());
            txtApellido.setText(objEstu.getApellidos());
              Matricula MatriEst =(Matricula) Matricula.matriculaAlumno(estudiante);
             txtCodGrupo.setText(MatriEst.getCodigoGrupo());
        }
        else{
            JOptionPane.showMessageDialog(this, "No existe el alumno");
        }
       }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoKeyTyped
        //VALIDACION TIEMPO REAL
        char c = evt.getKeyChar();
        if (Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtApellidoKeyTyped

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        //VALIDACION TIEMPO REAL
        char c = evt.getKeyChar();
        if (Character.isDigit(c)) {
            evt.consume();
            /* el metodo consume lo que hace es comer lo que esta
            dentro de la condcion,por lo tanto intuimos que es lo contrario :)*/
        }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       
        if (Integer.parseInt(txtNota1.getText())<=100&&Integer.parseInt(txtNota1.getText())>=0) {
                    int nota1 = Integer.parseInt(txtNota1.getText());
                    txtNota1.setText(String.valueOf(nota1+1));
        }
        else{
            JOptionPane.showMessageDialog(this, "Nota 1 errado");
        }


    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

           if (Integer.parseInt(txtNota1.getText())<=100&&Integer.parseInt(txtNota1.getText())>=0) {
                    int nota1 = Integer.parseInt(txtNota1.getText());
                    txtNota1.setText(String.valueOf(nota1-1));
        }
        else{
            JOptionPane.showMessageDialog(this, "Nota 1 errado");
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        
        if (Integer.parseInt(txtNota1.getText())<=100&&Integer.parseInt(txtNota1.getText())>=0) {
                    int nota1 = Integer.parseInt(txtNota1.getText());
                    txtNota1.setText(String.valueOf(nota1+1));
        }
        else{
            JOptionPane.showMessageDialog(this, "Nota 2 errado");
        } 

    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed

        if (Integer.parseInt(txtNota1.getText())<=100&&Integer.parseInt(txtNota1.getText())>=0) {
                    int nota1 = Integer.parseInt(txtNota1.getText());
                    txtNota1.setText(String.valueOf(nota1+1));
        }
        else{
            JOptionPane.showMessageDialog(this, "Nota 2 errado");
        }        

    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if(camposVacios()!=1){
        String codigoEst = txtCodigoEst.getText();
        
        String codMat = txtCodGrupo.getText();
        String nota1 = txtNota1.getText();
        String nota2 = txtNota2.getText();
     
        int pos = Lista_Notas.buscarMatEstudiante(codMat, codigoEst );
          if(pos!=-1){
        Notas objNotas = new Notas();
        objNotas.setCodigoEstudiante(codigoEst);
        objNotas.setCodigoMatricula(codMat);
        objNotas.setNota1(Integer.parseInt(nota1));
        objNotas.setNota2(Integer.parseInt(nota2));
              if (txtNota1.getText().isEmpty()||txtNota2.getText().isEmpty()) {
                          objNotas.setEstado("Faltan Notas");
              }
              else{
                  objNotas.setEstado(notaP());
              }
        
        Lista_Notas.modificar(objNotas,pos);
        
        JOptionPane.showMessageDialog(this,"Se modificaron correctamente los datos del docente","Sistema",JOptionPane.INFORMATION_MESSAGE);
          }
          else
              JOptionPane.showMessageDialog(this,"INGRESE UN ALUMNO EXISTENTE","Sistema",JOptionPane.INFORMATION_MESSAGE);}        

    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtNota1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNota1ActionPerformed
      
    }//GEN-LAST:event_txtNota1ActionPerformed

    private void txtNota2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNota2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNota2ActionPerformed

    private void txtNota1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNota1KeyTyped
      char c = evt.getKeyChar();
        if(!Character.isDigit(c)){
            evt.consume();
        }
    }//GEN-LAST:event_txtNota1KeyTyped

    private void txtNota2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNota2KeyTyped
       char c = evt.getKeyChar();
        if(!Character.isDigit(c)){
            evt.consume();
        }
    }//GEN-LAST:event_txtNota2KeyTyped
    private int camposVacios(){
         if(txtCodigoEst.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Ingresar Codigo del código Estudiante", "SISTEMA", JOptionPane.ERROR_MESSAGE);
            txtCodigoEst.requestFocus();
            return 1;
        }
        if(txtCodGrupo.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Ingresar Documento de código Grupo", "SISTEMA", JOptionPane.ERROR_MESSAGE);
            txtCodGrupo.requestFocus();
            return 1;
        }
        else return 0;
    }

    private String notaP(){
     float promedio = (Float.parseFloat(txtNota1.getText())+Float.parseFloat(txtNota2.getText()))/(2);
        if (promedio>=75) {
            return "Aprobado";
        }
        else{
          return "desaprobado";
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private Capa_Logica.Notas notas1;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCodGrupo;
    private javax.swing.JTextField txtCodigoEst;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNota1;
    private javax.swing.JTextField txtNota2;
    // End of variables declaration//GEN-END:variables
}
