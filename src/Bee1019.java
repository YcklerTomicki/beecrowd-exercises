/*
Leia um valor inteiro, que é o tempo de duração em segundos de um determinado evento em uma fábrica, e informe-o expresso no formato horas:minutos:segundos.

Entrada
O arquivo de entrada contém um valor inteiro N.

Saída
Imprima o tempo lido no arquivo de entrada (segundos), convertido para horas:minutos:segundos, conforme exemplo fornecido.
 */
import java.util.Scanner;

public class Bee1019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tempoSegundos, horas, minutos, segundos;
        tempoSegundos = sc.nextInt();
        sc.close();
        // Convertemos segundos em minutos
        minutos = tempoSegundos / 60;
        // Pegamos o resto e colocamos em segundos
        segundos = tempoSegundos % 60;
        // Pegamos os minutos e dividimos por 60 para pegar as horas
        horas = minutos / 60;
        // Pegamos o resto e colocamos em minutos
        minutos = minutos % 60;
        System.out.println(horas + ":" + minutos + ":" + segundos);
    }
}