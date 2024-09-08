package Atividades;

import java.util.*;

public class Atv3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma lista de números inteiros separados por espaço:");
        String input = scanner.nextLine();
        String[] stringArray = input.split(" ");
        List<Integer> listaOriginal = new ArrayList<>();
        for (String s : stringArray) {
            try {
                listaOriginal.add(Integer.parseInt(s));
            } catch (NumberFormatException e) {
                System.out.println("Número inválido: " + s);
            }
        }
        Set<Integer> conjuntoSemDuplicatas = new HashSet<>(listaOriginal);


        List<Integer> listaSemDuplicatas = new ArrayList<>(conjuntoSemDuplicatas);


        System.out.println("Lista original: " + listaOriginal);
        System.out.println("Lista sem duplicatas: " + listaSemDuplicatas);
        scanner.close();
    }
}

