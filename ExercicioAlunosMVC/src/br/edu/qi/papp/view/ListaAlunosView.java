package br.edu.qi.papp.view;

import br.edu.qi.papp.model.Aluno;
import br.edu.qi.papp.model.GerenciaDados;
import java.util.List;

/**
 *
 * @author Luciano
 */
public class ListaAlunosView extends View {

    @Override
    public void mostrar() {
        
        List<Aluno> lista = GerenciaDados.getInstance().getListaAlunos();
        
        System.out.println("\nListagem dos alunos:");
        
        int i = 0;
        for(Aluno a: lista) {
            
            System.out.println("\nAluno " + (++i));
            System.out.println("Nome: " + a.getNome());
            System.out.println("RA: " + a.getRa());
        }
        
        System.out.println("\n--- Tecle Enter para voltar ao menu anterior ");
        this.leitor.nextLine();
    }
}
