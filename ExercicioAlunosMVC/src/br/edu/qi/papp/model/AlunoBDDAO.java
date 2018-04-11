/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.qi.papp.model;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ALUNOS
 */
public class AlunoBDDAO {
    
    private final GerenciaDados banco;
    
    public AlunoBDDAO(){
        this.banco = GerenciaDados.getInstance();
    }
    
    public List<Aluno> BuscaTodos() throws SQLException{
            Connection conn = DBConn.getConnection();
            String query = "SELECT * FROM aluno";
            Statement st = (Statement) conn.createStatement();
            ResultSet rs = st.executeQuery(query);
            
            List<Aluno> ListAlunos = new ArrayList();
            
            while (rs.next()) {
                int ra = rs.getInt("ra");
                String nome = rs.getString("nome");
                Aluno a = new Aluno(nome, ra);
                ListAlunos.add(a);
            }
            return ListAlunos;
    }

    public static void BuscaTodos(int ra) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
