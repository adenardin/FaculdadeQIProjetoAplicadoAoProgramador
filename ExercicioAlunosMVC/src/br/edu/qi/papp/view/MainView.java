package br.edu.qi.papp.view;

import br.edu.qi.papp.controller.FrontController;
import br.edu.qi.papp.controller.AlunoController;

/**
 *
 * @author Anderson Denardin
 */
public class MainView extends View {

    private final FrontController controller = new FrontController(); 
    
    @Override
    public void mostrar() {
        
        int opcao;
        
        do {
            
            System.out.println("\n-------Menu-------");
//        System.out.println("1 - Ler alunos");
            System.out.println("2 - Listar alunos");
//        System.out.println("3 - Ordenar alunos por RA");
//        System.out.println("4 - Registra horas");
            System.out.println("5 - Listar Atividades");
            System.out.println("0 - Sair");
            System.out.print("\nTecle a sua opção: ");

            opcao = this.leitor.nextInt();
            
            this.controller.acao(opcao);
            
        } while (opcao != 0);
        
    }
    
}
