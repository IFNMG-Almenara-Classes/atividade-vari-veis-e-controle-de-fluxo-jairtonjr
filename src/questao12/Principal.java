package questao12;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num, soma = 0, total = 0, par = 0;

        while (true) {
            System.out.print("Digite um número (0 para encerrar): ");
            num = scanner.nextInt();
            if (num == 0) {
                break;
            }
            soma += num;
            total++;
            if (num % 2 == 0) {
                par++;
            }
        }
        if (total > 0) {
            double media = (double) soma / total;
            System.out.println("> Quantidade de números pares: " + par);
            System.out.printf("> Média dos números digitados: %.2f%n", media);
        } else {
            System.out.println("> Nenhum número válido foi digitado.");
        }
        scanner.close();
    }
}