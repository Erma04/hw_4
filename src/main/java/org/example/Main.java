package org.example;


import java.util.ArrayList;

import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        ArrayList<String> listA = new ArrayList<>();


        for (int i = 0; i < 5; i++) {
            String user = console.nextLine();
            listA.add(user);
        }
        System.out.println("Список А: " + listA);



        ArrayList<String> listB = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            String user2 = console.nextLine();
            listB.add(user2);


        }
        System.out.println("Список B: " + listB);
        Collections.reverse(listB);

        ArrayList<String> listC = new ArrayList<>();
        listC.addAll(listA);
        listC.addAll(listB);

        listC.add(1, listC.get(5));
        listC.remove(6);
        listC.add(3, listC.get(6));
        listC.remove(7);
        listC.add(5, listC.get(7));
        listC.remove(8);
        listC.add(7, listC.get(8));
        listC.remove(9);
        listC.add(9, listC.get(9));
        listC.remove(10);

        System.out.println("Список С: "+listC);
        Collections.sort(listC, Comparator.comparing(String::length));
        System.out.println("Отсортированный список C: "+listC);
















        }


    }
