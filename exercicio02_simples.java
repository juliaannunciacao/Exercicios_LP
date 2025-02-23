//Aula: 13/02/2025
//Exercício: Receba o salário de um funcionário. Mostre o salário do funcionário com reajuste de 15%

import javax.swing.JOptionPane;
public class exercicio02_simples {
    public static void main (String Args[]){
    Double salario, reajuste;
    salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário: "));
    reajuste = (salario * 1.15);
    JOptionPane.showMessageDialog(null, "O salário após o reajuste é: R$" + reajuste);
    }
}
