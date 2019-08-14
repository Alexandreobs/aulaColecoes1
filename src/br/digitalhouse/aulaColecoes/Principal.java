package br.digitalhouse.aulaColecoes;

import java.awt.*;
import java.util.*;
import java.util.List;

public class Principal {

    public static void main(String[] args) {

        //explompo de Set list - HasSet
        Set<String> conjunto = new HashSet<>();
        conjunto.add("Alexandre");
        conjunto.add("jessica");
        conjunto.add("Will");
        conjunto.add("Robson");

        for (String listNome: conjunto){
            System.out.println(listNome);
        }

        {
            System.out.println("\n");
            System.out.println("Loteria dos sonhos");
        }

        // exercicio de HasMap

        Map<Integer, String> sonhos = new HashMap<>();
        sonhos.put(0,"Ovo");
        sonhos.put(1,"Águia");
        sonhos.put(2,"Escopeta");
        sonhos.put(3,"cavalo");
        sonhos.put(4,"dentista");
        sonhos.put(5,"fogo");


        for(Integer key: sonhos.keySet()){
            String valor = sonhos.get(key);
            System.out.println(key + " " + valor);
        }


        {
            System.out.println("\n");
        }

        {
            // exercicio de HasMap
            System.out.println("-= Apelidos dos amigos =-");
            Map<String, String> apelidos = new HashMap<>();
            apelidos.put("joão", "Juan, Fissura, Maromba");
            apelidos.put("Miguel", "Night Watch, Bruce Wayne, Tampinha");
            apelidos.put("Maria", "Wonder Woman, Mary, Marilene");
            apelidos.put("Lucas", "Lukinha, Jorge, George");


            for (String key: apelidos.keySet()){
                    String  valor = apelidos.get(key);
                    System.out.println(key + " tem os seguintes apelidos:  " + valor + "\n");


            }

            {
                System.out.println("\n");
            }


        }


        // exemplo de List Arraylist

        List<String> exnamoradas = new ArrayList<>();
        exnamoradas.add("Patricia Morais");
        exnamoradas.add("Patricia Sueroz");
        exnamoradas.add("jennifer Coelho");
        exnamoradas.add("Mayara Silva");
        exnamoradas.add("Lindsay Oliveira");

        exnamoradas.remove(4);

        for (String valor: exnamoradas) {
            System.out.println(valor);
        }

        String valor = exnamoradas.get(0);
        System.out.println(valor);


    }

}
