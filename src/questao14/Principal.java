package questao14;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor da compra: ");
        double valor = scanner.nextDouble();
        System.out.print("Digite o código do cliente (1-Comum, 2-VIP, 3-Funcionário): ");
        int tipo = scanner.nextInt();

        double desconto = 0;

        switch (tipo) {
            case 2: desconto = 0.05;
            break;
            case 3: desconto = 0.10;
            break;
        }

        double valorFinal = valor - (valor * desconto);

        System.out.printf("> Valor a pagar: R$ %.2f%n", valorFinal);
        scanner.close();
    }
}