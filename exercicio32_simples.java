//Aula: 27/02/2025
//Exercício: Receba um número inteiro. Calcule e mostre o seu fatorial.

import javax.swing.JOptionPane;
public class exercicio32_simples{
    public static void main (String Args[]){
        int n;
        int fatorial = 1;
        n = Integer.parseInt(JOptionPane.showInputDialog("Insira um número inteiro"));
        for (int cta = 1; cta <= n; cta ++){
            fatorial = fatorial * cta;
        }
        JOptionPane.showMessageDialog(null, "O fatorial de " + n + " é: " + fatorial);
    }
}
