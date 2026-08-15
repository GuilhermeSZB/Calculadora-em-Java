package Java;
import java.util.Scanner;

public class calculadoraII {
    
    public static void menu(){
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

    public static double soma(double num1, double num2){
        return num1 + num2;
    }

    public static double subtracao(double num1, double num2){
        return num1 - num2;
    }

    public static double multiplicao(double num1, double num2){
        return num1 * num2;
    }

    public static double divisao(double num1, double num2){
        return num1 / num2;
    }

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double resultado = 0;
    int repeticao = 0;
        while (repeticao == 0){
        menu();
        System.out.print("Digite o numero da opção que você precisa usar: ");
        int escolha = sc.nextInt();

        if (escolha == 1 ){
            resultado = soma(15, 30);
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
