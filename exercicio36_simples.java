//Aula: 27/02/2025
//Exercício: Receba um número N. Calcule e mostre a série 1 + 1/1! + 1/2! + ... + 1/N!

import javax.swing.JOptionPane;
public class exercicio36_simples{
    public static void main (String Args[]){
        double n;
        double serie = 1.0;
        n = Double.parseDouble(JOptionPane.showInputDialog("Insira um valor"));
        for (int cta = 1; cta <= n; cta ++){
            double fatorial = 1;
            for (int cta2 = 1; cta2 <= cta; cta2 ++){
                fatorial = fatorial * cta2;         
            }
            serie = serie + (1.0 / fatorial);
        }
        JOptionPane.showMessageDialog(null, "O resultado da série é: " + serie);
    }
}