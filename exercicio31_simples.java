//Aula: 27/02/2025
//Exercício: Calcule e mostre o quadrado dos números entre 10 e 150.

import javax.swing.JOptionPane;
public class exercicio31_simples{
    public static void main (String Args[]){
        double quadrado;
        for (int n = 10; n < 150; n++){
            quadrado = n * n;
            JOptionPane.showMessageDialog(null, " O quadrado de " + n + " é: " + quadrado);
        }
    }
}