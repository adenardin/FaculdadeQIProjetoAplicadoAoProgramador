package br.edu.qi.papp.view;

import br.edu.qi.papp.model.Atividade;
import br.edu.qi.papp.model.GerenciaDados;
import java.util.List;

/**
 *
 * @author Luciano
 */
public class ListaAtividadesView extends View {

    @Override
    public void mostrar() {
        
        List<Atividade> lista = GerenciaDados.getInstance().getListaAtividades();
        
        System.out.println("\nListagem das atividades:");
        
        int i = 0;
        for(Atividade a: lista) {
            System.out.println("\nIndice: " + (++i));
            System.out.println("\nNome: Atividade " + a.getNomeAtiv());
            System.out.println("Horas Cumpridas: " + a.getHorasCumpridas());
            System.out.println("Nome do Aluno: " + a.getAluno().getNome());
        }
        
        System.out.println("\n--- Tecle Enter para voltar ao menu anterior ");
        this.leitor.nextLine();
    }
}