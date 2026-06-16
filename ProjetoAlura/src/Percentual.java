public class Percentual {
    public static void main(String[] args) {

        double precoOriginal = 450.99;

        double percentualDesconto = 15.0;

        double valorD = (percentualDesconto / 100.0) * precoOriginal;
        double novoPreco = precoOriginal - valorD;

        System.out.println("Preço original: R$ " + precoOriginal);
        System.out.println("Desconto: R$ " + valorD);
        System.out.println("O valor final da compra com o desconto aplicado é de " + novoPreco);
    }
}
