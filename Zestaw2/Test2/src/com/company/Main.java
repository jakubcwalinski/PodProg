package com.company;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int[] tab = new int[9];

        for (int i = 1; i < tab.length; i++) {

            tab[i] = scanner.nextInt();

            if (tab[i] == tab[i-1]){
                System.out.println(tab[i]);
                return;
            }
            System.out.println(tab[i]);
        }
    }
}