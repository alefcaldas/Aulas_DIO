import java.util.Scanner;

public class BancoJavaDIO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nomeDoCliente, senha;
        int conta1, agencia1, conta2, agencia2, acao, saldo;

        System.out.println("digite seu nome");
        nomeDoCliente = sc.nextLine();
            System.out.println("por favor digite uma senha");
            senha = sc.nextLine();

        System.out.println("Nós trabalhamos com um metodo em que você escolhe a conta e agencia então");

        System.out.println("digite aqui a agencia");
        agencia1 = sc.nextInt();
            System.out.println("digite aqui a sua conta");
            conta1 = sc.nextInt();

        System.out.println("muito bem " + nomeDoCliente + " seu acesso e conta foram criados, agora que você é um " +
                "cliente do nosso banco o que gostaria de fazer agora?");

        System.out.println("digite 1 para saldo, 2 para extrato " +
                "e 3 para Transferencias");
        acao = sc.nextInt();

        if (acao == 1) {
            System.out.println("muito bem como você é novo por aqui então seu saldo ainda é 0");
        }
            if (acao == 2) {
                System.out.println("muto bem como aqui você ainda é novo por aqui sua conta ainda não tem movimentações");
            }
                if (acao == 3) {
                    System.out.println("agencia que vai receber o dinheiro");
                    agencia2 = sc.nextInt();

                    System.out.println("conta que vai receber o dinheiro");
                    conta2 = sc.nextInt();

                    saldo = 0;

                    System.out.println("so um momento que estamos processando a transferencia" +
                            " parece que seu saldo é 0 então a transferencia não pôde ser realizada");
        }

        saldo = 0;

    }
}
