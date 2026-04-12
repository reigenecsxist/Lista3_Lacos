package com.mycompany.sistema_bancario;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Sistema_Bancario {

    public Sistema_Bancario() {
        
        boolean visuSaldo=true;
        float saque, saldo=0;
        String saldoMostrado="0.00", textoVisuSaldo="Esconder saldo";
        int[] opcao = {0, 0, 0};
        
        ArrayList<Transferencia> registro = new ArrayList<>();
        ArrayList<Transacao> extrato = new ArrayList<>();
        ArrayList<Conta> contas = new ArrayList<>();
        
        do{
            opcao[0] = Integer.parseInt(JOptionPane.showInputDialog("BANCO GMM\n\n\t"
                    + "1 - Acessar minha conta\n\t"
                    + "2 - Criar conta"));
            
            switch(opcao[0]){
                case 1:
                    int conta = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da conta:"));
                    
                    for(Conta ct : contas){
                        if(conta==ct.numConta){
                            int senha = Integer.parseInt(JOptionPane.showInputDialog("Digite sua senha:"));
                            
                            for(Conta ct2 : contas){
                                if(senha==ct2.senha){
                                    do{
                
                                        opcao[1] = Integer.parseInt(JOptionPane.showInputDialog("BANCO GMM\n\n"
                                            + "Saldo: "+saldoMostrado+"\n\n\t"
                                            + "1 - Depósito\n\t"
                                            + "2 - Saque\n\t"
                                            + "3 - Extrato\n"
                                            + "4 - Transferências\n\t"
                                            + "5 - "+textoVisuSaldo+"\n\n\t"
                                            + "0 - Sair\n\n"
                                            + "Qual serviço deseja realizar?"));

                                        switch(opcao[1]){
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

                                                break;

                                            case 4:

                                                do{

                                                    opcao[2] = Integer.parseInt(JOptionPane.showInputDialog("\tTranferências\n\n\t"
                                                            + "1 - Realizar transferência\n\t"
                                                            + "2 - Ver registro de transferências\n\t"
                                                            + "0 - Voltar"
                                                            + "\n\n\tQual serviço deseja realizar?"));

                                                    switch(opcao[2]){
                                                        case 1:
                                                            int codigo = 1;
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
                                                            String tabela = "<html>" +
                                                                            "    <table border='1'>" +
                                                                            "        <tr>" +
                                                                            "            <th>CÓDIGO</th>" +
                                                                            "            <th>VALOR</th>" +
                                                                            "            <th>RECEBEDOR</th>" +
                                                                            "            <th>CONTA</th>" +
                                                                            "        </tr>";
                                                            for(Transferencia tx:registro){
                                                                tabela += "<tr>"
                                                                        + "     <td>"+tx.codigo+"</td>"
                                                                        + "     <td>"+tx.valor+"</td>"
                                                                        + "     <td>"+tx.nome+"</td>"
                                                                        + "     <td>"+tx.contaRecebe+"</td>"
                                                                        + "</tr>";
                                                            }

                                                            tabela += "     </table>"
                                                                    + "</html>";

                                                            JOptionPane.showMessageDialog(null, tabela);
                                                            break;

                                                        case 0:
                                                            break;
                                                    }

                                                }while(opcao[2]!=0);
                                                break;

                                            case 5:
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

                                    }while(opcao[1]!=0);
                                }
                            }
                            JOptionPane.showConfirmDialog(null, "Senha incorreta");
                        }
                    }
                    JOptionPane.showConfirmDialog(null, "Conta inexistente.");
                    break;
                    
                case 2:
                    int numConta, senha;
                    String nomeMeliante;//continue aqui. Cadastro.
                                        
                    break;
                    
                default:
                    JOptionPane.showConfirmDialog(null, "Opção inválida.");
            }
            
        }while(opcao[0]!=0);
        
    }
    
    public class Conta{
        int numConta, senha;
        String nomeMeliante;

        public Conta(int numConta, int senha, String nomeMeliante) {
            this.numConta = numConta;
            this.senha = senha;
            this.nomeMeliante = nomeMeliante;
        }
    }
    
    private class Transferencia{
        int codigo;
        String nome, contaRecebe;
        float valor;

        public Transferencia(int codigo, String nome, String contaRecebe, float valor) {
            this.nome = nome;
            this.contaRecebe = contaRecebe;
            this.valor = valor;
        }
    }
        
    private class Transacao{
        int codigo;
        String tipoOperacao;
        float valor;

        public Transacao(int codigo, String tipoOperacao, float valor) {
            this.codigo = codigo;
            this.tipoOperacao = tipoOperacao;
            this.valor = valor;
        }
    }
    
    public static void main(String[] args) {
        Sistema_Bancario sis = new Sistema_Bancario();
    }
}
