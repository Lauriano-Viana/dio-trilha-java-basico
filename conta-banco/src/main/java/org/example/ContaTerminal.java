package org.example;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int numero;
        String agencia;
        String nomecliente;
        double saldo = 0.0;

        //Msgs para o usuario
        System.out.println("Por favor, digite o número da Conta !");
        numero = scanner.nextInt();
        System.out.println("Por favor, digite o número da Agência !");
        agencia = scanner.next();
        System.out.println("Por favor, digite o nome do cliente !");
        scanner.nextLine();
        nomecliente = scanner.nextLine();
        System.out.println("Por favor, digite o valor do Saldo !");
        saldo = scanner.nextDouble();

        scanner.close();
        System.out.println("Olá " +
                nomecliente +
                ", obrigado por criar uma conta em nosso banco " +
                "\n Sua agência é:  " + agencia +
                "\n Conta n°:  " + numero +
                "\n Seu saldo é " + saldo + " já está disponível para saque.");

    }


}