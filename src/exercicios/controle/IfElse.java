package exercicios.controle;

import javax.swing.*;

public class IfElse {
    public static void main(String[] args) {
        String valor = JOptionPane.showInputDialog("Informe um número: ");
        int numero = Integer.parseInt(valor); //Conversão string para inteiro - Se e somente se for factível.

        if(numero % 2 == 0) {
            System.out.println("O número digitado foi par");
        }
        else {
            System.out.println("O número digitado foi ímpar");
        }
    }
}