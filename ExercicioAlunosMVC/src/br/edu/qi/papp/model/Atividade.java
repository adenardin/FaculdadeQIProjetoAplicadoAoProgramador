/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.qi.papp.model;

/**
 *
 * @author ALUNOS
 */
public class Atividade {
    private String nomeAtiv;
    private int horasCumpridas;
    private Aluno aluno;

    public Atividade() {
        this.nomeAtiv = nomeAtiv;
        this.horasCumpridas = horasCumpridas;
        this.aluno = aluno;
    }

    public String getNomeAtiv() {
        return nomeAtiv;
    }

    public void setNomeAtiv(String nomeAtiv) {
        this.nomeAtiv = nomeAtiv;
    }

    public int getHorasCumpridas() {
        return horasCumpridas;
    }

    public void setHorasCumpridas(int horasCumpridas) {
        this.horasCumpridas = horasCumpridas;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }
}
