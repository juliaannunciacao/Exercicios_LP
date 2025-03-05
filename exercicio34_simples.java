//Aula: 27/02/2025
//Exercício: Receba um número. Calcule e mostre os resultados da tabuada desse número.

import javax.swing.JOptionPane;
public class exercicio34_simples{
    public static void main (String Args[]){
        int n, tab;
        n = Integer.parseInt(JOptionPane.showInputDialog("Insira um número."));
        for (int cta = 1; cta <= n; cta ++){
            tab = n * cta;
            JOptionPane.showMessageDialog(null, n + " vezes " + cta + " é: " + tab);
        }
    }
}