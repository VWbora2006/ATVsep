package Atividades;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class Atv2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> primeiroConjunto = new HashSet<>();
        System.out.println("Digite os números do primeiro conjunto (digite 'sair' para encerrar):");
        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("sair")) {
                break;
            }
            try {
                int numero = Integer.parseInt(input);
                primeiroConjunto.add(numero);
            } catch (NumberFormatException e) {
                System.out.println("Por favor, digite um número válido ou 'sair' para encerrar.");
            }
        }

        // Solicita e armazena o segundo conjunto de números inteiros
        Set<Integer> segundoConjunto = new HashSet<>();
        System.out.println("Digite os números do segundo conjunto (digite 'sair' para encerrar):");
        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("sair")) {
                break;
            }
            try {
                int numero = Integer.parseInt(input);
                segundoConjunto.add(numero);
            } catch (NumberFormatException e) {
                System.out.println("Por favor, digite um número válido ou 'sair' para encerrar.");
            }
        }

        // Fecha o Scanner
        scanner.close();

        // Verifica se o segundo conjunto é um subconjunto do primeiro
        if (primeiroConjunto.containsAll(segundoConjunto)) {
            System.out.println("O segundo conjunto é um subconjunto do primeiro.");
        } else {
            System.out.println("O segundo conjunto NÃO é um subconjunto do primeiro.");
        }
    }
}
