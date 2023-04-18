package bigo.nguyenthai.algorithm;

import java.util.Arrays;
import java.util.List;

public class Lession08 {

    public static void main(String[] args) {
        String str = ",1345";
        if(str.length() > 0 && str.charAt(0) == ','){
            str = str.substring(1);
        }
        String arr[] = str.split(",");
        List<String> strings = Arrays.asList(arr);
        System.out.println(strings);
    }
    public static boolean isGoku3x3(int rowStart,int rowEnd,int colStart,int colEnd,int arr[][]){
        boolean flag = true;
        boolean check[] = new boolean[10];
        for(int i = rowStart; i < rowEnd; i++){
            for(int j = colStart; j < colEnd; j++){
                if(check[arr[i][j]]){
                    flag = false;
                    break;
                }
                check[arr[i][j]] = true;
            }

        }
        return flag;
    }

}
