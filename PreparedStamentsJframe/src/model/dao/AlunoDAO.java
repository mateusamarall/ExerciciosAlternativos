
package model.dao;

import bdconnection.conexao;


import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Aluno;

public class AlunoDAO {
    
    public void create(Aluno a){
      Connection con = conexao.getConnection(); 
         PreparedStatement stmt = null;
         
       try{
           stmt = con.prepareStatement("INSERT INTO alunos (rgm,nome,idade,curso)VALUES(?,?,?,?)");
           stmt.setString(1, a.getRgm());
            stmt.setString(2, a.getNome());
            stmt.setInt(3, a.getIdade());
            stmt.setString(4, a.getCurso());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "SALVO COM SUCESSO");
            System.out.println("salvo com sucesso");
       }
       catch(SQLException ex){
           JOptionPane.showMessageDialog(null, "erro ao salvar");
           System.out.println("erro ao salvar");
       }
        finally{
            conexao.closeConnection(con, stmt);
        }
      
    }
    
    public List<Aluno>index(){
        Connection con = conexao.getConnection(); 
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Aluno> alunos = new ArrayList<>();
        try {
            stmt = con.prepareStatement("SELECT * FROM alunos");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Aluno aluno = new Aluno();
                aluno.setRgm(rs.getString("rgm"));
                aluno.setNome(rs.getString("nome"));
                aluno.setIdade(rs.getInt("idade"));
                aluno.setCurso(rs.getString("curso"));
                
               alunos.add(aluno);
               
              
            }
             
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro ao salvar" + ex);
        }finally{
            conexao.closeConnection(con, stmt, rs);
        }
        return alunos;
    }
    
    public void update(Aluno a){
      Connection con = conexao.getConnection(); 
         PreparedStatement stmt = null;
         
       try{
           stmt = con.prepareStatement("UPDATE alunos SET rgm = ?,nome = ?,idade = ?,curso = ? WHERE rgm = ?");
           stmt.setString(1, a.getRgm());
            stmt.setString(2, a.getNome());
            stmt.setInt(3, a.getIdade());
            stmt.setString(4, a.getCurso());
            stmt.setString(5, a.getRgm());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "ATUALIZADO COM SUCESSO");
           
       }
       catch(SQLException ex){
           JOptionPane.showMessageDialog(null, "erro ao atualizar" +ex);
           
       }
        finally{
            conexao.closeConnection(con, stmt);
        }
      
    }
    
    public void delete(Aluno a){
      Connection con = conexao.getConnection(); 
         PreparedStatement stmt = null;
         
       try{
           stmt = con.prepareStatement("DELETE FROM alunos where rgm = ?");
           stmt.setString(1, a.getRgm());
        
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "DELETADO COM SUCESSO");
            
       }
       catch(SQLException ex){
           JOptionPane.showMessageDialog(null, "erro ao deletar" +ex);
           
       }
        finally{
            conexao.closeConnection(con, stmt);
        }
      
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
