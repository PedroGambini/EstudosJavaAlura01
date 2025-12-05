import java.util.Random;
import java.util.Scanner;

public class DesafioJogoAdvinha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeroSecreto = new Random().nextInt(50);
        int tentativas = 0;
        int numeroDigitado = 0;

        while(tentativas < 5) {
            tentativas++;
            System.out.print("Digite um número entre 0 e 50: ");
            numeroDigitado = scanner.nextInt();


            if (numeroDigitado == numeroSecreto) {
                System.out.println("Parabéns! Você descobriu o número secreto: " + numeroSecreto);
                break;
            } else if (numeroDigitado < numeroSecreto) {
                System.out.println("O número é maior que: " + numeroDigitado);
            } else {
                System.out.println("O número é menor que: " + numeroDigitado);
            }

            if (tentativas == 5 && numeroDigitado != numeroSecreto) {
                System.out.println("Você tinha 5 chances e não descobriu o número secreto.. o número secreto era: " + numeroSecreto);
                break;
            }
        }
    }
}
