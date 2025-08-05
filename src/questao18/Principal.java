//Escreva um programa que, dados dois números inteiros positivos inseridos pelo usuário, verifique e imprima a quantidade de números primos entre eles.
package questao18;
import java.util.Scanner;

public class Principal {
    public static boolean ehPrimo(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro número (positivo): ");
        int inicio = scanner.nextInt();
        System.out.print("Digite o segundo número (positivo): ");
        int fim = scanner.nextInt();

        int contagemPrimos = 0;

        for (int i = Math.min(inicio, fim); i <= Math.max(inicio, fim); i++) {
            if (ehPrimo(i)) {
                contagemPrimos++;
            }
        }
        System.out.println("> Quantidade de números primos: " + contagemPrimos);
        scanner.close();
    }
}
