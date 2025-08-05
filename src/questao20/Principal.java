//Faça um programa para verificar se um determinado número inteiro é divisível por 3 ou 5, mas não simultaneamente pelos dois.
package questao20;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int num = scanner.nextInt();

        boolean dividePor3 = num % 3 == 0;
        boolean dividePor5 = num % 5 == 0;

        if (dividePor3 ^ dividePor5) {
            System.out.println("> O número é divisível por 3 ou 5, mas não por ambos.");
        } else {
            System.out.println("> O número não atende à condição.");
        }
        scanner.close();
    }
}
