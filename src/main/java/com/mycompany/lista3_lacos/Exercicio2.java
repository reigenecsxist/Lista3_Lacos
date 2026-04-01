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
public class Exercicio2 {

    public Exercicio2() {
        String ns = "";
        int i = 100;
        
        while(i>=0){
            if(i!=0) ns += i;
            else ns += i+", ";
            
            i--;
            
            if(i%10==0&&i!=0) ns += "\n";
        }
        
        JOptionPane.showMessageDialog(null, ns);
    }
    
    public static void main(String[] args) {
        Exercicio2 ex2 = new Exercicio2();
    }
    
}
