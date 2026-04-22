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
public class Exercicio18 {

    public Exercicio18() {
        
        String palavraTeste = JOptionPane.showInputDialog("Insira uma palavra para checagem de palíndromo:");
        String palindromo="";
        
        for(int i=palavraTeste.length(); i>0; i--){
            palindromo+=palavraTeste.charAt(i-1)+"";
        }
        
        if(palindromo.equalsIgnoreCase(palavraTeste)) JOptionPane.showMessageDialog(null, "Essa palavra é um palíndromo!");
        else JOptionPane.showMessageDialog(null, "Essa palavra não é um palíndromo!");
        
    }
    
    public static void main(String[] args) {
        Exercicio18 ex18 = new Exercicio18();
    }
    
}
