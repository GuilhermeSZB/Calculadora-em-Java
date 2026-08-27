package Java;
import java.util.Scanner;

public class calculadora {

    static Scanner sc = new Scanner(System.in);
    static double num1 = 0;
    static double num2 = 0;
    //Métodos

    //Método para o inicio do 
    public static void menu() {
        System.out.println(" ==== MENU ==== ");
        System.out.println("  ");
        System.out.println("1 - Soma ");
        System.out.println("2 - Subtração ");
        System.out.println("3 - Multiplicação ");
        System.out.println("4 - Divisão ");
        System.out.println("5 - Sair");
        System.out.println("  ");
    }

    //Método para pedir o numero
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
                    num1 = numeros();
                    num2 = numeros();
                    resultado = subtracao(num1, num2);
                    System.out.println("A subtração é de " + resultado);

                } else if (escolha == 3) {
                    num1 = numeros();
                    num2 = numeros();
                    resultado = multiplicao(num1, num2);
                    System.out.println("A multiplicação é de " + resultado);

                } else if (escolha == 4) {
                    num1 = numeros();
                    num2 = numeros();
                        if (num2 != 0) {
                            resultado = divisao(num1, num2);
                            System.out.println("A divisão é de " + resultado);
                        } else {
                            System.out.println("Não é possível dividir por zero!");
                        }

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
