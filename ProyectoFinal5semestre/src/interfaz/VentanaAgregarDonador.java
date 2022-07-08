
package interfaz;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class VentanaAgregarDonador extends javax.swing.JFrame {

    public VentanaAgregarDonador() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nombreTextField = new javax.swing.JTextField();
        APPTextField = new javax.swing.JTextField();
        APMTextField = new javax.swing.JTextField();
        FolioDTextField = new javax.swing.JTextField();
        TipoSangreTextField = new javax.swing.JTextField();
        InsertarButton = new javax.swing.JButton();
        ModificarButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Nombre");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Apellido Paterno");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Apellido Materno");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Folio Donador");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Tipo de sangre");

        nombreTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreTextFieldActionPerformed(evt);
            }
        });

        InsertarButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        InsertarButton.setText("Insertar");
        InsertarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertarButtonActionPerformed(evt);
            }
        });

        ModificarButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ModificarButton.setText("Modificar");
        ModificarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(91, 91, 91)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(nombreTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(APPTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(APMTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FolioDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TipoSangreTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(InsertarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ModificarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(nombreTextField)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(APPTextField))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(APMTextField))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FolioDTextField))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TipoSangreTextField))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(InsertarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ModificarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nombreTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreTextFieldActionPerformed

    private void InsertarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertarButtonActionPerformed
       try {
           String Nombre,ApellidoP,ApellidoM,FolioD;
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/db_bancosangre?verifyServerCertificate=false&useSSL=true";
            Connection mSQLcon = DriverManager.getConnection (url, "root", "root");
            Statement stmt = mSQLcon.createStatement ();
           
if(nombreTextField.getText()!=null&&APPTextField.getText()!=null&&APMTextField.getText()!=null&&FolioDTextField.getText()!=null&&TipoSangreTextField.getText()!=null)
        {
            Nombre=nombreTextField.getText();
            ApellidoP=APPTextField.getText();
            ApellidoM=APMTextField.getText();
            FolioD=FolioDTextField.getText();
        mSQLcon.prepareStatement("INSERT INTO TB_Donador(NOM_DONADOR, APP_DONADOR, APM_DONADOR, FOLIO_DONADOR) VALUES ("
                        + "'"+Nombre+"'"+","+"'"+ApellidoP+"'"+","+"'"+ApellidoM+"'"+","+"'"+FolioD+"'"+");").executeUpdate();
        }
            }
           catch(ClassNotFoundException | SQLException ex){
        }
        setNombre(" ");
        setAPP(" ");
        setAPM(" ");
        setFolio(" ");
        setTipoSangre(" ");
        
    }//GEN-LAST:event_InsertarButtonActionPerformed

    private void ModificarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarButtonActionPerformed
      try {
           String Nombre,ApellidoP,ApellidoM,FolioD;
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/db_bancosangre?verifyServerCertificate=false&useSSL=true";
            Connection mSQLcon = DriverManager.getConnection (url, "root", "root");
            Statement stmt = mSQLcon.createStatement ();
           
if(nombreTextField!=null&&APPTextField!=null&&APMTextField!=null&&FolioDTextField!=null&&TipoSangreTextField!=null)
        {
            Nombre=nombreTextField.getText();
            ApellidoP=APPTextField.getText();
            ApellidoM=APMTextField.getText();
            FolioD=FolioDTextField.getText();
        int x=mSQLcon.prepareStatement("UPDATE TB_Donador SET NOM_DONADOR = '"+Nombre+"', APP_DONADOR='"+
                                   ApellidoP+"',APM_DONADOR='"+ApellidoM+"' WHERE FOLIO_DONADOR="+FolioD+";").executeUpdate();
        }
            }
           catch(ClassNotFoundException | SQLException ex){
        }
      
        setNombre(" ");
        setAPP(" ");
        setAPM(" ");
        setFolio(" ");
        setTipoSangre(" ");
        
    }//GEN-LAST:event_ModificarButtonActionPerformed

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(VentanaAgregarDonador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaAgregarDonador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaAgregarDonador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaAgregarDonador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaAgregarDonador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField APMTextField;
    private javax.swing.JTextField APPTextField;
    private javax.swing.JTextField FolioDTextField;
    private javax.swing.JButton InsertarButton;
    private javax.swing.JButton ModificarButton;
    private javax.swing.JTextField TipoSangreTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField nombreTextField;
    // End of variables declaration//GEN-END:variables

    public  String getNombre() {
		return this.nombreTextField.getText().trim();
	}
	
	public void setNombre(String nombre) {
		this.nombreTextField.setText(nombre);
	}
        
        public  String getAPP() {
		return this.APPTextField.getText().trim();
	}
	
	public void setAPP(String nombre) {
		this.APPTextField.setText(nombre);
	}
        
        public  String getAPM() {
		return this.APMTextField.getText().trim();
	}
	
	public void setAPM(String nombre) {
		this.APMTextField.setText(nombre);
	}
        
        public  String getFolio() {
		return this.FolioDTextField.getText().trim();
	}
	
	public void setFolio(String nombre) {
		this.FolioDTextField.setText(nombre);
	}
        
         public  String getTipoSangre() {
		return this.TipoSangreTextField.getText().trim();
	}
	
	public void setTipoSangre(String nombre) {
		this.TipoSangreTextField.setText(nombre);
	}  
        
	public void limpiarTextField() {
		this.setNombre(" ");
		this.setAPP(" ");
		this.setAPM(" ");
                this.setTipoSangre(" ");
                this.setFolio(" ");
                
	}
        
        public void ModificarRegistro()
        {
                this.nombreTextField.setEnabled(true);
                this.APPTextField.setEnabled(true);
		this.APMTextField.setEnabled(true);
		this.TipoSangreTextField.setEnabled(true);
		this.FolioDTextField.setEnabled(false);
                this.InsertarButton.setEnabled(false);
                 this.ModificarButton.setEnabled(true);
        }
        
         public void InsertarRegistro()
        {
                this.nombreTextField.setEnabled(true);
                this.APPTextField.setEnabled(true);
		this.APMTextField.setEnabled(true);
		this.TipoSangreTextField.setEnabled(true);
		this.FolioDTextField.setEnabled(true);
                this.InsertarButton.setEnabled(true);
                this.ModificarButton.setEnabled(false);
        }
        
}
