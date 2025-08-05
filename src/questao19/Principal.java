//Usando switch, escreva um programa que leia um inteiro entre 1 e 7 e imprima o dia da semana correspondente a este número. Isto é, domingo se 1, segunda-feira se 2, e assim por diante.
package questao19;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número entre 1 e 7: ");
        int dia = scanner.nextInt();

        String nomeDia;
        switch (dia) {
            case 1: nomeDia = "Domingo";
                break;
            case 2: nomeDia = "Segunda-feira"; 
                break;
            case 3: nomeDia = "Terça-feira"; 
                break;
            case 4: nomeDia = "Quarta-feira";
                break;
            case 5: nomeDia = "Quinta-feira"; 
                break;
            case 6: nomeDia = "Sexta-feira"; 
                break;
            case 7: nomeDia = "Sábado"; 
                break;
            default: nomeDia = "Número inválido";
        }
        System.out.println("> " + nomeDia);
        scanner.close();
    }
}
