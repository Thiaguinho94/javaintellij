package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        double a,b;

        System.out.println("Digite o primeiro valor: ");
        a = scan.nextDouble();
        System.out.println("Digite o segundo valor: ");
        b = scan.nextDouble();

        double soma = somar(a,b);
        double subtrai = subtrair(a, b);
        double multipica = multipicar(a, b);
        double dividi = dividir(a, b);

        System.out.println("Somar: " + soma);
        System.out.println("Subtrair: " + subtrai);
        System.out.println("Multiplicar: " + multipica);
        System.out.println("Dividir: " + dividi);



    }

    public static double somar(double a, double b) {
        return a + b;
    }

    public static double subtrair(double a, double b) {
        return a - b;
    }

    public static double multipicar(double a, double b) {
        return a * b;
    }

    public static double dividir(double a, double b) {
        return a / b;
    }
}

