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