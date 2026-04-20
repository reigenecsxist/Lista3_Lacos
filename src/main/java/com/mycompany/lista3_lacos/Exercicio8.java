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
public class Exercicio8 {

    public Exercicio8() {
        
        int n = Integer.parseInt(JOptionPane.showInputDialog("Insira um número para verificação de número primo:"));
        
        for(int i=n-1; i>1; i--){
            if(n%i==0){
                JOptionPane.showMessageDialog(null, "Não é um número primo.");
                System.exit(0);
            }
        }
        JOptionPane.showMessageDialog(null, "É um número primo");
        
    }
    
    public static void main(String[] args) {
        Exercicio8 ex8 = new Exercicio8();
    }
    
}
