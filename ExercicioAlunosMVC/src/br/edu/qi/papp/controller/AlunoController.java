package br.edu.qi.papp.controller;

import br.edu.qi.papp.model.Aluno;
import br.edu.qi.papp.model.AlunoListaDAO;
import br.edu.qi.papp.view.ListaAlunosView;
import java.util.List;

/**
 *
 * @author Prof Luciano
 */
public class AlunoController {
    
    private AlunoListaDAO dao;
    
    public AlunoController() {
        this.dao = new AlunoListaDAO();
    }
    
    void listar() {
        new ListaAlunosView().mostrar();
    }
    
    public List<Aluno> BuscaTodos() {
        return this.dao.BuscaTodos();
    }
    
    void BuscaAluno(int ra) {
//        return AlunoDAO.BuscaTodos(ra);
    }
}
