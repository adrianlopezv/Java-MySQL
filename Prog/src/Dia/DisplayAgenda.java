package Dia;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.FlowLayout;
import java.sql.SQLException;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.WindowConstants;

public class DisplayAgenda extends JFrame{
    static final String URL = "jdbc:mysql://localhost:3306/db_clinica?verifyServerCertificate=false&useSSL=true";
    static final String USER = "root";
    static final String PASSWORD = "root";
    static final String DEFAULT_QUERY = "SELECT * FROM TB_Cita";
    
    private AgendaQueries queryAgenda = new AgendaQueries();
    private Tabla tableModel;
    private JTextField tablaArea;
    private JButton tablaButton;
    private JLabel tablaLabel;
    private JTextField filtroArea;
    private JButton filtroButton;
    private JLabel filtroLabel;
    private JTextField columnaArea;
    private JLabel columnaLabel;
    private JTextField resurtirArea;
    private JButton resurtirButton;
    private JLabel insertarLabel;
    private JTextArea insertarArea;
    private JButton insertarButton;
    private JPanel queryPanel;
    private JPanel tablaPanel;
    private JPanel insertarPanel;
    private JPanel resurtirPanel;
        
    public DisplayAgenda(){
        super("Actividad Diaria de la Clinica");
        try {
            queryAgenda = new AgendaQueries();
            tableModel = new Tabla(URL, USER, PASSWORD, DEFAULT_QUERY);
            tablaArea = new JTextField(20);
            tablaButton = new JButton("Mostrar Tabla");
            tablaLabel = new JLabel("Entidad: ");
            filtroArea = new JTextField(10);
            columnaArea = new JTextField(20);
            resurtirButton = new JButton("Resurtir");
            insertarArea = new JTextArea("", 3, 20);
            insertarArea.setWrapStyleWord(true);
            insertarArea.setLineWrap(true);
            insertarLabel = new JLabel("Informacion: ");
            insertarButton = new JButton("Insertar");
            resurtirArea = new JTextField(20);
            tablaPanel = new JPanel();
            queryPanel = new JPanel();
            insertarPanel = new JPanel();
            resurtirPanel = new JPanel();
            
            setLayout( new FlowLayout( FlowLayout.CENTER, 10, 10 ) );
            setSize(800, 700);
            setResizable( true );
            
            tablaPanel.setLayout(new BoxLayout( tablaPanel, BoxLayout.X_AXIS ) );
            tablaPanel.add(tablaLabel);
            tablaPanel.add( Box.createHorizontalStrut( 10 ) );
            tablaPanel.add(tablaArea);
            tablaPanel.add( Box.createHorizontalStrut( 10 ) );
            tablaPanel.add(tablaButton);
            tablaPanel.add( Box.createHorizontalStrut( 10 ) );
            add(tablaPanel);
            
            JTable resultTable = new JTable(tableModel);
            add(new JScrollPane (resultTable), BorderLayout.CENTER);
            final TableRowSorter< TableModel >sorter = new TableRowSorter<  >(tableModel);
            resultTable.setRowSorter(sorter);
            
            queryPanel.setLayout(new BoxLayout( queryPanel, BoxLayout.PAGE_AXIS ) );
            queryPanel.setBorder( BorderFactory.createTitledBorder("Buscar informacion" ) );
            columnaLabel = new JLabel("Columna: ");
            queryPanel.add( Box.createHorizontalStrut( 5 ) );
            queryPanel.add( columnaLabel );
            queryPanel.add( Box.createHorizontalStrut( 10 ) );
            queryPanel.add( columnaArea );
            queryPanel.add( Box.createHorizontalStrut( 10 ) );
            filtroLabel = new JLabel("Filtro: ");
            queryPanel.add( Box.createVerticalStrut( 10 ) );
            queryPanel.add( filtroLabel );
            queryPanel.add( Box.createHorizontalStrut( 10 ) );
            queryPanel.add( filtroArea );
            filtroButton = new JButton("Aplicar Filtro");
            queryPanel.add( filtroButton );
            queryPanel.add( Box.createHorizontalStrut( 5 ) );
            add(queryPanel);
            
            insertarPanel.setLayout(new BoxLayout( insertarPanel, BoxLayout.X_AXIS ) );
            insertarPanel.setBorder( BorderFactory.createTitledBorder("Crear nuevo" ) );
            insertarPanel.add(insertarLabel);
            insertarPanel.add( Box.createHorizontalStrut( 10 ) );
            insertarPanel.add(new JScrollPane (insertarArea), BorderLayout.CENTER);
            insertarPanel.add( Box.createHorizontalStrut( 10 ) );
            insertarPanel.add(insertarButton);
            insertarPanel.add( Box.createHorizontalStrut( 10 ) );
            add(insertarPanel);
            
            resurtirPanel.setLayout(new BoxLayout (resurtirPanel, BoxLayout.X_AXIS));
            resurtirPanel.setBorder( BorderFactory.createTitledBorder("Nombre del medicamento a resurtir" ) );
            resurtirPanel.add(resurtirArea);
            resurtirPanel.add( Box.createHorizontalStrut( 10 ) );
            resurtirPanel.add(resurtirButton);
            add(resurtirPanel);
                        
            tablaButton.addActionListener(
                new ActionListener(){
                    public void actionPerformed (ActionEvent event){
                        tablaButtonActionPerformed(event);
                    }
                }
            );
            filtroButton.addActionListener(
                new ActionListener(){
                    public void actionPerformed (ActionEvent event){
                        filtroButtonActionPerformed(event);
                    }
                }
            );
            resurtirButton.addActionListener(
                new ActionListener(){
                    public void actionPerformed (ActionEvent event){
                        resurtirButtonActionPerformed(event);
                    }
                }
            );
            insertarButton.addActionListener(
                new ActionListener(){
                    public void actionPerformed (ActionEvent event){
                        insertarButtonActionPerformed(event);
                    }
                }
            ); 
        } catch (SQLException sql){
            JOptionPane.showMessageDialog(null, "Error al conectarse", "Error al conectarse", JOptionPane.ERROR_MESSAGE);
            tableModel.disconnectFromDatabase();
            System.exit(1);
        }    
        addWindowListener(
            new WindowAdapter(){
                public void windowClosed (WindowEvent e){
                    tableModel.disconnectFromDatabase();
                    System.exit(0);
                }
            }    
        );
        setVisible(true);
        setDefaultCloseOperation (DISPOSE_ON_CLOSE);
    }
    
    private void tablaButtonActionPerformed(ActionEvent evt){
        try{
            String query = "SELECT * FROM tb_";
            String tabla = tablaArea.getText();
            query += tabla;
            tableModel.setQuery(query);
        } catch (SQLException sql){
            JOptionPane.showMessageDialog(null, "Tabla inexistente", "Tabla inexistente", JOptionPane.ERROR_MESSAGE);
            try{
                tableModel.setQuery(DEFAULT_QUERY);
            } catch (SQLException sql2){
                JOptionPane.showMessageDialog(null, "Error al conectarse", "Error al conectarse", JOptionPane.ERROR_MESSAGE);
                tableModel.disconnectFromDatabase();
                System.exit(1);
            }
        }
    }
    
    private void filtroButtonActionPerformed(ActionEvent evt){
        try{
            String tabla = tablaArea.getText();
            String columna = columnaArea.getText();
            String parametro = filtroArea.getText();
            String completo = "tb_" + tabla + "." + columna;
            String query = "SELECT * FROM tb_" + tabla + " WHERE " + completo + " = '" + parametro + "'";
            tableModel.setQuery(query);
        } catch (SQLException sql){
            JOptionPane.showMessageDialog(null, "Error en la operacion", "Error en la operacion", JOptionPane.ERROR_MESSAGE);
            try{
                tableModel.setQuery(DEFAULT_QUERY);
            } catch (SQLException sql2){
                JOptionPane.showMessageDialog(null, "Error al conectarse", "Error al conectarse", JOptionPane.ERROR_MESSAGE);
                tableModel.disconnectFromDatabase();
                System.exit(1);
            }
        }
    }
        
    private void resurtirButtonActionPerformed(ActionEvent evt){
        int resultado = queryAgenda.resurtirMedicamento(resurtirArea.getText(), 40);
        
        if (resultado == 1){
            JOptionPane.showMessageDialog(this, "Producto resurtido!", "Producto resurtido", JOptionPane.PLAIN_MESSAGE);
        } else{
            JOptionPane.showMessageDialog(this, "Producto no resurtido!", "Error", JOptionPane.PLAIN_MESSAGE);
        }
    }
    
    private void insertarButtonActionPerformed(ActionEvent evt){
        int resultado = queryAgenda.insertarNuevo(tablaArea.getText(), insertarArea.getText());
        
        if (resultado == 1){
            JOptionPane.showMessageDialog(this, "Agregado correctamente!", "Agregado correctamente", JOptionPane.PLAIN_MESSAGE);
        } else{
            JOptionPane.showMessageDialog(this, "No fue posible agregarlo!", "Error", JOptionPane.PLAIN_MESSAGE);
        }
    }
    
    public static void main (String args []){
        new DisplayAgenda();
    } 
}