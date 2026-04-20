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
public class Exercicio9 {

    public Exercicio9() {
        
        int n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número para cálculo do fatorial:"));
        int fatorial = n;
        
        if(n>0){
            for(int i=n;i>1;i--){
                fatorial *= i-1;
            }
            JOptionPane.showMessageDialog(null, "O fatorial de "+n+" é igual a "+fatorial);
        }
        else if(n==0) JOptionPane.showMessageDialog(null, "O fatorial de 0 é igual a 1");
        else JOptionPane.showMessageDialog(null, "Número inválido!");            
            
    }
    
    public static void main(String[] args) {
        Exercicio9 ex9 = new Exercicio9();
    }
    
}
