//Escreva um programa utilizando o comando switch que imprima um mês de acordo com o número digitado pelo usuário. (1 – Janeiro,...,12 – Dezembro).
package questao15;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número do mês: ");
        int mes = scanner.nextInt();

        String nomeMes;
        switch (mes) {
            case 1: nomeMes = "1 - Janeiro";
            break;
            case 2: nomeMes = "2 - Fevereiro";
            break;
            case 3: nomeMes = "3 - Março";
            break;
            case 4: nomeMes = "4 - Abril";
            break;
            case 5: nomeMes = "5 - Maio";
            break;
            case 6: nomeMes = "6 - Junho";
            break;
            case 7: nomeMes = "7 - Julho";
            break;
            case 8: nomeMes = "8 - Agosto";
            break;
            case 9: nomeMes = "9 - Setembro";
            break;
            case 10: nomeMes = "10 - Outubro";
            break;
            case 11: nomeMes = "11 - Novembro";
            break;
            case 12: nomeMes = "12 - Dezembro";
            break;
            default: nomeMes = "Número inválido";
        }
        System.out.println("> " + nomeMes);
        scanner.close();
    }
}

