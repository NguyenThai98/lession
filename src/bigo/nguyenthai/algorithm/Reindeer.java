package bigo.nguyenthai.algorithm;

public class Reindeer extends Deer {

    public Reindeer(int age) {
        System.out.print("Reindeer");
    }
    public Reindeer(int age, int a) {
        System.out.print("Reindeer");
    }
    public Reindeer(String age, int a) {
        super(1);
        System.out.print("Reindeer 2 var string - int");
    }
    public boolean hasHorns() { return true; }
}
