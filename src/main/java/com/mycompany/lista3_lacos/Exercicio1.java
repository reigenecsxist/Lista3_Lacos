/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista3_lacos;

import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel de Moura
 */
public class Exercicio1 {

    public Exercicio1() {
        
        String numeros = "";
        
        for(int i=0; i<=5; i++){
            numeros += i+"\n";
        }
        JOptionPane.showMessageDialog(null, numeros);
    }
    
    public static void main(String[] args) {
        Exercicio1 ex1 = new Exercicio1();
    }
    
}
