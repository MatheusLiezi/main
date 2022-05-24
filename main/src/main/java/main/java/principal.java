package main.java;

import javax.swing.JOptionPane;
import main.java.calculadora.Calculadora;

public class principal {
    public static void main(String[] args ) {
        String opcao = "";
        Calculadora.calculadora = new Calculadora();
        while(!opcao.equals("9")) {
            opcao = JOptionPane.showInputDialog("1 - Leitura \n2 - Soma \n2 - Subtração \n4 - Produto \n5 - Divisão \n9 - Sair")
            switch(Integer.parseInt(opcao)) {
                case 1:
                    Calculadora.setValorA(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor A")));
                    Calculadora.setValorB(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor B")));
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Soma: " + calculadora.getAdicao());
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Subtração: " + calculadora.getSubtracao());
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Produto: " + calculadora.getProduto());
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Divisão: " + calculadora.getDivisao());
                    break;
            }
        }
    }
}