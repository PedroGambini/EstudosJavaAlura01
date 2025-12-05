import java.util.Scanner;

public class DesafioTemperatura {
    public static void main(String[] args) {
        Scanner conversao = new Scanner(System.in);

        System.out.print("Digite uma temperatura em celcius: ");
        int temperaturaCelcius = conversao.nextInt();

        int temperaturaFahrenheit = (int) ((temperaturaCelcius * 1.8) + 32);
        System.out.println("Temperatura Fahrenheit: " +  temperaturaFahrenheit);

    }
}
