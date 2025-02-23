//Aula: 20/02/2025
//Exercício: Receba um valor inteiro. Verifique e mostre se é divisível por 2 e 3.

import javax.swing.JOptionPane;
public class exercicio24_simples{
    public static void main (String Args[]){
        int valor;
        valor = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor inteiro"));
        if (valor % 2 == 0 && valor % 3 == 0){
            JOptionPane.showMessageDialog(null, "O número " + valor + " é divisível por 2 e 3.");
        }
        else{
            JOptionPane.showMessageDialog(null, "O número " + valor + " não é divisível por 2 e 3.");
        }
    }
}