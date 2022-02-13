/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emon.raihan;

import java.util.Scanner;

/**
 *
 * @author Raihan Mahamud
 */
public class Emi {

    public static void main(String[] args) {
        /*Scanner a = new Scanner(System.in);

        double principal, rate, time, emi;

        System.out.print("Enter principal: ");
        principal = a.nextFloat();

        System.out.print("Enter rate: ");
        rate = a.nextFloat();

        System.out.print("Enter time in year: ");
        time = a.nextFloat();

        rate = rate / (12 * 100);
        time = time * 12;

        emi = (principal * rate * Math.pow(1 + rate, time)) / (Math.pow(1 + rate, time) - 1);

        System.out.print("Monthly EMI is= " + emi + "\n");
        System.out.print("Monthly in is= " + (Math.pow(1 + rate, time) - 1) + "\n");
        System.out.print("Monthly pay is= " + principal * rate * Math.pow(1 + rate, time) + "\n");*/

        Emi eCalc = new Emi();
        eCalc.calcEmiAllMonths(100000, 9, 36);

    }

    public Double calcEmi(double p, double r, double n) {
        double R = (r / 12) / 100;
        double e = (p * R * (Math.pow((1 + R), n)) / ((Math.pow((1 + R), n)) - 1));

        return e;
    }

    public void calcEmiAllMonths(double p, double r, double n) {

        double R = (r / 12) / 100;
        double P = p;
        double e = calcEmi(P, r, n);
        double totalInt = Math.round((e * n) - p);
        double totalAmt = Math.round((e * n));
        System.out.println("***************************");
        System.out.println(" Principal-> " + P);
        System.out.println(" Rate of Interest-> " + r);
        System.out.println(" Number of Months-> " + n);

        System.out.println(" EMI -> " + Math.round(e));
        System.out.println(" Total Interest -> " + totalInt);
        System.out.println(" Total Amount -> " + totalAmt);

        System.out.println("***************************");
        double intPerMonth = Math.round(totalInt / n);

        for (double i = 1; i <= n; i++) {
            intPerMonth = (P * R);
            P = ((P) - ((e) - (intPerMonth)));
            System.out.println(" Month -> " + (int) i);
            System.out.println(" Interest per month -> "
                    + Math.round(intPerMonth));
            System.out.println(" Principal per month -> "
                    + Math.round((e) - intPerMonth));
            System.out.println(" Balance Principal -> " + Math.round(P));
            System.out.println("***************************");
        }
    }

}
