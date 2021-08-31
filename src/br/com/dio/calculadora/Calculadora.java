package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int a,b;

        System.out.println("Digite o primeiro valor: ");
        a = scan.nextInt();
        System.out.println("Digite o segundo valor: ");
        b = scan.nextInt();

        int soma = somar(a,b);
        int subtrai = subtrair(a, b);
        int multipica = multipicar(a, b);
        int dividi = dividir(a, b);

        System.out.println("Somar: " + soma);
        System.out.println("Subtrair: " + subtrai);
        System.out.println("Multiplicar: " + multipica);
        System.out.println("Dividir: " + dividi);



    }

    public static int somar(int a, int b) {
        return a + b;
    }

    public static int subtrair(int a, int b) {
        return a - b;
    }

    public static int multipicar(int a, int b) {
        return a * b;
    }

    public static int dividir(int a, int b) {
        return a / b;
    }
}

