/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.qi.papp.view;

import br.edu.qi.papp.model.DBConn;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author ALUNOS
 */
public class TestConn {

    public static void main(String args[]) throws SQLException {
        Connection conn = DBConn.getConnection();
        if (conn != null) {
            System.out.println("Conectado!");
            String query = "SELECT * FROM aluno";

            Statement st = (Statement) conn.createStatement();
            ResultSet rs = st.executeQuery(query);
            
            while (rs.next()) {
                int ra = rs.getInt("ra");
                String nome = rs.getString("nome");
                
                System.out.println(ra + " - " + nome);
            }
        } else {
            System.out.println("Não Conectado!");
        }
    }
}
