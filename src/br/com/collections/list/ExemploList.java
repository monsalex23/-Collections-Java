package br.com.collections.list;
// Dada uma lista com 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6], faça:

//      List notas = new ArrayList(); //antes do java 5
//      ArrayList<Double> notas = new ArrayList<>();
        /*List<Double> notas = Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
        notas.add(10d);
        System.out.println(notas);*/

/*List<Double> notas = List.of(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
        notas.add(1d);
        notas.remove(5d);
        System.out.println(notas);*/


import java.util.ArrayList;
import java.util.List;

public class ExemploList {
    public static void main(String[] args) {

        System.out.println("Crie uma lista e adicione as sete notas: ");
        List<Double> notas = new ArrayList<>();
        notas.add(7.0);
        notas.add(5.9);
        notas.add(0.8);
        notas.add(7.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(6.6);

        System.out.println(notas.toString());
        System.out.println("Exiba a posicao da nota 5.0: " + notas.indexOf(5d));

        System.out.println("Adiciones na lists a nota 8.0 na posicao 4: ");
        notas.add(4, 8d);
        System.out.println(notas);

//        System.out.println("Substitua a nota 5.0 pela nota 6.0: ");
//        notas.set(notas.indexOf(5d), 6.0);
//        System.out.println(notas);

        System.out.println("Confira se a nota 5.0 esta na lista:" + notas.contains(5d));

        System.out.println("Exiba todas as notas na orden em que foran informados: ");
        for (Double nota: notas) System.out.println(nota);
    }
}

