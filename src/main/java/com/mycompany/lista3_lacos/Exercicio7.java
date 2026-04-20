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
public class Exercicio7 {

    public Exercicio7() {
        
        float nota; 
        float media=0;
        int cont=0;
        
        while(true){
            nota = Integer.parseInt(JOptionPane.showInputDialog("Digite abaixo a nota para cálculo de média:\nPara sair, digite um número negativo.\n"));
            
            if(nota>=0){
                media += nota;
                cont++;
            }
            else break;
        }
        JOptionPane.showMessageDialog(null, "Média: "+media/cont);
    }
    
    public static void main(String[] args) {
        Exercicio7 ex7 = new Exercicio7();
    }
    
}
