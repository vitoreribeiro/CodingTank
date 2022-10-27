import jdk.swing.interop.SwingInterOpUtils;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double somaAritmetica = 0;
        double mediaAritmetica = 0;
        double mediaHarmonica = 0;
        double res = 0;
        double resultado = 0;
        String aritmetica = "ARITMETICA";
        String harmonica = "HARMONICA";
        String resposta = null;

        boolean loop = true;
        while (loop) {

            try {
                System.out.print("Quantos numeros voce vai digitar? ");

                Integer n = Integer.parseInt(sc.nextLine());

                double[] vect = new double[n];

                for (int i = 0; i < vect.length; i++) {
                    System.out.print("Digite um numero: ");
                    vect[i] = sc.nextDouble();
                }
                sc.nextLine();
                boolean igual = true;
                while (igual) {
                    System.out.println("Qual media deseja calcular? (HARMONICA / ARITMETICA)?");

                    resposta = sc.nextLine();
                    if (resposta.equals(aritmetica) || resposta.equals(harmonica)) {
                        igual = false;
                    } else {
                        System.out.print("Por favor, digite HARMONICA ou ARITMETICA");
                        System.out.println();
                    }
                }

                for (double v : vect) {
                    somaAritmetica += v;
                }
                for (int i = 0; i < vect.length; i++) {
                    res += 1 / (vect[i]);
                }
                loop = false;


                System.out.println("Numeros digitados:");
                for (int i = 0; i < vect.length; i++) {
                    System.out.printf("%.2f ", vect[i]);

                }
                System.out.println();
                if (resposta.equals(aritmetica)) {
                    resultado = somaAritmetica / n;
                    System.out.println("Media escolhida: ARITMETICA");
                    System.out.printf("MEDIA ARITMETICA: %.2f%n", resultado);
                } else if (resposta.equals(harmonica)) {

                    resultado = n / res;
                    System.out.println("Media escolhida: HARMONICA");
                    System.out.printf("MEDIA HARMONICA: %.2f%n", resultado);
                }

            } catch (NumberFormatException | InputMismatchException e) {

                System.out.println("O argumento foi inválido. Entre com um número.");

            }
        }
    }
}






