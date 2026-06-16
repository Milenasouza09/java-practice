import java.util.Scanner;
public class NumerosInteiros {
}
 public static void main(String[] args) {
     Scanner leitura = new Scanner(System.in);
     System.out.println("Digite um número ");
     int primeiroNumero = leitura.nextInt();
     System.out.println("Digite outro número ");
     int segundoNumero = leitura.nextInt();

     if (primeiroNumero == segundoNumero) {
         System.out.println("Os números são iguais! ");
     } else {
         System.out.println("Os números são diferentes! ");

     }
     if (primeiroNumero > segundoNumero) {
         System.out.println("O primeiro número é maior que o segundo número! ");
     } else {
         System.out.println("O segundo número é maior que o primeiro número! ");
     }
 }
