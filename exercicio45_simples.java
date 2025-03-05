//Aula: 27/02/2025
//Exercício: Calcule e mostre a série 1 – 2/4 + 3/9 – 4/16 + 5/25 + ... + 15/225

import javax.swing.JOptionPane;

public class exercicio45_simples{
    public static void main (String args[]){
        double soma = 0;
        boolean positivo = true;  //para o primeiro termo ser positivo
        for (int i = 1; i <= 15; i++){
            double termo = (double) i / (i * i);
            if (positivo){
                soma = soma + termo;  //se for positivo, soma
            }else{
                soma = soma - termo;  //se for negativo, subtrai
            }
            positivo = !positivo;  //alterna o sinal
        }
        JOptionPane.showMessageDialog(null, "O resultado da série é: " + soma);
    }
}