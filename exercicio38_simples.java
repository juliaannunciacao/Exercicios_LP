//Aula: 27/02/2025
//Exercício: Receba 100 números inteiros reais. Verifique e mostre o maior e o menos valor. Obs.: somente valores positivos.

import javax.swing.JOptionPane;
public class exercicio38_simples{
    public static void main (String args[]){
        double n, maior = 0, menor = 1000000000;
        for (int cta = 0; cta <5; cta++){
            n = Double.parseDouble(JOptionPane.showInputDialog("Insira um valor inteiro"));
            if (n > maior){
                maior = n;
            }
            if (n < maior && n < menor){
                menor = n;
            }
        }
        JOptionPane.showMessageDialog(null, "O maior número é " + maior + " e o menor número é " + menor);
    }
}