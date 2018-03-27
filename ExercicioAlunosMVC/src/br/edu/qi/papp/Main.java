/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.qi.papp;

import br.edu.qi.papp.view.MainView;
import br.edu.qi.papp.view.Principal;

/**
 *
 * @author ALUNOS
 */
public class Main {
    public static void main(String[] args) {
        Principal principal = new Principal();
        principal.setLocationRelativeTo(null);
        principal.setVisible(true);
        
//        MainView principal = new MainView();
//        principal.mostrar();
    }
}
