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
public class Exercicio14 {

    public Exercicio14() {
        
        String palavraTeste;
        
        do{
            palavraTeste = JOptionPane.showInputDialog("Digite uma palavra para contagem de vogais:\n\nDigite '0' para encerrar o programa:");
            int contagem=0;
            
            for(int i=0;i<palavraTeste.length();i++){
                switch(palavraTeste.charAt(i)){
                    case 'a','e','i','o','u','A','E','I','O','U':
                        contagem++;
                        break;
                }
            }
            
            if(palavraTeste.equals("0")) return;
            else JOptionPane.showMessageDialog(null, "A palavra '"+palavraTeste+"' possui "+contagem+" vogais.");
        }while(!palavraTeste.equals("0"));
        
    }
    
    public static void main(String[] args) {
        Exercicio14 ex14 = new Exercicio14();
    }
    
}
