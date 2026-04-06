/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistema_bancario;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuário do Windows
 */
public class Sistema_Bancario {

    public Sistema_Bancario() {
        
        boolean visuSaldo=true;
        float saque, saldo=0;
        String saldoMostrado="0.00", textoVisuSaldo="Esconder saldo";
        int opcao=0;
        ArrayList<Transferencia> registro = new ArrayList<>();
        
        do{
            opcao = Integer.parseInt(JOptionPane.showInputDialog("BANCO GMM\n\nSaldo: "+saldoMostrado+"\n\n\t1 - Depósito\n\t2 - Saque\n\t3 - Transferência\n4 - "
                    +textoVisuSaldo+ "\n\n\t0 - Sair\n\nQual serviço deseja realizar?"));
            
            switch(opcao){
                case 0:
                    break;
                case 1:
                    saldo += Float.parseFloat(JOptionPane.showInputDialog("Qual valor deseja depositar?"));
                    saldoMostrado = ""+saldo;
                    break;
                case 2:
                    saque = Float.parseFloat(JOptionPane.showInputDialog("Qual valor deseja sacar?"));
                    if(saque>saldo) JOptionPane.showMessageDialog(null, "O valor solicitado para saque é maior que o saldo disponível!");
                    else saldo -= saque;
                    saldoMostrado = ""+saldo;
                    break;
                case 3:
                    int opcaoTf = 0;
                    
                    do{
                        
                        opcaoTf = Integer.parseInt(JOptionPane.showInputDialog("\tTranferências\n\n\t1 - Realizar transferência\n\t2 - Ver registro de transferências"
                                + "\n\t0 - Sair\n\n\tQual serviço deseja realizar?"));
                        
                        switch(opcaoTf){
                            case 1:
                                int codigo = 0;
                                String nome = JOptionPane.showInputDialog("Qual o nome do recebedor do depósito?");
                                String contaRecebe = JOptionPane.showInputDialog("Qual o número da conta que irá receber o dinheiro?");
                                Float valor = Float.parseFloat(JOptionPane.showInputDialog("Qual valor deseja transferir?"));

                                if(valor>saldo){
                                    JOptionPane.showMessageDialog(null, "O valor que deseja transferir é maior que o saldo disponível.");
                                    break;
                                }
                                else saldo -= valor;

                                Transferencia tf = new Transferencia(codigo++, nome, contaRecebe, valor);
                                registro.add(tf);
                                break;
                                
                            case 2:
                                String tabela = "\tREGISTRO DE TRANSFERÊNCIAS\nCÓDIGO       VALOR       NOME        CONTA\n\n";
                                for(Transferencia tx:registro){
                                    tabela += tx.codigo+"       "+tx.valor+"        "+tx.nome+"        "+tx.contaRecebe+"      ";
                                }
                                JOptionPane.showMessageDialog(null, tabela);
                                break;
                            
                            case 0:
                                break;
                        }
                        
                    }while(opcaoTf!=0);
                    break;
                    
                case 4:
                    if(visuSaldo){
                        saldoMostrado = "****";
                        textoVisuSaldo = "Mostrar saldo";
                        visuSaldo = false;
                    }
                    else{
                        saldoMostrado = ""+saldo;
                        textoVisuSaldo = "Esconder saldo";
                        visuSaldo = true;
                    }
                    
            }
            
        }while(opcao!=0);
    }
    
    public class Transferencia{
        int codigo;
        String nome, contaRecebe;
        float valor;

        public Transferencia(int codigo, String nome, String contaRecebe, float valor) {
            this.nome = nome;
            this.contaRecebe = contaRecebe;
            this.valor = valor;
        }
        
        
    }

    public static void main(String[] args) {
        Sistema_Bancario sis = new Sistema_Bancario();
    }
}
