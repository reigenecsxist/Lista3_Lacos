/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista3_lacos;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuário do Windows
 */
public class Exercicio6 {

    public Exercicio6() {
        
        int ni = Integer.parseInt(JOptionPane.showInputDialog("Digite o número inicial:"));
        int nf = Integer.parseInt(JOptionPane.showInputDialog("Digite o número final:"));
        int passo = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do passo:"));
        
        String numeros = ni+"\n";
        
        if(ni+passo<=nf&&passo>0){
            while(ni<nf){
                ni+=passo;
                numeros += ni+"\n";
            }
            JOptionPane.showMessageDialog(null, numeros);
        }
        else JOptionPane.showMessageDialog(null, "Passo inválido");
        
    }
    
    public static void main(String[] args) {
        Exercicio6 ex6 = new Exercicio6();
    }
}
