import java.util.Scanner;

public class DesafioBancoVirtual {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int escolha = 0;

        String menu = """
                \n******** Banco virtual Java ********
                \n1 - Consultar saldo
                2 - Transferir
                3 - Depositar
                4 - Sair
                
                """;
        while (escolha != 4) {
            double saldo = 1000;

            System.out.print(menu);
            escolha = scanner.nextInt();
            if (escolha == 1){
                System.out.println("Saldo atual: " + saldo);
            } else if (escolha == 2){
                System.out.println("Digite o valor que deseja transferir: ");
                double valor = scanner.nextDouble();
                if (valor > saldo){
                    System.out.println("Saldo insuficiente.");
                } else {
                    saldo -= valor;
                    System.out.println("Trasferencia de: " + valor + " Realizada com sucesso!");
                    System.out.println("Saldo atual: " + saldo);
                }
            } else if (escolha == 3) {
                System.out.println("Digite o valor que deseja depositar: ");
                double valor = scanner.nextDouble();
                saldo += valor;
                System.out.println("Deposito de: " + valor + " Realizado com sucesso!");
                System.out.println("Saldo atual: " + saldo);
            } else if (escolha != 4) {
                System.out.println("Opção inválida!");

            }
        }
    }
}
