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
public class Exercicio6Lista2 {

    public Exercicio6Lista2() {
        
        float n = Float.parseFloat(JOptionPane.showInputDialog("Insira um número: "));
        float somatoria=0;
        
        for(int i=1; i<=n; i++){
            somatoria+=(float)1/i;
        }
        
        JOptionPane.showMessageDialog(null, somatoria);
        
    }
    
    public static void main(String[] args) {
        Exercicio6Lista2 ex6l2 = new Exercicio6Lista2();
    }
    
}
