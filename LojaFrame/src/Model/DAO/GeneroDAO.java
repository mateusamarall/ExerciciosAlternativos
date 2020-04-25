
package Model.DAO;

import Model.Genero;
import bdConnection.conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class GeneroDAO {
    public List<Genero>index(){
        Connection con  = conexao.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Genero> generos = new ArrayList<>();
        
        try{
            stmt= con.prepareStatement("SELECT * FROM generos");
            rs=stmt.executeQuery();
            
            while(rs.next()){
                Genero genero = new Genero();
                genero.setGenero(rs.getString("genero"));
                
                generos.add(genero);
                
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "erro ao salvar" +ex);
        }finally{
            conexao.closeConnection(con, stmt, rs);
        }
        return generos;
    }
}
