package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int[] tab = new int[13];


        for (int i = 0; i < tab.length; i++) {

            tab[i] = scanner.nextInt();

            if (tab[i] == tab[i+2] && tab[i+2] == tab[i+4]){

                //System.out.println(" " + tab[i]);
                return;

            }
            System.out.println(tab[i]);
        }
    }
}