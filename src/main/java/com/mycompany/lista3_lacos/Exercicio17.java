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
public class Exercicio17 {

    public Exercicio17() {
        
        int numInicial = Integer.parseInt(JOptionPane.showInputDialog("Insira o número inicial do intervalo para checagem de números primos:"));
        int numFinal = Integer.parseInt(JOptionPane.showInputDialog("Insira o número final do intervalo para checagem de números primos:"));
        String numerosPrimos = "";
        if(numInicial<=2&&numFinal>=2) numerosPrimos+="2, ";
        
        for(int i=numInicial;i<=numFinal;i++){
            boolean primo = true;
            
            for(int j=i-1; j>1; j--){
                if(i%j==0) primo = false;
                else if(j==2&&i%j!=0&&primo) numerosPrimos+=i+", ";
            }
        }
        JOptionPane.showMessageDialog(null, "Números primos no intervalo de "+numInicial+" a "+numFinal+": "+numerosPrimos);
        
    }
    
    public static void main(String[] args) {
        Exercicio17 ex17 = new Exercicio17();
    }
    
}
