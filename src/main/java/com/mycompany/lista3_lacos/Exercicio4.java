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
public class Exercicio4 {

    public Exercicio4() {
        
        int n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número positivo:"));
        String tabuada="";
        
        if(n>=0){
            for(int i=1;i<=10;i++){
                tabuada+=""+n+" x "+i+" = "+(n*i)+"\n";
            }
            JOptionPane.showMessageDialog(null, tabuada);
        }
        else JOptionPane.showMessageDialog(null, "Somente valores positivos!");
        
    }
    
    public static void main(String[] args) {
        Exercicio4 ex4 = new Exercicio4();
    }
}
