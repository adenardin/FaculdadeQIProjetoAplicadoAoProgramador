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
public class AtividadeListaDAO {
    
    private GerenciaDados banco;
    
    public AtividadeListaDAO(){
        this.banco = GerenciaDados.getInstance();
    }
    
    public List<Atividade> BuscaTodos(){
        return this.banco.getListaAtividades();
    }

    public static void BuscaTodos(int ra) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
