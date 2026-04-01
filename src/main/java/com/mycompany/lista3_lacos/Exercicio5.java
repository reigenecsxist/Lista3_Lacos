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
public class Exercicio5 {

    public Exercicio5() {
        
        int n = Integer.parseInt(JOptionPane.showInputDialog("Insira um número:"));
        int[] par = new int[n];
        int[] impar = new int[n];
        String nsPar = "";
        String nsImpar = "";
        
        for(int i=0; i<n; i++){
            if(i%2==0){
                par[i] += i;
                nsPar += i+", ";
                if(i%n==0) nsPar += "\n";
            }
            else{
                impar[i]+=i;
                nsImpar += i+", ";
                if(i%100==0) nsImpar += "\n";
                
            }
        }
        
        JOptionPane.showMessageDialog(null, "Os números pares antes de "+n+": "+nsPar+""
                + "\nOs números ímpares antes de "+n+":"+nsImpar);
        
    }
    
    public static void main(String[] args) {
        Exercicio5 ex5 = new Exercicio5();
    }
}
