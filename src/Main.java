import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Sistema de Verificação de Pares e Ímpares ===");
        System.out.println("Por favor, digite 5 números:");

        int quant = 5;
        int par = 0;
        int impar = 0;

        int[] use = new int[quant];

        for (int i = 0; i < quant; i++) {
            System.out.print("Por favor, digite o " + (i + 1) + "º número: ");
            use[i] = scanner.nextInt();

            if (use[i] % 2 == 0) {
                ++par;
            } else {
                ++impar;
            }
        }

        int soma = 0;

        for (int s = 0; s < quant; s++) {
            soma += use[s];
        }

        System.out.println();
        System.out.println("Os números digitados são: " + Arrays.toString(use));
        System.out.println("Quantidade de números ímpares digitados: " + impar);
        System.out.println("Quantidade de números pares digitados: " + par);
        System.out.println("A soma de todos os números é: " + soma);

        scanner.close();
    }
}

