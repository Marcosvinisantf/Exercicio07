import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 7 - Faça um algoritmo que leia dois valores booleanos (lógicos) e determine se ambos são VERDADEIRO ou FALSO.
        Scanner sc = new Scanner(System.in);
        System.out.println("Olá, esse programa irá ler dois valores booleanos e determinar se ambos sao verdadeiros ou falso\n\nDigite o primeiro valor: ");
        int number1 = sc.nextInt();
        System.out.println("Agora digite o segundo valor: ");
        int number2 = sc.nextInt();
        if (number1 == 1 && number2 == 1){
            System.out.println("Ambos sao VERDADEIROS");
        }else
            System.out.println("Um ou mais é FALSO");
    }
}
