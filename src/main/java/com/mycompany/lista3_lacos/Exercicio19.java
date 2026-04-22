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
public class Exercicio19 {

    public Exercicio19() {
        
        int op = 1;
        
        while(op!=0){
            op = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma opção:\n\n1 - Par\n2 - Ímpar\n\n0 - Sair"));
            if(op==0) break;
            
            int numEscolhido = Integer.parseInt(JOptionPane.showInputDialog("Digite um número qualquer:"));
            
            Random rd = new Random();
            int numSorteado = rd.nextInt(1, 10);
            
            if((numEscolhido+numSorteado)%2==0&&op==1) JOptionPane.showMessageDialog(null, "Parabéns! Você escolheu par e o valor resultante foi "+(numEscolhido+numSorteado)+", logo, você ganhou!");
            else if((numEscolhido+numSorteado)%2!=0&&op==2) JOptionPane.showMessageDialog(null, "Parabéns! Você escolheu ímpar e o valor resultante foi "+(numEscolhido+numSorteado)+", logo, você ganhou!");
            else if((numEscolhido+numSorteado)%2!=0&&op==1) JOptionPane.showMessageDialog(null, "Você perdeu. Você escolheu par e o valor resultante foi "+(numEscolhido+numSorteado));
            else if((numEscolhido+numSorteado)%2==0&&op==2) JOptionPane.showMessageDialog(null, "Você perdeu. Você escolheu ímpar e o valor resultante foi "+(numEscolhido+numSorteado));
        }
    }
    
    public static void main(String[] args) {
        Exercicio19 ex19 = new Exercicio19();
    }
    
}
