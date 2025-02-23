//Aula: 20/02/2025
//Exercício: Receba 3 coeficientes A, B e C de uma equação do 2º grau da fórmula AX²+BX+C=0. Verifique e mostre a existência de raízes reais.

import javax.swing.JOptionPane;
public class exercicio20_simples{
    public static void main (String Args []){
        double a, b, c, delta, raiz, r1, r2;
        a = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor de A"));
        b = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor de B"));
        c = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor de C"));
        delta = (b * b) - 4 * a * c;
        raiz = Math.sqrt(delta);
        r1 = (((- b) + raiz) / (2 * a));
        r2 = (((- b) - raiz) / (2 * a));
        if (delta >= 0){
            JOptionPane.showMessageDialog(null, "As raízes reais são: " + r1 + " e " + r2);
        }
        else{
            JOptionPane.showMessageDialog(null, "Não existem raízes reais.");
        }
    }
}