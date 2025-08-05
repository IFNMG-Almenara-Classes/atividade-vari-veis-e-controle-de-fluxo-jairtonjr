package questao02;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite seu peso: ");
        double peso = scanner.nextDouble();
        System.out.print("Digite sua altura: ");
        double altura = scanner.nextDouble();

        double imc = peso/(altura*altura);

        String classificacao;
        if (imc<18.5){
            classificacao = "Magreza";
        } else if (imc>=18.5 && imc<=24.9){
            classificacao = "Saudável";
        } else if (imc>=25 && imc<=29.9){
            classificacao = "Sobrepeso";
        } else if (imc>=30 && imc<=39.9){
            classificacao = "Obesidade Grau I";
        }  else if (imc>=40 && imc<=49.9){
            classificacao = "Obesidade Grau II (Severa)";
        } else{
            classificacao = "Obesidade Grau III (Mórbida";
        }

        System.out.printf("> Seu IMC é %.2f e você está %s%n", imc, classificacao);
        scanner.close();
    }
}