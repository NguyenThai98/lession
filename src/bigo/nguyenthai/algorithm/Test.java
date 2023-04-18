package bigo.nguyenthai.algorithm;

/**
 * Date: 3/27/2023<br/>
 * Time: 5:54 PM<br/>
 */
public class Test {
    public static void main(String[] args) {
        String ac = "inACTIVE";
        if(FlagStatusValid.isExistsCode(ac)){
            System.out.println(FlagStatusValid.getFlagStatusCode(ac));
        }else{
            System.out.println(FlagStatusValid.getFlagStatusCode(ac));
            System.out.println("not ok");
        }
    }
}
