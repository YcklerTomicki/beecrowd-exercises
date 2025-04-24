/*
Leia um valor inteiro correspondente à idade de uma pessoa em dias e informe-a em anos, meses e dias

Obs.: apenas para facilitar o cálculo, considere todo ano com 365 dias e todo mês com 30 dias. Nos casos de teste nunca haverá uma situação que permite 12 meses e alguns dias, como 360, 363 ou 364. Este é apenas um exercício com objetivo de testar raciocínio matemático simples.

Entrada
O arquivo de entrada contém um valor inteiro.

Saída
Imprima a saída conforme exemplo fornecido.
 */
import java.util.Scanner;

public class Bee1020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idadeDias, anos, meses, dias;
        idadeDias = sc.nextInt();
        sc.close();
        //Anos
        anos = idadeDias / 365;
        idadeDias = idadeDias % 365;
        //Meses
        meses = idadeDias / 30;
        idadeDias = idadeDias % 30;
        //Dias
        dias = idadeDias;
        System.out.printf("%d ano(s)\n", anos);
        System.out.printf("%d mes(es)\n", meses);
        System.out.printf("%d dia(s)\n", dias);
    }
}