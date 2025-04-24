/*
Faça um programa que leia três valores e apresente o maior dos três valores lidos seguido da mensagem “eh o maior”. Utilize a fórmula:

MaiorAB = (A + B + ABS(A - B)) / 2;

Obs.: a fórmula apenas calcula o maior entre os dois primeiros (a e b). Um segundo passo, portanto é necessário para chegar no resultado esperado.

Entrada
O arquivo de entrada contém três valores inteiros.

Saída
Imprima o maior dos três valores seguido por um espaço e a mensagem "eh o maior".
 */
import java.util.Scanner;

public class Bee1013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A, B, C, maiorAB, maiorABC;
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        sc.close();
        maiorAB = (A + B + Math.abs(A - B)) / 2;
        maiorABC = (maiorAB + C + Math.abs(maiorAB - C)) / 2;
        System.out.printf("%d eh o maior\n", maiorABC);
    }
}