package Atividades;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Atv1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> palavrasUnicas = new TreeSet<>();
        System.out.println("Digite palavras (digite 'sair' para encerrar):");
        while (true) {
            String palavra = scanner.nextLine();
            if (palavra.equalsIgnoreCase("sair")) {
                break;
            }
            palavrasUnicas.add(palavra);
        }
        scanner.close();
        System.out.println("Número de palavras únicas: " + palavrasUnicas.size());
        System.out.println("Palavras em ordem alfabética:");
        for (String palavra : palavrasUnicas) {
            System.out.println(palavra);
        }
    }
}