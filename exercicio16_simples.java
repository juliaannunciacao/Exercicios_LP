//Aula: 13/02/2025
//Exercício: Receba a quantidade de horas trabalhadas, o valor por hora, o percentual de desconto e o número de dependentes.
//Calcule o salário (horas trabalhadas * valor por hora). Calcule o salário líquido (bruto - desconto). A cada dependente
//será acrescido R$100 no salário líquido. Exiba o salário a receber.

import javax.swing.JOptionPane;
public class exercicio16_simples{
    public static void main (String Args[]){
        double horastrabalhadas, valorhora, desconto, dependentes, bruto, liquido;
        horastrabalhadas = Double.parseDouble(JOptionPane.showInputDialog("Insira a quantidade de horas trabalhadas"));
        valorhora = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor por hora"));
        desconto = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor a ser descontado"));
        dependentes = Double.parseDouble(JOptionPane.showInputDialog("Insira a quantidade de dependentes"));
        bruto = (horastrabalhadas * valorhora);
        dependentes = (dependentes * 100);
        liquido = (bruto - (bruto * desconto) + dependentes);
        JOptionPane.showMessageDialog(null, "O valor do salário líquido é: R$" + liquido);
    }
}