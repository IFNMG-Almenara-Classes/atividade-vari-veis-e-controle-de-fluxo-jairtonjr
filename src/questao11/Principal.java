//Construa um programa que solicite do usuário um número inteiro e positivo e imprima todos os números pares entre 0 e o número digitado.
package questao11;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro e positivo: ");
        int num = scanner.nextInt();

        for (int i = 0; i <= num; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        scanner.close();
    }
}
