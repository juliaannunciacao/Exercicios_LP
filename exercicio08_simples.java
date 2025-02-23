//Aula: 13/02/2025 
//Exercício 08: Receba o valor de um depósito em poupança. Calcule e mostre o valor após 1 mês sabendo que rende 1,3%a.m..

import javax.swing.JOptionPane;
public class exercicio08_simples{
    public static void main (String Args []){
        Double deposito, valor;
        deposito = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do depósito: "));
        valor = deposito + (deposito * 1.3);
        JOptionPane.showMessageDialog(null, "O valor após 1 mês é de R$" + valor);
    }
}