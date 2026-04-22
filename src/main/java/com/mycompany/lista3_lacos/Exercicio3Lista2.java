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
public class Exercicio3Lista2 {

    public Exercicio3Lista2() {
        
        int n = Integer.parseInt(JOptionPane.showInputDialog("Insira um número para ver sua tabuada:"));
        String tabuada="";
        
        for(int i=1;i<=10;i++){
            tabuada+=n*i+"\n";
        }
        
        JOptionPane.showMessageDialog(null, tabuada);
        
    }
    
    public static void main(String[] args) {
        Exercicio3Lista2 ex1l2 = new Exercicio3Lista2();
    }
    
}
