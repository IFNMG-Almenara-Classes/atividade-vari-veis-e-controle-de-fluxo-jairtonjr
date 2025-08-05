//Escreva um programa que verifique a validade de uma senha fornecida pelo usuário. A senha válida é o número 1234. 
package questao04;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a senha: ");
        int senha = scanner.nextInt();

        if (senha == 1234) {
            System.out.println("> ACESSO PERMITIDO");
        } else {
            System.out.println("> ACESSO NEGADO");
        }
        scanner.close();
    }
}
