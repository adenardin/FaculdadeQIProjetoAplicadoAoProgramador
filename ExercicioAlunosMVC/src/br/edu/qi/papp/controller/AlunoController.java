package br.edu.qi.papp.controller;

import br.edu.qi.papp.view.ListaAlunosView;

/**
 *
 * @author Prof Luciano
 */
public class AlunoController {

    void listar() {
        new ListaAlunosView().mostrar();
    }
    
}
