//Aula: 27/02/2025
//Exercício: Receba um número inteiro. Calcule e mostre a série de Fibonacci até o seu N’nésimo termo.

import javax.swing.JOptionPane;
public class exercicio37_simples{
    public static void main (String args[]){
        int n;
        int a = 0;
        int b = 1;
        n = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor inteiro"));
        
        // Exibe os primeiros termos da sequência de Fibonacci
        String resultado = a + ", " + b;

        // Calcula e exibe os próximos termos até o N-ésimo termo
        for (int i = 2; i < n; i++) {
            int proxtermo = a + b;
            resultado = resultado + ", " + proxtermo;
            a = b; 
            b = proxtermo;
        }
        JOptionPane.showMessageDialog(null, "A sequência Fibonacci até o " + n + "º termo é: " + resultado);
    }
}