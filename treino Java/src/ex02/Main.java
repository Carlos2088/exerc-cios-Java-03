package ex02;
//Escreva um algoritmo que leia um número inteiro positivo N e exiba os N primeiros termos da
//sequência de Fibonacci.

//Write an algorithm that reads a positive integer N and prints the first N terms of the
//Fibonacci sequence.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Inform one number positive!");
        int user = read.nextInt();

        if (user < 0){
            System.out.println("Was not possible do the Fibonacci sequence!");
            System.out.println("Type only positive numbers!");
            return;
        }

        int primeiro = 1;
        int segundo = 0;
        System.out.println("The Fibonacci sequence is: ");
        for(int i = 0; i < user; i++){
            int proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;
            System.out.print(proximo + " ");
        }
    }
}
