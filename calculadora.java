package Java;
import java.util.Scanner;

public class calculadora {

    
    static Double num1 = 0;
    static Double num2 = 0;
    //Métodos
    public static void menu() {
        System.out.println(" ==== MENU ==== ");
        System.out.println("  ");
        System.out.println("1 - Soma ");
        System.out.println("2 - Subtração ");
        System.out.println("2 - Subtração ");
        System.out.println("3 - Multiplicação ");
        System.out.println("4 - Divisão ");
        System.out.println("5 - Sair");
        System.out.println("  ");
    }

    public static double numeros(){
        System.out.print("Qual é o numero: ");
        double resposta = sc.nextDouble();
        return resposta;
    }
    //Método para soma de dois numeros
    public static double soma(double num1, double num2) {
        return num1 + num2;
    }
    //Método para subtração de dois numeros
    public static double subtracao(double num1, double num2) {
        return num1 - num2;
    }
    //Método para multiplicação de dois numeros
    public static double multiplicao(double num1, double num2) {
        return num1 * num2;
    }
    //Métodos para divisão de dois numeros
    public static double divisao(double num1, double num2) {
        return num1 / num2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double resultado = 0;
        int repeticao = 0;

        //While para sempre rodar o sistema
        while (repeticao == 0) {
            menu();
            System.out.print("Digite o numero da opção que você precisa usar: ");
            int escolha = sc.nextInt();

                //IF para escolher qual tipo de conta o usuario precisa
                if (escolha == 1) {
                    num1 = numeros();
                    num2 = numeros();
                    resultado = soma(num1, num2);
                    System.out.println("A soma é de " + resultado);
                } else if (escolha == 2) {
                    resultado = subtracao(15, 30);
                    System.out.println("A subtração é de " + resultado);
                } else if (escolha == 3) {
                    resultado = multiplicao(15, 30);
                    System.out.println("A multiplicação é de " + resultado);
                } else if (escolha == 4) {
                    resultado = divisao(15, 30);
                    System.out.println("A divisão é de " + resultado);
                } else if (escolha == 5) {
                    System.out.println(" ==== FIM SISTEMA ==== ");
                    repeticao = repeticao + 1;
                } else {
                    System.out.println("Digite o numero certo!");
                    System.out.println(" ");
                }
        }
        sc.close();
    }
}
