//Aula: 27/02/2025
/*Exercício: Receba 2 números inteiros, verifique qual o maior entre eles. Calcule e mostre o resultado da
somatória dos números ímpares entre esses valores.
*/

import javax.swing.JOptionPane;
public class exercicio35_simples{
    public static void main (String Arg[]){
        int n1, n2, maior, menor;
        int soma = 0;
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor inteiro"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Insira mais um valor inteiro"));
        if (n1 < n2){
            maior = n2;
            menor = n1;
        }else{
            maior = n1;
            menor = n2;
        }
        for (int i = menor + 1; i < maior; i++) {
            // Verifica se o número é ímpar
            if (i % 2 != 0) {
                soma += i;  // Soma o número ímpar à variável somatoria
            }
        }
        JOptionPane.showMessageDialog(null, "A soma dos números ímpares entre " + n1 + " e " + n2 + " é: " + soma);
    }
}