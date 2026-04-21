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
public class Exercicio10 {

    public Exercicio10() {
        
        int primeiroTermo = 0;
        int segundoTermo = 1;
        int swap;
        
        String sequencia="";
        
        int quantTermos = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de termos para a sequência de Fibonacci:"));
        
        for(int i = 0; i<quantTermos; i++){
            if(i==quantTermos-1) sequencia += primeiroTermo+".";
            else sequencia += primeiroTermo+", ";
            
            swap = primeiroTermo+segundoTermo;
            primeiroTermo = segundoTermo;
            segundoTermo = swap;
        }
        
        JOptionPane.showMessageDialog(null, "Os "+quantTermos+" primeiros termos da sequência de Fibonacci:\n\n"+sequencia);
        
    }
    
    public static void main(String[] args) {
        Exercicio10 ex10 = new Exercicio10();
    }
    
}
