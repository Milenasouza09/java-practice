import java.util.Random;
import java.util.Scanner;

public class Adivinhacao {
    public static void main(String[] args) {


        Scanner leitura = new Scanner(System.in);
        int numeroAleatorio = new Random().nextInt(100); // gera um número aleatório entre 0 e 100
        int tentativas = 0;
        int numeroDigitado = 0;

        while (tentativas < 5) {
            System.out.println("Digite um número aleatório de 0 a 100 ");
            numeroDigitado = leitura.nextInt();
            tentativas++;

            if (numeroDigitado == numeroAleatorio) {
                System.out.println("Parabéns você acertou o número em  " + tentativas + "tentativas!");
                break; // interrompe o loop while
            } else if (numeroDigitado < numeroAleatorio) {
                System.out.println("Você digitou um número menor que o esperado ");
            } else {
                System.out.println("Você digitou um número maior que o esperado ");


            }
        }
        if (tentativas == 5 && numeroDigitado != numeroAleatorio) {
            System.out.println("Você não conseguiu acertar o número em 5 tentativas. O número era: " + numeroAleatorio);
        }
    }

}
