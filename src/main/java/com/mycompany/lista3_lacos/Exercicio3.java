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
public class Exercicio3 {

    public Exercicio3() {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
        int total=0;
        
        for(int i=0;i<=n;i++){
            total+=i;
        }
        
        JOptionPane.showMessageDialog(null, "A soma dos números de 1 até "+n+" é igual a "+total);
    }
    
    public static void main(String[] args) {
        Exercicio3 ex3 = new Exercicio3();
    }
}
