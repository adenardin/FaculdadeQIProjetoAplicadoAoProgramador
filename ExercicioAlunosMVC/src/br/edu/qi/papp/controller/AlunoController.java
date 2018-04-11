package br.edu.qi.papp.controller;

import br.edu.qi.papp.model.Aluno;
import br.edu.qi.papp.model.AlunoBDDAO;
import br.edu.qi.papp.model.AlunoListaDAO;
import br.edu.qi.papp.view.ListaAlunosView;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Prof Luciano
 */
public class AlunoController {
    
    private AlunoListaDAO dao;
    private AlunoBDDAO dbdao;
    
    public AlunoController() {
        this.dbdao = new AlunoBDDAO();
        this.dao = new AlunoListaDAO();
    }
    
    void listar() {
        new ListaAlunosView().mostrar();
    }
    
    public List<Aluno> BuscaTodos() throws SQLException {
        return this.dbdao.BuscaTodos();
    }
    
    void BuscaAluno(int ra) {
//        return AlunoDAO.BuscaTodos(ra);
    }
}
