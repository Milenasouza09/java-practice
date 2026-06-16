import java.util.Scanner;

public class PositivoNegativo {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite um número da sua escolha ");
        int numeroDigitado = leitura.nextInt();

        if (numeroDigitado >= 0) {
        System.out.println("Número positivo");
    } else {
            System.out.println("Número negativo");
        }



    }
}
