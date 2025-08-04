//Escreva um programa que receba dois inteiros e informe qual o maior deles.
package questao01;
include java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();
        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        int maior = (num1 > num2) ? num1:num2;

        System.out.println("> O maior número é: " + maior);
        scanner.close();
    }
}
