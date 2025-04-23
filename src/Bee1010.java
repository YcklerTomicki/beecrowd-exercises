/*
Neste problema, deve-se ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Após, calcule e mostre o valor a ser pago.

Entrada
O arquivo de entrada contém duas linhas de dados. Em cada linha haverá 3 valores, respectivamente dois inteiros e um valor com 2 casas decimais.

Saída
A saída deverá ser uma mensagem conforme o exemplo fornecido abaixo, lembrando de deixar um espaço após os dois pontos e um espaço após o "R$". O valor deverá ser apresentado com 2 casas após o ponto.
 */
import java.util.Scanner;

public class Bee1010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int peca1, numPecas1, peca2, numPecas2;
        double valorUnitario1, valorUnitario2, valorPagar;
        peca1 = sc.nextInt();
        numPecas1 = sc.nextInt();
        valorUnitario1 = sc.nextDouble();
        peca2 = sc.nextInt();
        numPecas2 = sc.nextInt();
        valorUnitario2 = sc.nextDouble();
        sc.close();
        valorPagar = (numPecas1 * valorUnitario1) + (numPecas2 * valorUnitario2);
        System.out.printf("VALOR A PAGAR: R$ %.2f\n",valorPagar);
    }
}