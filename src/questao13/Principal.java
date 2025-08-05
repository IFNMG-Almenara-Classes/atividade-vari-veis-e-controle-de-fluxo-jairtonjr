/*Construa um programa que exiba um menu com 5 opções: Ao escolher uma das opções entre 1 e 4, o programa deve solicitar que o usuário informe dois números, calcular a operação escolhida, imprimir o resultado e apresentar o menu novamente. 
Ao selecionar a opção 5, o programa deve ser finalizado. Escolhendo uma opção que não existe no menu, o programa deve apresentar o menu novamente.*/
package questao13;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcao;

        do {
            System.out.println("\nCalculadora");
            System.out.println("1 - Somar");
            System.out.println("2 - Subtrair");
            System.out.println("3 - Multiplicar");
            System.out.println("4 - Dividir");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            if (opcao >= 1 && opcao <= 4) {
                System.out.print("Digite o primeiro número: ");
                double num1 = scanner.nextDouble();
                System.out.print("Digite o segundo número: ");
                double num2 = scanner.nextDouble();
                double resultado = 0;
                switch (opcao) {
                    case 1: resultado = num1 + num2;
                    break;
                    case 2: resultado = num1 - num2;
                    break;
                    case 3: resultado = num1 * num2;
                    break;
                    case 4: resultado = num1 / num2;
                    break;
                }
                System.out.println("> Resultado: " + resultado);
            } else if (opcao != 5) {
                System.out.println("> Opção inválida.");
            }
        } while (opcao != 5);
        scanner.close();
        System.out.println("> Programa finalizado.");
    }
}
