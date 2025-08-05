//O fatorial de um número n (n pertence ao conjunto dos números naturais) é sempre o produto de todos os seus antecessores, incluindo si próprio e excluindo o zero.
package questao17;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro positivo: ");
        int num = scanner.nextInt();

        long fatorial = 1;
        
        for (int i = 2; i <= num; i++) {
            fatorial *= i;
        }
        System.out.println("> Fatorial de " + num + " é " + fatorial);
        scanner.close();
    }
}
