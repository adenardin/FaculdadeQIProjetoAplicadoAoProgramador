package br.edu.qi.papp.controller;

import br.edu.qi.papp.model.Atividade;
import br.edu.qi.papp.model.AtividadeListaDAO;
import br.edu.qi.papp.view.ListaAtividadesView;
import java.util.List;

/**
 *
 * @author Prof Luciano
 */
public class AtividadeController {
    
    private AtividadeListaDAO dao;
    
    public AtividadeController() {
        this.dao = new AtividadeListaDAO();
    }
    
    void listar() {
        new ListaAtividadesView().mostrar();
    }
    
    public List<Atividade> BuscaTodos() {
        return this.dao.BuscaTodos();
    }
    
    void BuscaAtividade(int ra) {
//        return AtividadeDAO.BuscaTodos(ra);
    }
}
