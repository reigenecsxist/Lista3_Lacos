/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista3_lacos;
import javax.swing.JOptionPane;
import java.util.Random;
/**
 *
 * @author Usuário do Windows
 */
public class Exercicio12 {

    public Exercicio12() {
        
        Random rd = new Random();
        
        int numeroSorteado = rd.nextInt(1, 100);
        
        while(true){
            int numeroEscolhido = Integer.parseInt(JOptionPane.showInputDialog("Tente adivinhar qual número escolhi entre 1 e 100!"));
            if(numeroEscolhido==numeroSorteado){
                JOptionPane.showMessageDialog(null, "Parabéns! Você acertou o número!");
                return;
            }
            else{
                if(numeroEscolhido>numeroSorteado) JOptionPane.showMessageDialog(null, "Errou! O número sorteado é menor que o escolhido...");
                else JOptionPane.showMessageDialog(null, "Errou! O número sorteado é maior que o escolhido...");
            }
        }
        
    }
    
    public static void main(String[] args) {
        Exercicio12 ex12 = new Exercicio12();
    }
    
}
