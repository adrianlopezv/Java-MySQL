/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
public class VentanaEnvios extends javax.swing.JFrame {

    /**
     * Creates new form VentanaEnvios
     */
    public VentanaEnvios() {
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

        ConvenioTextField = new javax.swing.JTextField();
        NumEnviTextField = new javax.swing.JTextField();
        NumBolsTextField = new javax.swing.JTextField();
        ModificarButton = new javax.swing.JButton();
        InsertarButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        FechaTextField = new javax.swing.JTextField();
        TipoSTextField = new javax.swing.JTextField();
        ModoTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        ConvenioTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConvenioTextFieldActionPerformed(evt);
            }
        });

        ModificarButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ModificarButton.setText("Modificar");
        ModificarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarButtonActionPerformed(evt);
            }
        });

        InsertarButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        InsertarButton.setText("Insertar");
        InsertarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertarButtonActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Numero de bolsas");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Numero de envio");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Convenio");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Modo de envio");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Fecha de envio");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Tipo de sangre");

        FechaTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FechaTextFieldActionPerformed(evt);
            }
        });

        ModoTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModoTextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(109, 109, 109)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(NumBolsTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE)
                                        .addComponent(ConvenioTextField, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addComponent(NumEnviTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TipoSTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(FechaTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ModoTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(InsertarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90)
                        .addComponent(ModificarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(101, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ConvenioTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NumEnviTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(NumBolsTextField)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(TipoSTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FechaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ModoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ModificarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(InsertarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ConvenioTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConvenioTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ConvenioTextFieldActionPerformed

    private void ModificarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarButtonActionPerformed
        try {
            String Convenio,NumeroE,NumeroB,TipoS,FechaE,ModoE,Fecha;
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/db_bancosangre?verifyServerCertificate=false&useSSL=true";
            Connection mSQLcon = DriverManager.getConnection (url, "root", "root");
            Statement stmt = mSQLcon.createStatement ();

              if(!NumBolsTextField.getText().equals("") && !ConvenioTextField.getText().equals("") && !NumEnviTextField.getText().equals("")
                    &&!TipoSTextField.getText().equals("")&&!ModoTextField.getText().equals(""))
            {
                NumeroB=NumBolsTextField.getText();
                Convenio=ConvenioTextField.getText();
                NumeroE=NumEnviTextField.getText();
                TipoS=TipoSTextField.getText();
                ModoE=ModoTextField.getText();
                Date now = new Date(System.currentTimeMillis());
                    SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
                     SimpleDateFormat hour = new SimpleDateFormat("HH:mm:ss");
                     Fecha=date.format(now)+" "+hour.format(now);
                 mSQLcon.prepareStatement("UPDATE TB_Envio SET Convenio='"+Convenio+"',Num_Envio='"+NumeroE+"',Num_Bolsas="
                         +NumeroB+",Tipo_Sangre='"+TipoS+"',Fecha_env='"+Fecha+"',Mod_EnvIO='"+ModoE+"' WHERE NUM_ENVIO='"+NumeroE+"';").executeUpdate();
            limpiarTextField();
            }
        }
        catch(ClassNotFoundException | SQLException ex){
        }

       /* setNombre(" ");
        setConvenio(" ");
        setDireccion(" ");*/
    }//GEN-LAST:event_ModificarButtonActionPerformed

    private void InsertarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertarButtonActionPerformed
        try {
            String Convenio,NumeroE,NumeroB,TipoS,FechaE,ModoE,Fecha;
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/db_bancosangre?verifyServerCertificate=false&useSSL=true";
            Connection mSQLcon = DriverManager.getConnection (url, "root", "root");
            Statement stmt = mSQLcon.createStatement ();

            if(!NumBolsTextField.getText().equals("") && !ConvenioTextField.getText().equals("") && !NumEnviTextField.getText().equals("")
                    &&!TipoSTextField.getText().equals(""))
            {
                NumeroB=NumBolsTextField.getText();
                Convenio=ConvenioTextField.getText();
                NumeroE=NumEnviTextField.getText();
                TipoS=TipoSTextField.getText();
                ModoE=ModoTextField.getText();
                Date now = new Date(System.currentTimeMillis());
                    SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
                     SimpleDateFormat hour = new SimpleDateFormat("HH:mm:ss");
                     Fecha=date.format(now)+" "+hour.format(now);
                mSQLcon.prepareStatement("INSERT INTO TB_Envio(Convenio, Num_Envio,Num_Bolsas,Tipo_Sangre,Fecha_env,Mod_EnvIO) VALUES ("
                    + "'"+Convenio+"','"+NumeroE+"',"+NumeroB+",'"+TipoS+"','"+Fecha+"','"+ModoE+"');").executeUpdate();
            }
            limpiarTextField();
        }
        catch(ClassNotFoundException | SQLException ex){
        }
      
    }//GEN-LAST:event_InsertarButtonActionPerformed

    private void FechaTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FechaTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FechaTextFieldActionPerformed

    private void ModoTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModoTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ModoTextFieldActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaEnvios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaEnvios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaEnvios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaEnvios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaEnvios().setVisible(true);
            }
        });
    }
            public void ModificarRegistro()
        {
                this.ConvenioTextField.setEnabled(false);
                this.FechaTextField.setEnabled(false);
		this.ModoTextField.setEnabled(true);
		this.TipoSTextField.setEnabled(false);
		this.NumEnviTextField.setEnabled(false);
                this.InsertarButton.setEnabled(false);
                this.ModificarButton.setEnabled(true);
        }
    
public void InsertarRegistro()
        {
                this.ConvenioTextField.setEnabled(true);
                this.FechaTextField.setEnabled(false);
		this.ModoTextField.setEnabled(true);
		this.TipoSTextField.setEnabled(true);
		this.NumEnviTextField.setEnabled(true);
                this.InsertarButton.setEnabled(true);
                this.ModificarButton.setEnabled(false);
        }

public  String getNumE() {
		return this.NumEnviTextField.getText().trim();
	}
	
	public void setNumE(String nombre) {
		this.NumEnviTextField.setText(nombre);
	}
        
        public  String getConvenio() {
		return this.ConvenioTextField.getText().trim();
	}
	
	public void setConvenio(String nombre) {
		this.ConvenioTextField.setText(nombre);
	}
        
        public  String getNumB() {
		return this.NumBolsTextField.getText().trim();
	}
	
	public void setNumB(String nombre) {
		this.NumBolsTextField.setText(nombre);
	}
        
        public  String getFechaEnv() {
		return this.FechaTextField.getText().trim();
	}
	
	public void setFechaEnv(String nombre) {
		this.FechaTextField.setText(nombre);
	}
        
         public  String getTipoSangre() {
		return this.TipoSTextField.getText().trim();
	}
	
	public void setTipoSangre(String nombre) {
		this.TipoSTextField.setText(nombre);
	}  
                public  String getModoEnv() {
		return this.ModoTextField.getText().trim();
	}
	
	public void setModoEnv(String nombre) {
		this.ModoTextField.setText(nombre);
	}
        
	public void limpiarTextField() {
		this.setNumE(" ");
		this.setNumB(" ");
		this.setConvenio(" ");
                this.setTipoSangre(" ");
                this.setFechaEnv(" ");
                this.setModoEnv(" ");
                
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ConvenioTextField;
    private javax.swing.JTextField FechaTextField;
    private javax.swing.JButton InsertarButton;
    private javax.swing.JButton ModificarButton;
    private javax.swing.JTextField ModoTextField;
    private javax.swing.JTextField NumBolsTextField;
    private javax.swing.JTextField NumEnviTextField;
    private javax.swing.JTextField TipoSTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
