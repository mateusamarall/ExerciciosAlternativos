
package Model.DAO;


import Model.cdsModel;
import bdConnection.conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class cdsDAO {
 
    public List<cdsModel>index(){
        Connection con = conexao.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<cdsModel>  Cd = new ArrayList<>();
        
        
            try {
                stmt = con.prepareStatement("SELECT * FROM cds WHERE genero = ?");
                rs = stmt.executeQuery();
                while(rs.next()){
                    cdsModel cd = new cdsModel();
                    
                    cd.setCodigo(rs.getInt("codigo"));
                    cd.setTitulo(rs.getString("titulo"));
                    cd.setInterprete(rs.getString("interprete"));
                    cd.setGenero(rs.getString("genero"));
                    cd.setPreco(rs.getInt("preco"));
                    
                    Cd.add(cd);
            }
            } catch (SQLException ex) {
               JOptionPane.showMessageDialog(null, "erro ao salvar" + ex);
            }finally{
                conexao.closeConnection(con, stmt, rs);
            }
       return Cd;
    }
}
