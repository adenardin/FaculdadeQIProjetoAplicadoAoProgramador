/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.qi.papp.controller;

/**
 *
 * @author ALUNOS
 */
public class FrontController {
    
    public void acao(int opcao) {

        switch (opcao) {

            case 2: {
                (new AlunoController()).listar();
                break;
            }
            case 5: {
                (new AtividadeController()).listar();
                break;
            }
        }
    }    
}
