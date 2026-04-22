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
public class Exercicio13 {

    public Exercicio13() {
        
        int quociente;
        int numOp = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
        int numOriginal = numOp;
        
        int soma = 0;
        
        while(true){
            int expoente = 0;
            numOp=numOriginal;
            
            while(numOp>9){
                numOp/=10;
                expoente++;
            }
            
            if(numOriginal>10){
                soma+=numOp;
                numOriginal-=numOp*Math.powExact(10, expoente);
            }
            else{
                soma+=numOriginal;
                break;
            }
        }
        JOptionPane.showMessageDialog(null, soma);
    }    

    public static void main(String[] args) {
        Exercicio13 ex13 = new Exercicio13();
    }
    
}
