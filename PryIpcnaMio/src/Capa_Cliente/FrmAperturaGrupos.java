/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capa_Cliente;

import Capa_Datos.Lista_Docentes;
import Capa_Datos.Lista_Grupos;
import Capa_Datos.Lista_Horarios;
import Capa_Datos.Lista_Programas;
import Capa_Logica.Docente;
import Capa_Logica.Horario;
import Capa_Logica.Grupo;
import Capa_Logica.Programa;
import TListas.TLista;
import java.util.Calendar;
import javax.swing.JOptionPane;



/**
 *
 * @author USER
 */
public final class FrmAperturaGrupos extends javax.swing.JInternalFrame {

    /**
     * Creates new form FrmAperturaGrupos
     */
    public FrmAperturaGrupos() {
        initComponents();
        lblSubNivel.setVisible(false);
        cboSubNivel.setVisible(false);
        
       TLista datos = Lista_Docentes.Consultar();
    for (int i = 0; i < datos.Cantidad(); i++) {
            Docente doc = (Docente) datos.Obtener(i);
            cboDocente.addItem(doc.getCodigoDocente()+'-'+doc.getNombre()+' '+doc.getApellidos());
        }
        TLista listaPro = Lista_Programas.obtener();
        for (int i = 0; i < listaPro.Cantidad(); i++) {
            Programa pr = (Programa) listaPro.Obtener(i);
            if(pr.getTipoNivel().equalsIgnoreCase("regular"))
                pr.setCosto(285);
            else if(pr.getTipoNivel().equalsIgnoreCase("intensivo"))
                pr.setCosto(330);
            else if(pr.getTipoNivel().equalsIgnoreCase("superintensico"))
                pr.setCosto(455);
            else
                pr.setCosto(185);
                }
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtVacantes = new javax.swing.JTextField();
        cboAsignatura = new javax.swing.JComboBox<>();
        cboPrograma = new javax.swing.JComboBox<>();
        cboDocente = new javax.swing.JComboBox<>();
        cboHorario = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        cboNivel = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        lblSubNivel = new javax.swing.JLabel();
        cboSubNivel = new javax.swing.JComboBox<>();
        btnCrear = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtGrupo = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jLabel1.setText("Asignatura :");

        jLabel2.setText("Programa de estudios :");

        jLabel3.setText("Fecha de inicio :");

        jLabel4.setText("vacantes :");

        jLabel5.setText("Horario :");

        jLabel6.setText("Docentes :");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setText("Apertura de Grupos ");

        txtVacantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVacantesActionPerformed(evt);
            }
        });
        txtVacantes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtVacantesKeyTyped(evt);
            }
        });

        cboAsignatura.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ingles", "Español" }));

        cboPrograma.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Niños", "Adultos" }));

        jLabel8.setText("Nivel de estudios :");

        cboNivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboNivelActionPerformed(evt);
            }
        });

        jButton1.setText("Ver niveles");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lblSubNivel.setText("Sub Nivel para adultos");

        btnCrear.setText("Crear Grupo");
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar grupo");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        jLabel9.setText("Grupo :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(18, 18, 18)
                                        .addComponent(cboHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(18, 18, 18)
                                        .addComponent(cboNivel, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cboDocente, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cboPrograma, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(91, 91, 91)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtVacantes, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblSubNivel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cboSubNivel, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cboAsignatura, 0, 85, Short.MAX_VALUE)
                            .addComponent(txtGrupo))
                        .addGap(70, 70, 70)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCrear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(97, 97, 97))
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(btnCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel1)
                                .addComponent(cboAsignatura, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtVacantes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(cboDocente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(cboPrograma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(cboNivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cboHorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSubNivel)
                            .addComponent(cboSubNivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       String programa = (String) cboPrograma.getSelectedItem();
       TLista datos = Lista_Programas.obtener();
               
      if(programa.equalsIgnoreCase("niños")){
            for (int i = 0; i < datos.Cantidad(); i++) {
                Programa pr = (Programa) datos.Obtener(i);
                if(pr.getTipoPrograma().equalsIgnoreCase("niños")){
                 cboNivel.addItem(pr.getTipoNivel());
         }}
                TLista a = Lista_Horarios.obtener();
               for (int j = 0; j < a.Cantidad(); j++) {
                Horario h = (Horario) a.Obtener(j);
                if(h.getTipo().equalsIgnoreCase("niños"))
                    cboHorario.addItem(h.getDiasEstudio()+" "+h.getHoraInicio()+"-  a  -"+h.getHoraFin());
               }       
            }
           
       else{
                  
          cboNivel.removeAllItems();
          cboHorario.removeAllItems();
                        lblSubNivel.setVisible(true);
                        cboSubNivel.setVisible(true);
                       
                        cboNivel.addItem("regular");
                        cboNivel.addItem("intensivo");
                        cboNivel.addItem("superintensivo");
            for (int i = 0; i < 4; i++) {
                Programa pr = (Programa) datos.Obtener(i);
                if(pr.getTipoPrograma().equalsIgnoreCase("adultos")){
                    
                    cboSubNivel.addItem(pr.getSubNivel());  
                }
          
            }
                 TLista a = Lista_Horarios.obtener();
          
               for (int j = 0; j < a.Cantidad(); j++) {
                Horario h = (Horario) a.Obtener(j);
                if(h.getTipo().equalsIgnoreCase("adultos"))
                    cboHorario.addItem(h.getDiasEstudio() +" "+h.getHoraInicio()+"- a  -"+h.getHoraFin());}
          
        }   
       
    }//GEN-LAST:event_jButton1ActionPerformed
public boolean camposNulos(){
    if (txtGrupo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "DEBE INGRESAR CODIGO DE ESTUDIANTE", "SISTEMA", JOptionPane.ERROR_MESSAGE);
            txtGrupo.requestFocus();
            return true;
        }
      if (txtVacantes.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "DEBE INGRESAR DOCUMENTO DE IDENTIDAD", "SISTEMA", JOptionPane.ERROR_MESSAGE);
            txtVacantes.requestFocus();
            return true;
        }
      
        if (cboAsignatura.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(this, "DEBE SELECCIONAR TIPO DE DOCUMENTO", "SISTEMA", JOptionPane.ERROR_MESSAGE);
            cboAsignatura.requestFocus();
            return true;
        }
        if (cboHorario.getSelectedIndex()== -1) {
            JOptionPane.showMessageDialog(this, "DEBE INGRESAR SU NOMBRE ", "SISTEMA", JOptionPane.ERROR_MESSAGE);
            cboHorario.requestFocus();
            return true;
        }
        if (cboNivel.getSelectedIndex()== -1) {
            JOptionPane.showMessageDialog(this, "DEBE INGRESAR SU APELLIDO", "SISTEMA", JOptionPane.ERROR_MESSAGE);
            cboNivel.requestFocus();
            return true;
        }
          
        
    
    return false;}
    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
   
        Grupo estudy = new Grupo();
        if(camposNulos()){
        
            JOptionPane.showMessageDialog(rootPane, "FALTAN INGRESAR DATOS ", "mensaje de sistema", HEIGHT);
        }
        else{
        estudy.setAsignatura((String) cboAsignatura.getSelectedItem());
            int pos =cboDocente.getSelectedIndex();
            TLista lista=Lista_Docentes.Consultar();
            Docente doc =(Docente) lista.Obtener(pos);
            estudy.setCodigoDocente(doc.getCodigoDocente());
        TLista horariosFiltrados =Horario.filtroTipo((String) cboPrograma.getSelectedItem());
            int posicion =cboHorario.getSelectedIndex();
           Horario hor =(Horario) horariosFiltrados.Obtener(posicion);
           String codigoHor = hor.getCodigoHorario();
           estudy.setCodigoHorario(codigoHor);
        int posic = cboPrograma.getSelectedIndex();
        TLista programasFil = Programa.filtroXtipo((String) cboPrograma.getSelectedItem());
        Programa pr = (Programa) programasFil.Obtener(posic);
               String codigoPrograma = pr.getCodPrograma();
               estudy.setCodPrograma(codigoPrograma);
        estudy.setVacantes(Integer.parseInt(txtVacantes.getText()));
         estudy.setCodigoGrupo(txtGrupo.getText());
        estudy.setFechaInicio(cldFechaInicio.getCalendar());
        if(verificacion(cldFechaInicio.getCalendar(),txtGrupo.getText(),(String)cboAsignatura.getSelectedItem()))
            JOptionPane.showMessageDialog(rootPane, "EL GRUPO YA HA SIDO CREADO ANTERIORMENTE DIGITE UNA FECHA DIFERENTE, UN GRUPO DISTINTO "
                    + "O UNA DIFERENTE ASIGNATURA", "mensaje de sistema", HEIGHT);
        else{  Lista_Grupos.registrarGroup(estudy);
         JOptionPane.showMessageDialog(rootPane, "GRUPO REGISTRADO CON EXITO", "mensaje de sistema", HEIGHT);
         limpiar();}
        }
    }//GEN-LAST:event_btnCrearActionPerformed
    public void limpiar(){
        txtVacantes.setText("");
        txtGrupo.setText("");
        cboAsignatura.setSelectedIndex(0);
        cboDocente.setSelectedIndex(0);
        cboHorario.removeAllItems();
        cboNivel.removeAllItems();
        cboSubNivel.setVisible(false);
        cboPrograma.setSelectedIndex(0);
    }
    public boolean verificacion(Calendar fecha,String grupo,String asignatura){
        
        int g = Grupo.buscarGrupo(fecha, grupo, asignatura);
            if(g>=0)
                return true;
            else 
                return false;
 }
    private void cboNivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboNivelActionPerformed
       
    }//GEN-LAST:event_cboNivelActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
       int i =Grupo.buscarGrupo(cldFechaInicio.getCalendar(),txtGrupo.getText(),(String)cboAsignatura.getSelectedItem());
      if(i>=0){
       TLista list = Lista_Grupos.obtener();
       int seleccion =JOptionPane.showConfirmDialog(rootPane, "¿ESTA SEGURO DE ELIMINAR EL GRUPO SELECCIONADO?", "mensaje de sistema", HEIGHT);
       if(seleccion == JOptionPane.YES_OPTION){
           list.Eliminar(i);
       limpiar();}}
      else
      JOptionPane.showMessageDialog(rootPane, "NO SE HA ENCONTRADO EL GRUPO, DIGITE UNA FECHA , GRUPO Y ASIGNATURA CORRECTOS", "mensaje de sistema", HEIGHT);
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txtVacantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVacantesActionPerformed
     
    }//GEN-LAST:event_txtVacantesActionPerformed

    private void txtVacantesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtVacantesKeyTyped
       
       char c = evt.getKeyChar();
        if(!Character.isDigit(c)){
            evt.consume();
        }  
    }//GEN-LAST:event_txtVacantesKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JComboBox<String> cboAsignatura;
    private javax.swing.JComboBox<String> cboDocente;
    private javax.swing.JComboBox<String> cboHorario;
    private javax.swing.JComboBox<String> cboNivel;
    private javax.swing.JComboBox<String> cboPrograma;
    private javax.swing.JComboBox<String> cboSubNivel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblSubNivel;
    private javax.swing.JTextField txtGrupo;
    private javax.swing.JTextField txtVacantes;
    // End of variables declaration//GEN-END:variables
}
