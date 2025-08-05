//As laranjas custam R$0,50 cada se forem compradas menos do que uma dúzia, e R$0,30 se forem compradas pelo menos doze. Escreva um programa que leia o número de laranjas compradas, calcule e escreva o valor total da compra.
package questao05;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número de laranjas compradas: ");
        int quanti = scanner.nextInt();

        double precoPorUnidade = (quanti < 12) ? 0.50 : 0.30;
        double total = quanti * precoPorUnidade;

        System.out.printf("> Valor total da compra: R$ %.2f%n", total);
        scanner.close();
    }
}
