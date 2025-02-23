//Aula: 13/02/2025
//Exercício 05: Receba A, B e C de uma equação do 2ºgrau. Calcule e mostre as raízes reais (considerar 2 raízes).
//Fórmula: (B)² - 4 * A * C = 0
//Fórmula: (- (b) + raiz) / (2 * A)
//raiz quadrada: Math.sqrt()

import javax.swing.JOptionPane;
public class exercicio05_simples{
    public static void main (String Args []){
        Double A, B, C, delta, raiz, resultado1, resultado2;
        A = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor de A: "));
        B = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor de B: "));
        C = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor de C: "));
        delta = ((B * B) - (4 * A * C));
        raiz = Math.sqrt(delta);
        resultado1 = (((- B) + delta) / (2 * A));
        resultado2 = (((- B) - delta) / (2 * A));
        JOptionPane.showMessageDialog(null, "As raízes são: " + resultado1 + " e " + resultado2);
    }
}