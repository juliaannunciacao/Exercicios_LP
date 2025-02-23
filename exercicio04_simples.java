//Aula: 13/02/2025  
//Exercício 04: Receba a temperatura em graus Celsius. Calcule e mostre sua temperatura convertida em Fahrenheit.
//Fórmula: F = (9 * C + 160) / 5

import javax.swing.JOptionPane;
public class exercicio04_simples{
    public static void main (String Args[]){
        double C, F;
        C = Double.parseDouble(JOptionPane.showInputDialog("Insira a temperatura em graus: "));
        F = ((9 * C + 160) / 5);
        JOptionPane.showMessageDialog(null, "A temperatura convertida em Fahrenheit é: " + F);
    }
}