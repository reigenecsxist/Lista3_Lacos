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
public class Exercicio4Lista2 {

    public Exercicio4Lista2() {
        
        String tabuada="";
        
        for(int i=1;i<=10;i++){
            tabuada+=i+" - ";
            for(int j=1;j<=10;j++){
                tabuada+=i*j+"  ";
            }
            tabuada+="\n";
        }
        JOptionPane.showMessageDialog(null, tabuada);
        
    }
    
    public static void main(String[] args) {
        Exercicio4Lista2 ex4l2 = new Exercicio4Lista2();
    }
    
}
