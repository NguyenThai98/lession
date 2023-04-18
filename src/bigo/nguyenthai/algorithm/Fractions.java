package bigo.nguyenthai.algorithm;

import java.util.Scanner;

public class Fractions {
    private int numerator;
    private int denominator;
    private static int $ = 19;

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[3];
        for(int i = 0; i < 3; i++){
            arr[i] = sc.nextInt();
        }
        int[] newArr = new int[4];
        int i=0;
        int rs1 = arr[0] + (arr[1] * arr[2]);
        newArr[i++] = rs1;
        int rs2 = arr[0] * (arr[1] + arr[2]);
        newArr[i++] = rs2;
        int rs3 = arr[0] * arr[1] * arr[2];
        newArr[i++] = rs3;
        int rs4 = (arr[0] + arr[1]) * arr[2];
        newArr[i++] = rs4;
        int max = newArr[0];
        for(int j = 1; j < i; j++){
            if(newArr[j] > max){
                max = newArr[j];
            }
        }
        System.out.print(max);

    }

    public Fractions() {
    }

    public Fractions(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    @Override
    public String toString() {
        return numerator + " " + denominator;
    }
}
