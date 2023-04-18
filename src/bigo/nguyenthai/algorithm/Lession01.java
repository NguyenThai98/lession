package bigo.nguyenthai.algorithm;

import java.util.Scanner;

public class Lession01 {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        boolean flag = true;
        if(input.length() == 0 || !input.contains("@")){
            flag = false;
        }else{
            String[] splitInput = input.split("@");
            if(splitInput.length == 2){
                if(!splitInput[1].contains(".")){
                    flag = false;
                }else{

                    boolean checkStr1 = false;
                    String str0 = splitInput[0].trim();
                    for(int i = 0; i < str0.length(); i++){
                        if(str0.charAt(i) >= 48 && str0.charAt(i) <= 57
                        ||str0.charAt(i) >= 65 && str0.charAt(i) <= 90
                        || str0.charAt(i) >= 97 && str0.charAt(i) <= 122
                        || str0.charAt(i) == 46
                        || str0.charAt(i) == 95){
                            if(str0.charAt(i) == 46 || str0.charAt(i) == 95 ){
                                checkStr1 = true;
                            }
                            flag = true;
                        }else{
                            flag = false;
                            break;
                        }
                    }
                    if(checkStr1){
                        String str1 = splitInput[1].trim();
                        for(int i = 0; i < str1.length(); i++){
                            if(str1.charAt(i) >= 65 && str1.charAt(i) <= 90
                                    || str1.charAt(i) >= 97 && str1.charAt(i) <= 122
                                    || str1.charAt(i) == 46){
                                if(str1.charAt(i) == 46 && i == 0){
                                    flag = false;
                                    break;
                                }
                                if(str1.charAt(i) == 46){
                                    int j = i+1;
                                    if(j < str1.length()){
                                        if(str1.charAt(j) == 46){
                                            flag = false;
                                            break;
                                        }
                                    }


                                }
                                flag = true;
                            }else{
                                flag = false;
                                break;
                            }
                        }
                    }else{
                        flag = false;
                    }


                }
            }else{
                flag = false;
            }
        }
        if(flag){
            System.out.print("VALID");
        }else{
            System.out.print("INVALID");
        }

    }


}
