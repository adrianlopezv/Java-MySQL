
package interfaz;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import proyectofinal5semestre.ProyectoFinal5semestre;


public class Frame extends javax.swing.JFrame {

    public Frame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Donadores = new javax.swing.JRadioButton();
        Inventario = new javax.swing.JRadioButton();
        Hospital = new javax.swing.JRadioButton();
        Envios = new javax.swing.JRadioButton();
        Agregar = new javax.swing.JButton();
        Modificar = new javax.swing.JButton();
        Resurtir = new javax.swing.JButton();
        Buscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        Donadores.setText("Donadores");
        Donadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DonadoresActionPerformed(evt);
            }
        });

        Inventario.setText("Inventario");
        Inventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InventarioActionPerformed(evt);
            }
        });

        Hospital.setText("Hospital");
        Hospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HospitalActionPerformed(evt);
            }
        });

        Envios.setText("Env??os");
        Envios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnviosActionPerformed(evt);
            }
        });

        Agregar.setText("Agregar");
        Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarActionPerformed(evt);
            }
        });

        Modificar.setText("Modificar");

        Resurtir.setText("Resurtir");

        Buscar.setText("Buscar");
        Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(Modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(Resurtir, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Inventario)
                            .addComponent(Donadores)
                            .addComponent(Hospital)
                            .addComponent(Envios)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Donadores)
                        .addGap(18, 18, 18)
                        .addComponent(Inventario)
                        .addGap(18, 18, 18)
                        .addComponent(Hospital)
                        .addGap(18, 18, 18)
                        .addComponent(Envios)))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Agregar, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(Resurtir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Modificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Buscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 139, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void DonadoresActionPerformed(java.awt.event.ActionEvent evt) {                                          
        try {
            Class.forName("com.mysql.jdbc.Driver");
        
            String url = "jdbc:mysql://localhost:3306/db_bancosangre?verifyServerCertificate=false&useSSL=true";
            Connection mSQLcon = DriverManager.getConnection (url, "root", "root");
            
            String [] titulos = {"Nombre","ApellidoM","ApellidoP","Folio"};
            String registro [] = new String [4];
            
            DefaultTableModel modelo = new DefaultTableModel (null,titulos);
            Statement stmt = mSQLcon.createStatement ();
           ResultSet r= stmt.executeQuery("SELECT * FROM TB_DONADOR");
           
           while(r.next()){
               registro[0] = r.getString(1);
               registro[1] = r.getString(2);
               registro[2] = r.getString(3);
               registro[3] = r.getString(4);
               
               modelo.addRow(registro);
           }
           
           jTable1.setModel(modelo);
            }
           catch(ClassNotFoundException | SQLException ex){
            Logger.getLogger(ProyectoFinal5semestre.class.getName()).log(Level.SEVERE, null, ex);
        }
        
          
    }                                         

    private void InventarioActionPerformed(java.awt.event.ActionEvent evt) {                                           
       try {
            Class.forName("com.mysql.jdbc.Driver");
        
            String url = "jdbc:mysql://localhost:3306/db_bancosangre?verifyServerCertificate=false&useSSL=true";
            Connection mSQLcon = DriverManager.getConnection (url, "root", "root");
            
            String [] titulos = {"TipoSangre","BolsasMin","BolsasAct"};
            String registro [] = new String [3];
            
            DefaultTableModel modelo = new DefaultTableModel (null,titulos);
            Statement stmt = mSQLcon.createStatement ();
           ResultSet r= stmt.executeQuery("SELECT * FROM TB_INVENTARIO");
           
           while(r.next()){
               registro[0] = r.getString(1);
               registro[1] = r.getString(2);
               registro[2] = r.getString(3);
               
               modelo.addRow(registro);
           }
           
           jTable1.setModel(modelo);
            }
           catch(ClassNotFoundException | SQLException ex){
            Logger.getLogger(ProyectoFinal5semestre.class.getName()).log(Level.SEVERE, null, ex);
        }
    }                                          

    private void HospitalActionPerformed(java.awt.event.ActionEvent evt) {                                         
          try {
            Class.forName("com.mysql.jdbc.Driver");
        
            String url = "jdbc:mysql://localhost:3306/db_bancosangre?verifyServerCertificate=false&useSSL=true";
            Connection mSQLcon = DriverManager.getConnection (url, "root", "root");
            
            String [] titulos = {"Convenio","Direccion","Nombre"};
            String registro [] = new String [3];
            
            DefaultTableModel modelo = new DefaultTableModel (null,titulos);
            Statement stmt = mSQLcon.createStatement();   
            ResultSet r= stmt.executeQuery("SELECT * FROM TB_HOSPITAL");
           
           while(r.next()){
               
               registro[0] = r.getString(1);
               registro[1] = r.getString(2);
               registro[2] = r.getString(3);
               
               modelo.addRow(registro);
           }
           
           jTable1.setModel(modelo);
            }
           catch(ClassNotFoundException | SQLException ex){
            Logger.getLogger(ProyectoFinal5semestre.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }                                        

    private void EnviosActionPerformed(java.awt.event.ActionEvent evt) {                                       
        try {
            Class.forName("com.mysql.jdbc.Driver");
        
            String url = "jdbc:mysql://localhost:3306/db_bancosangre?verifyServerCertificate=false&useSSL=true";
            Connection mSQLcon = DriverManager.getConnection (url, "root", "root");
            
            String [] titulos = {"NumEnvio","Convenio","NumBolsas","TipoSangre","FechaEnv","ModEnv"};
            String registro [] = new String [6];
            
            DefaultTableModel modelo = new DefaultTableModel (null,titulos);
            Statement stmt = mSQLcon.createStatement ();
           ResultSet r= stmt.executeQuery("SELECT * FROM TB_ENVIO");
           
           while(r.next()){
               registro[0] = r.getString(1);
               registro[1] = r.getString(2);
               registro[2] = r.getString(3);
               registro[3] = r.getString(4);
               registro[4] = r.getString(5);
               registro[5] = r.getString(6);
               
               
               modelo.addRow(registro);
           }
           
           jTable1.setModel(modelo);
            }
           catch(ClassNotFoundException | SQLException ex){
            Logger.getLogger(ProyectoFinal5semestre.class.getName()).log(Level.SEVERE, null, ex);
        }
    }                                      
    
    
    private void AgregarActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
    }                                       

    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
    }                                      

    
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
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton Agregar;
    private javax.swing.JButton Buscar;
    private javax.swing.JRadioButton Donadores;
    private javax.swing.JRadioButton Envios;
    private javax.swing.JRadioButton Hospital;
    private javax.swing.JRadioButton Inventario;
    private javax.swing.JButton Modificar;
    private javax.swing.JButton Resurtir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration                   
}

    class RadioButtonHandler implements ActionListener{
        
          public void actionPerformed (ActionEvent e){
            
          }   
     }

   