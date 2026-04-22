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
public class Exercicio16 {

    public Exercicio16() {
        
        int numeroTeste = Integer.parseInt(JOptionPane.showInputDialog("Inisira um número para checar se ele é perfeito:"));
        int somaDivisores=0;
        
        for(int i=numeroTeste-1; i>0; i--){
            if(numeroTeste%i==0) somaDivisores+=i;
        }
        
        if(numeroTeste==somaDivisores) JOptionPane.showMessageDialog(null, "O número é perfeito.");
        else JOptionPane.showMessageDialog(null, "O número não é perfeito.");
        
    }
    
    public static void main(String[] args) {
        Exercicio16 ex16 = new Exercicio16();
    }
    
}
