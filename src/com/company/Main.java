package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        String names[] = new String[100];
        int grades[] = new int[100];
        int sum= 00;
        System.out.println("Please enter the grades that you'd like to use\nWhen completed, please type (done)");
        Scanner listNames = new Scanner(System.in);
        for (int i = 0; i < grades.length; i++) {
            grades[i] = listNames.nextInt();
            if (grades[1] == -1) {
                break;
            }
            for (int a = 0; i < grades.length; a++) {
                names[i] = listNames.next();

            }
            System.out.println();
            sum = grades[i]/grades.length;
        }
    }
}