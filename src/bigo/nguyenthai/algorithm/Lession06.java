package bigo.nguyenthai.algorithm;

import java.util.Scanner;

public class Lession06 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String inputStr = in.nextLine();
        StringBuffer builder = new StringBuffer();
        String [] strArr = inputStr.split("\\. ");
        for(int i = 0; i < strArr.length; i++){
            if(i != strArr.length -1 && strArr.length > 1){
                if(strArr[i].length() > 0){
                    String str = strArr[i].substring(1);
                    String newStr ="" ;
                    if(i != 0){
                        String firstChar = strArr[i].substring(0,1).toUpperCase();
                        newStr = firstChar.concat(str) +"." + " ";
                    }else{
                        String firstChar = strArr[i].substring(0,1);
                        newStr = firstChar.concat(str) +"." + " ";
                    }
                    builder.append(newStr);
                }else{
                    builder.append(". ");
                }

            }else{
                if(strArr.length == 1){
                    builder.append(strArr[i]);
                }else{
                    String str = strArr[i].substring(1);
                    String newStr ="" ;
                    if(i != 0){
                        String firstChar = strArr[i].substring(0,1).toUpperCase();
                        newStr = firstChar.concat(str);
                    }else{
                        String firstChar = strArr[i].substring(0,1);
                        newStr = firstChar.concat(str) +"." + " ";
                    }
                    builder.append(newStr);
                }

            }
        }
        if(builder.length() < inputStr.length()){
            builder.append(". ");
        }
        System.out.println(builder.toString());
    }

}
