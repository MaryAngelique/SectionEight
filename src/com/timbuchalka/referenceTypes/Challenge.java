package com.timbuchalka.referenceTypes;

import java.util.Scanner;

public class Challenge {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter count:");

        int count = scanner.nextInt();
        scanner.nextLine();

    }

    private static int[] readIntegers(int count) {

        int[] array = new int[count];

        for(int i = 0; i < array.length; i++) {

            System.out.println("Enter a number:");

            int number = scanner.nextInt();
            scanner.nextLine();
            array[i] = number;

        }

        return array;
    }


}
