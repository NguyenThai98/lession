package bigo.nguyenthai.algorithm;

import java.util.Scanner;

public class Lession03 {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        int ans = 0;
        int lv1 = 15000;
        int lv2 = 13500;
        int lv3 = 11000;
        boolean check = false;
        if(input >= 12){
            check = true;
        }
        if(input >= 1){
            ans += lv1 * 1;
        }
        input = input -1;
        if(input > 4){
            input = input - 4;
            ans += lv2 * 4;
        }else{
            ans += lv2 * input;
            input = 0;
        }
        if(input > 0){
            ans +=  input * lv3;
        }
        if(check){
            ans -= (ans*0.1);
        }
        System.out.println(ans);

    }

}
