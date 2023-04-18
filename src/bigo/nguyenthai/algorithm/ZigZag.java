package bigo.nguyenthai.algorithm;

/**
 * Date: 3/23/2023<br/>
 * Time: 11:44 PM<br/>
 */
public class ZigZag {
    public static void main(String[] args) {
        String s = "PAYPALISHIRING";
        char temp;
        int checkRow;
        int numRows = 4;
        int coloumn = (s.length() / numRows) + numRows;
        char [][] arrStr = new char[numRows][coloumn];
        int i = 0, j =0;
        while(s.length() > 0){
            if(j == numRows){
               while(j > 0){
                   i++;
                   j--;
                   arrStr[i][j] = s.charAt(0);
                   s = s.substring(1);
               }
            }else if(i == 0){
                arrStr[i][j] = s.charAt(0);
                s = s.substring(1);
                j++;

            }

        }
//        for(int i = 0; i < numRows; i++){
//            for(int j = 0; j < coloumn; j++){
//                System.out.print(arrStr[i][j] + " ");
//            }
//            System.out.println();
//        }
    }
}
