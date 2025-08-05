/*Uma pizzaria fornece 10% de desconto para funcionários e 5% de desconto para clientes VIP. Faça um programa que calcule o valor total a ser pago pela venda de uma pizza. 
O programa deverá ler o valor da compra e um código que indica o tipo de cliente: 1-Comum, 2-VIP e 3-Funcionário.*/
package questao14;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor da compra: ");
        double valor = scanner.nextDouble();
        System.out.print("Digite o código do cliente (1-Comum, 2-VIP, 3-Funcionário): ");
        int tipo = scanner.nextInt();

        double desc = 0;

        switch (tipo) {
            case 2: desc = 0.05;
            break;
            case 3: desc = 0.10;
            break;
        }

        double valorFinal = valor - (valor * desc);

        System.out.printf("> Valor a pagar: R$ %.2f%n", valorFinal);
        scanner.close();
    }
}
