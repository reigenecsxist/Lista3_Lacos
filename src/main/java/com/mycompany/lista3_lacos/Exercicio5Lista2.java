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
public class Exercicio5Lista2 {

    public Exercicio5Lista2() {
        
        String numeros = "";
        
        for(int i=1000; i<=2000; i++){
            if(i%11==2) numeros+=i+", ";
        }
        
        JOptionPane.showMessageDialog(null, numeros);
        
    }
    
    public static void main(String[] args) {
        Exercicio5Lista2 ex5l2 = new Exercicio5Lista2();
    }
    
}
