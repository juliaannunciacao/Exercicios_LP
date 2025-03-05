//Aula: 27/02/2025
//Exercício: Receba 2 números inteiros. Verifique e mostre todos os números primos existentes entre eles.

import javax.swing.JOptionPane;

public class exercicio40_simples{
    public static boolean Primo(int n){
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++){
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {
        int n1, n2;
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Insira o primeiro número inteiro"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Insira o segundo número inteiro"));
        int start = Math.min(n1, n2); //início (menor)
        int end = Math.max(n1, n2); //fim (maior)
        String resultado = ""; //String p/ armazenar os resultados
        for (int i = start + 1; i < end; i++) {
            if (Primo(i)) {
                resultado += i + "; ";  // Adiciona o número primo à string
            }
        }
        JOptionPane.showMessageDialog(null, "Números primos entre " + n1 + " e " + n2 + ": " + resultado);
    }
}