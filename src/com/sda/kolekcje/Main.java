package com.sda.kolekcje;

public class Main {

    public static void main(String[] args) {

        CustomList<String> lista = new CustomList<>();
        lista.add("Jan");
        lista.add("Michal");
        lista.add("Jan");
        lista.add("Michal");
        lista.add("Rafal12");
        lista.add("Michal");
        lista.add("Rafal");
        lista.add("Michal");
        lista.add("Rafal");
        lista.add("Michal");
        lista.add("Rafal");
        lista.add("Michal");
        lista.add("Rafal");


        for (int i = 0; i < lista.getSize(); i++) {
            System.out.println(lista.getElements()[i]);
        }
        System.out.println("Rozmiar: " + lista.getSize());

        for(int i=0; i < lista.getSize();i++){
            System.out.println(lista.get(i));
        }

        System.out.println("Rozmiar: " + lista.getSize());

        lista.remove(4);
        for(int i=0; i < lista.getSize();i++){
            System.out.println(lista.get(i));
        }
        System.out.println("Rozmiar: " + lista.getSize());

    }
}
