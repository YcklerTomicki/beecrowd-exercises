/*
Leia um valor de ponto flutuante com duas casas decimais. Este valor representa um valor monetário. A seguir, calcule o menor número de notas e moedas possíveis no qual o valor pode ser decomposto. As notas consideradas são de 100, 50, 20, 10, 5, 2. As moedas possíveis são de 1, 0.50, 0.25, 0.10, 0.05 e 0.01. A seguir mostre a relação de notas necessárias.

Entrada
O arquivo de entrada contém um valor de ponto flutuante N (0 ≤ N ≤ 1000000.00).

Saída
Imprima a quantidade mínima de notas e moedas necessárias para trocar o valor inicial, conforme exemplo fornecido.

Obs: Utilize ponto (.) para separar a parte decimal.
 */
import java.util.Scanner;

public class Bee1021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double valor = sc.nextDouble();
        sc.close();

        int centavos = (int)Math.round(valor * 100);

        int[] notas = {10000, 5000, 2000, 1000, 500, 200};
        int[] moedas = {100, 50, 25, 10, 5, 1};

        System.out.println("NOTAS:");
        for (int i = 0; i < notas.length; i++) {
            int quantidade = centavos / notas[i];
            centavos %= notas[i];
            System.out.printf("%d nota(s) de R$ %.2f\n", quantidade, notas[i] / 100.0);
        }

        System.out.println("MOEDAS:");
        for (int i = 0; i < moedas.length; i++) {
            int quantidade = centavos / moedas[i];
            centavos %= moedas[i];
            System.out.printf("%d moeda(s) de R$ %.2f\n", quantidade, moedas[i] / 100.0);
        }
    }
}