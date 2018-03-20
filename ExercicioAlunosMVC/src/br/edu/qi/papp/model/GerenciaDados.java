package br.edu.qi.papp.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Prof Luciano
 */
public class GerenciaDados {
    
    private final List<Aluno> listaAlunos = new ArrayList<>();
    private static GerenciaDados instance;
    
    private GerenciaDados() {        
        this.carregaDados();
    }

    public List<Aluno> getListaAlunos() {
        return listaAlunos;
    }
    
    private void carregaDados() {
        
        Aluno a;
        String nome;
        int ra;
        Scanner ler = new Scanner(getClass().getResourceAsStream("alunos.txt"));
        
        for(int i = 0; i < 30; i++) {
            
            nome = ler.nextLine();
            ra = ler.nextInt();
            ler.nextLine();
            
            a = new Aluno(nome, ra);
            
            listaAlunos.add(a);
        }
    }
    
    public static synchronized GerenciaDados getInstance() {
        if (instance == null) {
            instance = new GerenciaDados();
        }
        return instance;
    }
    
}
