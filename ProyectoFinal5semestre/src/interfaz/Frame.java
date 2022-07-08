
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


public class Frame extends javax.swing.JFrame {

    public int identificador=0;
    public Frame() {
        initComponents();
            GrupoBotones.add(Donadores);
            GrupoBotones.add(Inventario);
            GrupoBotones.add(Hospital);
            GrupoBotones.add(Envios);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GrupoBotones = new javax.swing.ButtonGroup();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
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
        BuscarTextField = new javax.swing.JTextField();
        Instruccion = new javax.swing.JLabel();
        TIPO = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        Accept = new javax.swing.JButton();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

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

        Envios.setText("Envíos");
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
        Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarActionPerformed(evt);
            }
        });

        Resurtir.setText("Resurtir");
        Resurtir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResurtirActionPerformed(evt);
            }
        });

        Buscar.setText("Buscar");
        Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarActionPerformed(evt);
            }
        });

        BuscarTextField.setText("Ingrese para realizar busquedas en Donador: Folio de donador. Para Inventario: Tipo de sangre. Para hospital: Convenio. Para envios: Numero de envio");
        BuscarTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarTextFieldActionPerformed(evt);
            }
        });

        Instruccion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel1.setText("Tipo de sangre");

        Accept.setText("OK");
        Accept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcceptActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Inventario)
                                    .addComponent(Donadores)
                                    .addComponent(Hospital)
                                    .addComponent(Envios)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(Agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(Modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(57, 57, 57)
                                .addComponent(Resurtir, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53)
                                .addComponent(Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 68, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BuscarTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(Instruccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                    .addComponent(TIPO))
                .addGap(53, 53, 53)
                .addComponent(Accept)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Donadores)
                        .addGap(18, 18, 18)
                        .addComponent(Inventario)
                        .addGap(18, 18, 18)
                        .addComponent(Hospital)
                        .addGap(18, 18, 18)
                        .addComponent(Envios)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Buscar, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                    .addComponent(Resurtir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Modificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Agregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BuscarTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Instruccion, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TIPO, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Accept))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DonadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DonadoresActionPerformed
        try {
           this.Agregar.setEnabled(true);
           this.Buscar.setEnabled(true);
           this.Modificar.setEnabled(true);
            this.Resurtir.setEnabled(false);
            this.TIPO.setEnabled(false);
            this.Accept.setEnabled(false);
            identificador=1;
            BuscarTextField.setText("");
            Instruccion.setText("Aqui ingrese el folio para hacer una busqueda y posteriormente modificar");
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
        }
        
          
    }//GEN-LAST:event_DonadoresActionPerformed

    private void InventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InventarioActionPerformed
       try {
           this.Agregar.setEnabled(false);
           this.Buscar.setEnabled(false);
           this.Modificar.setEnabled(false);
           this.Resurtir.setEnabled(true);
           this.TIPO.setEnabled(true);
           this.Accept.setEnabled(true);
           this.jLabel1.setText("Tipo de sangre");
           identificador=2;
             BuscarTextField.setText("");
             Instruccion.setText("Aqui ingrese el tipo de sangre para hacer una busqueda y posteriormente resurtir");
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
        }
    }//GEN-LAST:event_InventarioActionPerformed

    private void HospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HospitalActionPerformed
          try {
            this.Agregar.setEnabled(true);
           this.Buscar.setEnabled(true);
           this.Modificar.setEnabled(true);
              this.Resurtir.setEnabled(false);
              this.Accept.setEnabled(false);
              this.TIPO.setEnabled(false);
              identificador=3;
                BuscarTextField.setText("");
                Instruccion.setText("Aqui ingrese el convenio para hacer una busqueda y posteriormente modificar");
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
        } 
    }//GEN-LAST:event_HospitalActionPerformed

    private void EnviosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnviosActionPerformed
        try {
           this.Agregar.setEnabled(true);
           this.Buscar.setEnabled(true);
           this.Modificar.setEnabled(true);
            this.Resurtir.setEnabled(false);  
            this.Accept.setEnabled(false);
            this.TIPO.setEnabled(true);
            identificador=4;
              BuscarTextField.setText("");
              Instruccion.setText("Aqui ingrese el numero de envio para hacer una busqueda y posteriormente modificar");
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
        }
    }//GEN-LAST:event_EnviosActionPerformed
    
    private void AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarActionPerformed
switch(identificador)
{
    case 1:
        VentanaAgregarDonador ventanadonador=new VentanaAgregarDonador();
        ventanadonador.InsertarRegistro();
        ventanadonador.setVisible(true);
        break;
    case 3:
        VentanaHospital ventanahospital=new VentanaHospital();
        ventanahospital.InsertarRegistro();
        ventanahospital.setVisible(true);
        break;
    case 4:
        VentanaEnvios ventanaenvios=new VentanaEnvios();
        ventanaenvios.InsertarRegistro();
        ventanaenvios.setVisible(true);
        break;
}
    }//GEN-LAST:event_AgregarActionPerformed

    private void ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarActionPerformed
        switch(identificador)
        {
            case 1:
                try {
                    String registro [] = new String [4];
            VentanaAgregarDonador ventanadonador=new VentanaAgregarDonador();
            ventanadonador.ModificarRegistro();
                        String url = "jdbc:mysql://localhost:3306/db_bancosangre?verifyServerCertificate=false&useSSL=true";
            Connection mSQLcon = DriverManager.getConnection (url, "root", "root");
             Statement stmt = mSQLcon.createStatement ();
            ResultSet r= stmt.executeQuery("SELECT * FROM TB_DONADOR WHERE FOLIO_DONADOR='"+BuscarTextField.getText()+"';");
           
           while(r.next()){
            
                registro[0] = r.getString(1);
                registro[1] = r.getString(2);
                registro[2] = r.getString(3);
                registro[3] = r.getString(4);
           }
            ventanadonador.setNombre(registro[0]);
            ventanadonador.setAPP(registro[1]);
            ventanadonador.setAPM(registro[2]);
            ventanadonador.setFolio(registro[3]);
            ventanadonador.setVisible(true);
} catch (SQLException ex) {
            Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
        }
            break;
            case 3:

            try {
                    String registro [] = new String [4];
                       VentanaHospital ventanahospital=new VentanaHospital();
            ventanahospital.ModificarRegistro();
           
                        String url = "jdbc:mysql://localhost:3306/db_bancosangre?verifyServerCertificate=false&useSSL=true";
            Connection mSQLcon = DriverManager.getConnection (url, "root", "root");
             Statement stmt = mSQLcon.createStatement ();
            ResultSet r= stmt.executeQuery("SELECT * FROM TB_HOSPITAL WHERE CONVENIO='"+BuscarTextField.getText()+"';");
           
           while(r.next()){
            
                registro[0] = r.getString(1);
                registro[1] = r.getString(2);
                registro[2] = r.getString(3);
           }
            ventanahospital.setNombre(registro[2]);
            ventanahospital.setConvenio(registro[0]);
            ventanahospital.setDireccion(registro[1]);
             ventanahospital.setVisible(true);
} catch (SQLException ex) {
            Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
        }

            break;
            
            case 4:
                      try {
                    String registro [] = new String [6];
                    String numenvio,tipos;
                    int contador=0;
                       VentanaEnvios ventanaenvios=new VentanaEnvios();
            ventanaenvios.ModificarRegistro();
           
                        String url = "jdbc:mysql://localhost:3306/db_bancosangre?verifyServerCertificate=false&useSSL=true";
            Connection mSQLcon = DriverManager.getConnection (url, "root", "root");
             Statement stmt = mSQLcon.createStatement ();
            
            ResultSet r= stmt.executeQuery("SELECT * FROM TB_Envio WHERE num_envio='"+BuscarTextField.getText()+"'&& TIPO_SANGRE='"
                    + TIPO.getText()+"';");
           numenvio=BuscarTextField.getText();
           while(r.next()){
            
                registro[0] = r.getString(1);
                registro[1] = r.getString(2);
                registro[2] = r.getString(3);
                registro[3] = r.getString(4);
                registro[4] = r.getString(5);
                registro[5] = r.getString(6);
                contador++;
           }
           ventanaenvios.setNumE(registro[0]);
           ventanaenvios.setConvenio(registro[1]);
           ventanaenvios.setNumB(registro[2]);
           ventanaenvios.setTipoSangre(registro[3]);
           ventanaenvios.setFechaEnv(registro[4]);
           ventanaenvios.setModoEnv(registro[5]);
           ventanaenvios.setVisible(true);
           /*if(contador>1)
           {
               System.out.println("Aqui");
           Instruccion.setText("Ahora inserte el tipo de sangre a resurtir"); 
           do
           {
           tipos=BuscarTextField.getText(); 
           System.out.println(tipos);
           }while(numenvio.equals(BuscarTextField.getText()));
          
            r= stmt.executeQuery("SELECT * FROM TB_Envio WHERE num_envio='"+numenvio+"'&& tipo_sangre='"+tipos+"';");
           numenvio=BuscarTextField.getText();
           while(r.next()){
            
                registro[0] = r.getString(1);
                registro[1] = r.getString(2);
                registro[2] = r.getString(3);
                registro[3] = r.getString(4);
                registro[4] = r.getString(5);
                registro[5] = r.getString(6);
           }
           
           }
           else
           {
               System.out.println("Aca");
           ventanaenvios.setNumE(registro[0]);
           ventanaenvios.setConvenio(registro[1]);
           ventanaenvios.setNumB(registro[2]);
           ventanaenvios.setTipoSangre(registro[3]);
           ventanaenvios.setFechaEnv(registro[4]);
           ventanaenvios.setModoEnv(registro[5]);
             ventanaenvios.setVisible(true);
           }*/
           
} catch (SQLException ex) {
            Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
        }
            break;
        }
    }//GEN-LAST:event_ModificarActionPerformed

    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed
      try{
        Class.forName("com.mysql.jdbc.Driver");
        
            String url = "jdbc:mysql://localhost:3306/db_bancosangre?verifyServerCertificate=false&useSSL=true";
            Connection mSQLcon = DriverManager.getConnection (url, "root", "root");
            String Folio;
            String registro [] = new String [6];
            DefaultTableModel modelo=null;
            Statement stmt = mSQLcon.createStatement ();
            ResultSet r=null;
            switch(identificador)
       {
       case 1:
           Folio =BuscarTextField.getText();
           String[] titulos = {"Nombre","ApellidoM","ApellidoP","Folio"};
           modelo = new DefaultTableModel (null,titulos);
           r=stmt.executeQuery("SELECT * FROM TB_DONADOR WHERE FOLIO_DONADOR = '"+Folio+"'");
           while(r.next()){
               registro[0] = r.getString(1);
               registro[1] = r.getString(2);
               registro[2] = r.getString(3);
               registro[3] = r.getString(4);
               
               modelo.addRow(registro);
           }
            break;
       case 2:
            Folio =BuscarTextField.getText();
           String[] titulos1 = {"Tipo de sangre","Bolsas minimas","Bolsas actuales"};
          modelo = new DefaultTableModel (null,titulos1);
           r=stmt.executeQuery("SELECT * FROM TB_INVENTARIO WHERE TIPO_SANGRE = '"+Folio+"'");
           while(r.next()){
               registro[0] = r.getString(1);
               registro[1] = r.getString(2);
               registro[2] = r.getString(3);
               
               modelo.addRow(registro);
           }
           break;
        case 3:
         Folio =BuscarTextField.getText();
         String[] titulos2 = {"Convenio","Direccion","Nombre"};
          modelo = new DefaultTableModel (null,titulos2);
           r=stmt.executeQuery("SELECT * FROM TB_HOSPITAL WHERE CONVENIO = '"+Folio+"'");
           while(r.next()){
               registro[0] = r.getString(1);
               registro[1] = r.getString(2);
               registro[2] = r.getString(3);
               modelo.addRow(registro);
           }
            break;
        case 4:
         Folio =BuscarTextField.getText();
         String[] titulos3 = {"Numero de envio","Convenio","Numero de bolsas","Tipo de sangre","Fecha de envio","Modo de envio"};
           modelo = new DefaultTableModel (null,titulos3);
           r=stmt.executeQuery("SELECT * FROM TB_ENVIO WHERE NUM_ENVIO = '"+Folio+"'");
          while(r.next()){
               registro[0] = r.getString(1);
               registro[1] = r.getString(2);
               registro[2] = r.getString(3);
               registro[3] = r.getString(4);
               registro[4] = r.getString(5);
               registro[5] = r.getString(6);
               
               modelo.addRow(registro);
           }
            break;
            }
           jTable1.setModel(modelo);
            }
           catch(ClassNotFoundException | SQLException ex){
        }
        
        
        
    }//GEN-LAST:event_BuscarActionPerformed

    private void BuscarTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarTextFieldActionPerformed
      
    }//GEN-LAST:event_BuscarTextFieldActionPerformed

    private void ResurtirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResurtirActionPerformed
        try {
 
            BuscarTextField.setText("");
            Instruccion.setText("Aqui ingrese el tipo de sangre a resurtir");
            Class.forName("com.mysql.jdbc.Driver");
        
            String url = "jdbc:mysql://localhost:3306/db_bancosangre?verifyServerCertificate=false&useSSL=true";
            Connection mSQLcon = DriverManager.getConnection (url, "root", "root");
            this.jLabel1.setText("Ingrese el numero de bolsas a agregar");
            String [] titulos = {"TipoSangre","BolsasMin","BolsasAct"};
            String registro [] = new String [3];
            
            DefaultTableModel modelo = new DefaultTableModel (null,titulos);
            Statement stmt = mSQLcon.createStatement ();
           ResultSet r= stmt.executeQuery("SELECT * FROM TB_INVENTARIO WHERE unit_bolsas_min>unit_bolsas_act;");
           
           while(r.next()){
               registro[0] = r.getString(1);
               registro[1] = r.getString(2);
               registro[2] = r.getString(3);
               
               modelo.addRow(registro);
           }
           
           jTable1.setModel(modelo);
            }
           catch(ClassNotFoundException | SQLException ex){
        }
        
    }//GEN-LAST:event_ResurtirActionPerformed

    private void AcceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AcceptActionPerformed
        try
        {
        Class.forName("com.mysql.jdbc.Driver");
        String Tipo;
        int cant;
            String url = "jdbc:mysql://localhost:3306/db_bancosangre?verifyServerCertificate=false&useSSL=true";
            Connection mSQLcon = DriverManager.getConnection (url, "root", "root");
            Statement stmt = mSQLcon.createStatement ();
            String [] titulos = {"TipoSangre","BolsasMin","BolsasAct"};
            String registro [] = new String [3];
            Tipo=BuscarTextField.getText();
            cant=Integer.parseInt(TIPO.getText());
            DefaultTableModel modelo = new DefaultTableModel (null,titulos);
            ResultSet r= stmt.executeQuery("SELECT * FROM TB_INVENTARIO WHERE unit_bolsas_min>unit_bolsas_act && Tipo_Sangre='"+Tipo+"';");
           while(r.next()){
               registro[0] = r.getString(1);
               registro[1] = r.getString(2);
               registro[2] = r.getString(3);
               
               modelo.addRow(registro);
           }
           
           jTable1.setModel(modelo);
           
           cant+=Integer.parseInt(registro[2]);
           mSQLcon.prepareStatement("UPDATE TB_inventario SET Tipo_Sangre = '"+registro[0]+"', Unit_Bolsas_Min='"+
                                   registro[1]+"',Unit_Bolsas_Act='"+cant+"' WHERE Tipo_Sangre='"+Tipo+"';").executeUpdate();
            }
           catch(ClassNotFoundException | SQLException ex){
           }
    }//GEN-LAST:event_AcceptActionPerformed

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Accept;
    private javax.swing.JButton Agregar;
    private javax.swing.JButton Buscar;
    private javax.swing.JTextField BuscarTextField;
    private javax.swing.JRadioButton Donadores;
    private javax.swing.JRadioButton Envios;
    private javax.swing.ButtonGroup GrupoBotones;
    private javax.swing.JRadioButton Hospital;
    private javax.swing.JLabel Instruccion;
    private javax.swing.JRadioButton Inventario;
    private javax.swing.JButton Modificar;
    private javax.swing.JButton Resurtir;
    private javax.swing.JTextField TIPO;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}

    class RadioButtonHandler implements ActionListener{
        
          public void actionPerformed (ActionEvent e){
            
          }   
     }

