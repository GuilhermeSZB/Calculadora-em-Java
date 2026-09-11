package Java;
import java.util.Scanner;

public class calculadora {

    static Scanner sc = new Scanner(System.in);
    static double num1 = 0;
    static double num2 = 0;
    static String opr = null;
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
    public static double numeros(String texto){
        System.out.print(texto);
        double resposta = sc.nextDouble();
        return resposta;
    }

    //Método para fazer a operação
    public static double oper(double num1, double num2) {
    switch (opr) {

        case "+":
            return num1 + num2;

        case "-":
            return num1 - num2;

        case "*":
            return num1 * num2;

        case "/":
            if (num2 != 0 ){
                double resultado = num1 / num2;
                System.out.println("O resultado da divisão é de " + resultado);
            } else {
                System.out.println("Erro: Imposivel Dividir por Zero");
            }

        default:
            System.out.println(" ");
            return 0; // RETORNO OBRIGATÓRIO: Se o operador for inválido, ele devolve 0
    }
    }

    //Método para perguntar sobre os dois numero
    public static void pegarnumeros(){
        num1 = numeros("Qual é o primeiro numero: ");

        num2 = numeros("Qual é o segundo numero: ");
    }

    public static void main(String[] args) {
        double resultado = 0;
        int repeticao = 0;

        //While para sempre rodar o sistema
        while (repeticao == 0) {
            menu();
            System.out.print("Digite o numero da opção que você precisa usar: ");
            int escolha = sc.nextInt();

            //Switch para escolha de qual tipo de conta o usuario quer utilizar
              switch (escolha) {

                case 1:

                    pegarnumeros();
                    opr = "+";
                    resultado = oper(num1, num2);
                    System.out.println("A soma é de " + resultado);

                    break;

                case 2:

                    pegarnumeros();
                    opr = "-";
                    resultado = oper(num1, num2);
                    System.out.println("A subtração é de " + resultado);

                    break;

                case 3:

                    pegarnumeros();
                    opr = "*";
                    resultado = oper(num1, num2);
                    System.out.println("A multiplicação é de " + resultado);

                    break;

                case 4:

                    opr = "/";
                    pegarnumeros();
                    oper(num1, num2);               

                    break;

                case 5:

                    System.out.println(" ==== FIM SISTEMA ==== ");
                    repeticao = repeticao + 1;

                    break;
                        
              
                default:

                    System.out.println("Digite o numero certo!");
                    System.out.println(" ");

                    break;
              }
        }
        sc.close();
    }
}
