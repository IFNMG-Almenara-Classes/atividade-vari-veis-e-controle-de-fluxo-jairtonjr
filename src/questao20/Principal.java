package questao20;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int num = scanner.nextInt();

        boolean divisivelPor3 = num % 3 == 0;
        boolean divisivelPor5 = num % 5 == 0;

        if (divisivelPor3 ^ divisivelPor5) {
            System.out.println("> O número é divisível por 3 ou 5, mas não por ambos.");
        } else {
            System.out.println("> O número não atende à condição.");
        }
        scanner.close();
    }
}