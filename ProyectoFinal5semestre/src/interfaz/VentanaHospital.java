
package interfaz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


public class VentanaHospital extends javax.swing.JFrame {

    public VentanaHospital() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ConvenioTextField = new javax.swing.JTextField();
        DireccionTextField = new javax.swing.JTextField();
        NombreTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        InsertarButton = new javax.swing.JButton();
        ModificarButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        ConvenioTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConvenioTextFieldActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Convenio");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Direccion");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Nombre");

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
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(91, 91, 91)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ConvenioTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DireccionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NombreTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(InsertarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ModificarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(ConvenioTextField)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DireccionTextField))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NombreTextField))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ModificarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(InsertarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ConvenioTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConvenioTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ConvenioTextFieldActionPerformed

    private void ModificarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarButtonActionPerformed
       try {
           String Nombre,Convenio,Direccion;
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/db_bancosangre?verifyServerCertificate=false&useSSL=true";
            Connection mSQLcon = DriverManager.getConnection (url, "root", "root");
            Statement stmt = mSQLcon.createStatement ();
           
if(!ConvenioTextField.getText().equals("")&&!DireccionTextField.getText().equals("")&&!NombreTextField.equals(""));
        {
            Nombre=NombreTextField.getText();
            Convenio=ConvenioTextField.getText();
            Direccion=DireccionTextField.getText();
        int x=mSQLcon.prepareStatement("UPDATE TB_Hospital SET NOM_Hosp = '"+Nombre+"', Convenio='"+
                                   Convenio+"',Direc_Hosp='"+Direccion+"' WHERE Convenio='"+Convenio+"';").executeUpdate();
        }
            }
           catch(ClassNotFoundException | SQLException ex){
        }
      
        setNombre(" ");
        setConvenio(" ");
        setDireccion(" ");
    }//GEN-LAST:event_ModificarButtonActionPerformed

    private void InsertarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertarButtonActionPerformed
         try {
           String Nombre,Convenio,Direccion;
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/db_bancosangre?verifyServerCertificate=false&useSSL=true";
            Connection mSQLcon = DriverManager.getConnection (url, "root", "root");
            Statement stmt = mSQLcon.createStatement ();
           
if(NombreTextField.getText()!=null&&ConvenioTextField!=null&&DireccionTextField!=null)
        {
            Nombre=NombreTextField.getText();
            Convenio=ConvenioTextField.getText();
            Direccion=DireccionTextField.getText();
        mSQLcon.prepareStatement("INSERT INTO TB_Hospital(Convenio, Direc_Hosp,Nom_Hosp) VALUES ("
                        + "'"+Convenio+"'"+","+"'"+Direccion+"'"+","+"'"+Nombre+"');").executeUpdate();
        }
            }
           catch(ClassNotFoundException | SQLException ex){
        }
        setNombre(" ");
        setConvenio(" ");
        setDireccion(" ");
    }//GEN-LAST:event_InsertarButtonActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaHospital().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ConvenioTextField;
    private javax.swing.JTextField DireccionTextField;
    private javax.swing.JButton InsertarButton;
    private javax.swing.JButton ModificarButton;
    private javax.swing.JTextField NombreTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
  
    public  String getConvenio() {
		return this.ConvenioTextField.getText().trim();
	}
	
    public void setConvenio(String nombre) {
		this.ConvenioTextField.setText(nombre);
	}
        
    public  String getDireccion() {
		return this.DireccionTextField.getText().trim();
	}
	
    public void setDireccion(String nombre) {
		this.DireccionTextField.setText(nombre);
	}
    
    public  String getNombre() {
		return this.NombreTextField.getText().trim();
	}
	
    public void setNombre(String nombre) {
		this.NombreTextField.setText(nombre);
	}
        
    public void limpiarTextField() {
		this.setNombre(" ");
		this.setConvenio(" ");
		this.setDireccion(" ");
	}
    
    public void ModificarRegistro()
        {
                this.NombreTextField.setEnabled(true);
                this.DireccionTextField.setEnabled(true);
		this.ConvenioTextField.setEnabled(false);
                this.InsertarButton.setEnabled(false);
                 this.ModificarButton.setEnabled(true);
        }
    
    public void InsertarRegistro()
        {
                this.NombreTextField.setEnabled(true);
                this.DireccionTextField.setEnabled(true);
		this.ConvenioTextField.setEnabled(true);
                this.InsertarButton.setEnabled(true);
                this.ModificarButton.setEnabled(false);
        }
}
