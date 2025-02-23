//Aula: 13/02/2025
//Exercício: Receba o ano de nascimento e o ano atual. Calcule e mostre a sua idade e quanto anos terá daqui a 17 anos.

import javax.swing.JOptionPane;
public class exercicio12_simples{
    public static void main (String Args[]){
        double nascimento, atual, idadefutura;
        nascimento = Double.parseDouble(JOptionPane.showInputDialog("Insira o ano de nascimento"));
        atual = Double.parseDouble(JOptionPane.showInputDialog("Insira o ano atual"));
        idadefutura = (atual - nascimento + 17);
        JOptionPane.showMessageDialog(null, "A idade daqui a 17 anos será de " + idadefutura + " anos.");
    }
}