public class Conversao {
    public static void main(String[] args) {

        double temperaturaC = 30.4;
        double temperaturaF = (temperaturaC * 1.8) + 32;
        System.out.println(temperaturaF);

        String mensagem = String.format("A temperatura de %f Celsius é igual a %f Fahrenheit", temperaturaC, temperaturaF);

        System.out.println(mensagem);

        int temperaturaFInt = (int) temperaturaF;
        System.out.println("A temperatura em Fahrenheit inteira é: " + temperaturaFInt);

    }
}

