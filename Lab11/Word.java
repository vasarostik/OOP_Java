package com.company;

import java.util.Scanner;

class Word {

    int Fill_int(){
        Scanner inn = new Scanner(System.in);
        System.out.println("Enter the integer: ");
        return inn.nextInt();
    }

    String Fill_String(){
        Scanner inn = new Scanner(System.in);
        return inn.nextLine();
    }

}
