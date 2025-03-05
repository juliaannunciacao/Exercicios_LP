//Aula: 27/02/2025
//Exercício: Receba um número. Calcule e mostre a série 1 + 1/2 + 1/3 + ... + 1/N.

import javax.swing.JOptionPane;
public class exercicio33_simples{
    public static void main (String Args[]){
        double n;
        double serie = 0;
        n = Double.parseDouble(JOptionPane.showInputDialog("Insira um número"));
        for (int cta = 1; cta <= n; cta++){
            serie = serie + 1.0/cta;
        }
        JOptionPane.showMessageDialog(null, "O resultado da série é: " + serie);
    }
}