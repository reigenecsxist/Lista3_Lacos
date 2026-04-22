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
public class Exercicio15 {

    public Exercicio15() {
        int op;
        
        do{
            int numeroTeste = Integer.parseInt(JOptionPane.showInputDialog("Digite um número para ser invertido:"));
            String numeroInvertido = "";
            
            while(true){
                if(numeroTeste>9){
                    numeroInvertido+=""+(numeroTeste%10);
                    numeroTeste/=10;
                }
                else{
                    numeroInvertido+=""+numeroTeste;
                    break;
                }
            }
            JOptionPane.showMessageDialog(null, "O número invertido é igual a "+numeroInvertido);
            op = JOptionPane.showConfirmDialog(null, "Deseja inverter outro número?", "Inversão de números", JOptionPane.YES_NO_OPTION);
        }while(op==JOptionPane.YES_OPTION);
    }
    
    public static void main(String[] args) {
        Exercicio15 ex15 = new Exercicio15();
    }
    
}
