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
    private final List<Atividade> listaAtividades = new ArrayList<>();

    private static GerenciaDados instance;
    
    private GerenciaDados() {        
        this.carregaDadosAlunos();
        this.carregaDadosAtividades();
    }

    // Methods responsibles to return data by get
    public List<Aluno> getListaAlunos() {
        return listaAlunos;
    }
    
    public List<Atividade> getListaAtividades() {
        return listaAtividades;
    }
    
    // Methods responsibles to load data to instance
    private void carregaDadosAlunos() {        
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

    private void carregaDadosAtividades() {
        
        Atividade ativ;
        Scanner ler = new Scanner(getClass().getResourceAsStream("atividades.txt"));

        for (int i = 0; i < 5; i++) {

            ativ = new Atividade();
            ativ.setAluno(this.getAlunoPorRA(ler.nextInt()));
            ler.nextLine();
            ativ.setNomeAtiv(ler.nextLine());
            ativ.setHorasCumpridas(ler.nextInt());
            ler.nextLine();
            
            this.listaAtividades.add(ativ);
        }
    }
    
    public static synchronized GerenciaDados getInstance() {
        if (instance == null) {
            instance = new GerenciaDados();
        }
        return instance;
    }
    
    public Aluno getAlunoPorRA(int ra){
        
        Aluno aluno = null;
        for(Aluno a: this.listaAlunos){
            if(ra == a.getRa()){
                aluno = a;
            }
        }
        return aluno;
    }
}
