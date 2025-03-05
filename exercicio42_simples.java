//Aula: 27/02/2025
//Exercício: Calcule e mostre a série 1 + 2/3 + 3/5 + ... + 50/99

import javax.swing.JOptionPane;

public class exercicio42_simples{
    public static void main(String args[]){
        double serie = 1.0, numerador = 2.0, denominador = 3.0;
        for (int i = 1; i <= 49; i++) {
            serie = serie + (numerador / denominador);
            numerador = numerador + 1;
            denominador = denominador + 2;
        }
        JOptionPane.showMessageDialog(null, "O resultado da série é: " + serie);
    }
}