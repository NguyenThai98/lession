package bigo.nguyenthai.algorithm;

import java.util.Arrays;
import java.util.logging.Logger;

public class Sorting {
    private static final Logger LOGGER = Logger.getLogger(Sorting.class.getName());
    public static void main(String[] args) {
        int [] arr = new int []{12,1,-2,3,2,5,4,0,21,3,5,6,9,4};
       // System.out.println(binarySearch(arr, 0, arr.length -1, 21)  +1);
        //recursionMergeSort(arr,arr.length);

        System.out.println(longestPalindrome("ababababa"));


        int a = 123 % 100;
        System.out.println(a);
    }

    public static int [] recursionMergeSort(int [] a, int n){
        if(n == 1){
            return a;
        }
        int mid = n / 2;
        int [] m1 = new int[mid];
        int [] m2 = new int[n - mid];
        for(int i = 0; i < mid; i++){
            m1[i] = a[i];
        }
        for(int i = 0; i < n - mid; i++){
            m2[i] = a[mid+i];
        }
        m1 = recursionMergeSort(m1, mid);
        m2 = recursionMergeSort(m2, n - mid);
        print(m1);
        System.out.print("M1");
        System.out.println();
        print(m2);
        System.out.print("M2");
        System.out.println();
        return merge(m1, m2,mid, n - mid);
    }
    public static void print(int [] a){
        Arrays.stream(a).boxed().forEach(e -> System.out.print(e + ","));
    }
    public static int[] merge(int[] m1,int[] m2, int l1, int l2){
        int j = 0, i =0, k =0;
        int [] newArr = new int[l1+l2];
        while(i < l1 && j < l2){
            if(m1[i] <= m2[j]){
                newArr[k++] = m1[i++];
            }else{
                newArr[k++] = m2[j++];
            }
        }
        while(i < l1){
            newArr[k++] = m1[i++];
        }

        while(j < l2){
            newArr[k++] = m2[j++];
        }
        return newArr;
    }

    public static int binarySearch(int [] a, int l, int r, int number){
        while(l <= r){
            int mid = (l + r) /2;
            if(a[mid] == number){
                return mid;
            }else if(a[mid] > number){
                r = mid - 1;
            }else{
                l = mid + 1;
            }
        }
        return -2;
    }

    public static String longestPalindrome(String s) {
        boolean flag = false;
        for(int i = 0; i < s.length() -1; i++){
            if(s.charAt(i) != s.charAt(i+1)){
                flag = true;
                break;
            }
        }
        if(s.length() == 1){
            return s;
        }else if(flag){
            int i = 0, j = i +1, n = s.length() -1;
            int max = 0;
            String rs = "";
            while(i < n){
                String subStr = s.substring(i,j);
                if(isPalindrome(subStr)){
                    if(subStr.length() > max){
                        rs = subStr;
                        max = subStr.length();
                        if(max == s.length()){
                            break;
                        }else if(max > (s.length() - subStr.length())){
                            break;
                        }
                    }

                }
                if(j > n){
                    i++;
                    j = i+1;
                }else{
                    j++;
                }
            }
            return rs;
        }else{
            return s;
        }
    }
    public static boolean isPalindrome(String str){
        boolean flag = true;
        if(str.length() == 1){
            return flag;
        }else if(str.length() < 1 || str == null) {
            return false;
        }else{
            int i = 0, j = str.length() -1;
            while(i < j){
                if(str.charAt(i) != str.charAt(j)){
                    flag = false;
                    break;
                }
                i++;
                j--;
            }
        }
        return flag;
    }
}
