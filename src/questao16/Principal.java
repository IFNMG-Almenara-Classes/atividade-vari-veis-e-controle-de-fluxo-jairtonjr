/*Construa um programa que imprima a Tabuada da divisão e multiplicação de um determinado inteiro informado pelo usuário. 
A tabuada deve apresentar as operações e os resultados entre o número e os números do intervalo entre 1 e 10.*/
package questao16;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int num = scanner.nextInt();

        System.out.println("\n> Tabuada de Multiplicação:");
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d%n", num, i, num * i);
        }
        System.out.println("\n> Tabuada de Divisão:");
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d / %d = %.2f%n", num, i, (double) num / i);
        }
        scanner.close();
    }
}
