package br.edu.qi.papp.view;

import java.util.Scanner;

/**
 *
 * @author Prof Luciano
 */
public abstract class View {
    
    final Scanner leitor = new Scanner(System.in);
    
    public abstract void mostrar();
}
