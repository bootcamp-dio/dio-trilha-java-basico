package src.com.dio.view;

import src.com.dio.model.ContaCorrente;

import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá, bem vindo ao sistema do Banco");

        System.out.println("Por favor, digite o número da conta:");
        int numero = scanner.nextInt();

        System.out.println("Agora digite a agência");
        String agencia = scanner.next();

        System.out.println("Informe o seu nome:");
        String nome = scanner.next();

        System.out.println("Agora informe o saldo inicial da conta:");
        float saldo = scanner.nextFloat();

        ContaCorrente contaCorrente = new ContaCorrente(numero, agencia, nome, saldo);

        System.out.println("Olá "+contaCorrente.getNomeCliente()+", obrigado por criar uma conta em nosso banco, sua agência é "+contaCorrente.getAgencia()+", conta "+contaCorrente.getNumero()+" e seu saldo "+contaCorrente.getSaldo()+" já está disponível para saque");




    }

}
