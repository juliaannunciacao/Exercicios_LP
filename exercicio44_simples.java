//Aula: 27/02/2025
//Exercício: Receba o número da base e do expoente. Calcule e mostre o valor da potência.

import javax.swing.JOptionPane;

public class exercicio44_simples{
    public static void main (String args[]){
        double base, expoente, resultado;
        base = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor da BASE"));
        expoente = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do EXPOENTE"));
        resultado = Math.pow(base, expoente);
        JOptionPane.showMessageDialog(null, "O valor da potência de base " + base + " e expoente " + expoente + " é: " + resultado);
    }
}