package ex01;
//1. Faça um algoritmo que utilize o laço while para mostrar todos os números pares positivos até
//o número estipulado pelo usuário.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Informe um numero positivo!");
        int user = read.nextInt();

        if (user < 0){
            System.out.println("Nao foi possivel contar os numeros pares!");
            System.out.println("Insira apenas numeros positivos");
            return;
        }
        if (user == 1 || user == 0){
            System.out.println("Nao a numeros pares!");
            return;
        }
        int par = 2;

        System.out.println("Os numeros pares sao: ");

        while (par < user){
            par+=2;
            System.out.println(par);
        }


    }
}