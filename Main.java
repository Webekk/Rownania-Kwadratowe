package com.rownanie;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Rownanie kwadratowe :)");
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj a:");
        double a = in.nextDouble();
        System.out.println("Podaj b:");
        double b = in.nextDouble();
        System.out.println("Podaj c");
        double c = in.nextDouble();

        double result = b * b - 4 * a * c;
        System.out.println("Delta jest rowna = " + result);
        System.out.println("Pierwiastek z delty jest równy = " + Math.sqrt(result));
        if(result > 0.0){
            double x1 = (-b + Math.pow(result,0.5))/(2.0 * a);
            double x2 = (-b - Math.pow(result,0.5))/(2.0 * a);
            System.out.println("Miejsca zerowe to x1 = "+x1+" i x2 = " + x2);
        }else if(result == 0.0){
            double x = -b/(2.0 * a);
            System.out.println("Miejsce Zerowe to x = " + x);
        }else{
            System.out.println("Rownanie nie ma rozwiazan");
        }
    }
}
