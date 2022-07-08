package Dia;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AgendaQueries {
    private static final String URL = "jdbc:mysql://localhost:3306/db_clinica?verifyServerCertificate=false&useSSL=true";
    private static final String USER = "root";
    private static final String PASSWORD = "root";
    
    private Connection connection = null;
    private PreparedStatement insertarNuevo = null;
    private PreparedStatement resurtirMedicamento = null;
    private PreparedStatement cantidadMedicamento = null;
    private Tabla tablaModel;
    
    public AgendaQueries(){
        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            resurtirMedicamento = connection.prepareStatement("UPDATE tb_medicamento SET resurtir = 'No' WHERE nombre = ?");
            cantidadMedicamento = connection.prepareStatement("UPDATE tb_medicamento SET cantidad = ? WHERE nombre = ?");
        } catch (SQLException sql){
            sql.printStackTrace();
            System.exit(1);
        }
    }
        
    public int insertarNuevo(String tabla, String valores){
        String nuevo = "INSERT INTO tb_";
        int result = 0;
        String columnas = "";
        try{
            String query = "SELECT * FROM TB_" + tabla;
            tablaModel = new Tabla(URL, USER, PASSWORD, query);
            for(int i=0; i<tablaModel.getColumnCount(); i++){
                columnas += tablaModel.getColumnName(i) + ", ";
            } 
            columnas = columnas.substring(0, (columnas.length()-2));
            nuevo += tabla + " (";
            nuevo += columnas + ") VALUES (";
            nuevo += valores + ")";
            insertarNuevo = connection.prepareStatement(nuevo);
            result = insertarNuevo.executeUpdate();
        } catch (SQLException sql){
            sql.printStackTrace();
            close();
        }
        return result;
    }
    
    public int resurtirMedicamento(String prod, int cant){
        int resultados = 0;
        try{
            resurtirMedicamento.setString(1, prod);
            cantidadMedicamento.setInt(1, cant);
            cantidadMedicamento.setString(2, prod);
            resultados = cantidadMedicamento.executeUpdate();
            resultados = resurtirMedicamento.executeUpdate();
        } catch (SQLException sql){
            sql.printStackTrace();
            close();
        }
        return resultados;
    }
    
    public void close(){
        try{
            connection.close();
        } catch (SQLException sql){
            sql.printStackTrace();
        } 
    }
}