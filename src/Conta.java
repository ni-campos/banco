import java.util.Scanner;

public class Conta {
    static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        String nome = "Nicole";
        String tipoConta = "Conta Corrente";
        double saldoDaConta = 2500.00;

        System.out.println("Dados iniciais do cliente");
        System.out.println("\nNome: " + nome);
        System.out.println("Tipo de conta: " + tipoConta);
        System.out.println("Saldo da Conta: R$" + String.format("%.2f", saldoDaConta));
        System.out.println("***************************************************");

        int escolha = 0;
        while (escolha != 4) {
            System.out.println("Operações");
            System.out.println("1 - Consultar saldo da conta ");
            System.out.println("2 - Depositar ");
            System.out.println("3 - Receber ");
            System.out.println("4 - Sair");
            System.out.println("Escolha: ");
            escolha = leitura.nextInt();

            if (escolha == 1) {
                System.out.println("Saldo da conta: R$" + String.format("%.2f", saldoDaConta));
                double saldoConta = saldoDaConta;
                double saldoDeposito = leitura.nextDouble();

            } else if (escolha == 2) {
                System.out.println("Informe quanto quer depositar: ");
                double depositar = leitura.nextDouble();
                if (depositar>saldoDaConta) {
                    System.out.println("Não há saldo");
                }
                else {
                    saldoDaConta -= depositar;
                    System.out.println("Novo saldo da conta: " + saldoDaConta);
                }
            } else if (escolha == 3) {
                System.out.println("Informe o valor a receber: ");
                double receber = leitura.nextDouble();
                saldoDaConta += receber;
                System.out.println("Novo saldo da conta: " + saldoDaConta);
            } else if (escolha == 4) {
                System.out.println("Programa finalizado");
                double fechar = leitura.nextDouble();
            } else {
                System.out.println("Opção inválida. Tente novamente");

            }
        }
    }
}

