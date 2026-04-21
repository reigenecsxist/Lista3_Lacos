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
public class Exercicio11 {

    public Exercicio11() {
        
        float quociente = 10;
        int quantDigitos = 0;
        float numeroTeste = Float.parseFloat(JOptionPane.showInputDialog("Digite o número para verificação:"));
        
        if(numeroTeste==0) JOptionPane.showMessageDialog(null, "O número inserido possui 1 dígito.");
        else if(numeroTeste<0) JOptionPane.showMessageDialog(null, "Somente números positivos!");
        else{
            while(numeroTeste>=1){
                numeroTeste/=quociente;
                quantDigitos++;
            }
            JOptionPane.showMessageDialog(null, "O número inserido possui "+quantDigitos+" dígito(s).");
        }
        
    }
    
    public static void main(String[] args) {
        Exercicio11 ex11 = new Exercicio11();
    }
    
}
