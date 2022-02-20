package com.max.idea;
//import javax.swing.*;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
        System.out.println("Ввести первое  число");
        String type = input.nextLine();
        System.out.println("Ввести второе  число");
        int type2 = input.nextInt();

        int result1 = Math.max(Integer.parseInt(type),  type2);
        double result2 = Math.min(Double.valueOf(type), type2);

        System.out.println("Большее число:" + result1);
        System.out.println("Меньшее число:" + result2);
    }
}


















































































