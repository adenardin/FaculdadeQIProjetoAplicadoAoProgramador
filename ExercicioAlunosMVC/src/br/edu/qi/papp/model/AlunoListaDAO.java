/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.qi.papp.model;

import java.util.List;

/**
 *
 * @author ALUNOS
 */
public class AlunoListaDAO {
    
    private GerenciaDados banco;
    
    public AlunoListaDAO(){
        this.banco = GerenciaDados.getInstance();
    }
    
    public List<Aluno> BuscaTodos(){
        return this.banco.getListaAlunos();
    }

    public static void BuscaTodos(int ra) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
