//Aula: 13/02/2025
//Exemplo 01: Receba o salário de um funcionário. Mostre o salário do funcionário com reajuste de 15% (ex. 02)
//void main: método pricipal, onde os comandos do código devem ficar para que ele seja executado
/*Dá pra fazer comentário assim também (tinha esquecido)*/
//Shift + F6 = atalho para rodar o programa

import javax.swing.JOptionPane;
public class exercicio02_simples {
    public static void main (String Args[]){
    Double salario, reajuste;
    salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário: "));
    reajuste = (salario * 1.15);
    JOptionPane.showMessageDialog(null, "O salário após o reajuste é: R$" + reajuste);
    }
}