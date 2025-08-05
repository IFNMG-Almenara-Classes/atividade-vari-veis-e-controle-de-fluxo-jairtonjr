//Escreva um programa que receba um número e informe se o número é par ou ímpar.
package questao03;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = scanner.nextInt();

        if (num % 2 == 0){
            System.out.println("> O número " + num + " é par");
        } else {
            System.out.println("> O número " + num + " é ímpar");
        }
        scanner.close();
    }
}
