package com.bzl.line;
import java.util.Scanner;

public class LineComparisonUC3 {
    public static double x1;
    public static double y1;
    public static double x2;
    public static double y2;
    public static double l1;
    public static double l2;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] len = new double[2];
        for (int i = 1; i <= 2; i++) {
            System.out.println(" enter values for "+i+" line ");
            System.out.println("Enter value of x1 : ");
            x1 = sc.nextInt();
            System.out.println("Enter value of y1 : ");
            y1 = sc.nextInt();
            System.out.println("Enter value of x2 : ");
            x2 = sc.nextInt();
            System.out.println("Enter value of y2 : ");
            y2 = sc.nextInt();
            len[i-1] = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        }
        l1 = len[0];
        l2 = len[1];
        if (l1 < l2){
            System.out.println("l1 is lesser than l2");
        }else if (l1 == l2){
            System.out.println("l1 is equal to l2 ");
        }else if ( l1 > l2){
            System.out.println("l1 is greater than l2 ");
        }

    }
}