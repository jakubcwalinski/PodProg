package com.company;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {


        int[] tab = new int[8];

        for (int j = tab.length-1; j >=0; j++) {
            Scanner scanner = new Scanner(System.in);
            i = scanner.nextInt();
            i++;
            System.out.println(i);

            if (i == i+1){
                System.out.println("dupa");
            }
        }
    }
}