package bigo.nguyenthai.algorithm;

public abstract class Deer {
    public Deer() { System.out.print("Deer"); }
    public Deer(int age) { System.out.print("DeerAge"); }
    private boolean hasHorns() { return false; }
    public static void main(String[] args) {
        Deer deer = new Reindeer("A",2);
        System.out.println("," + deer.hasHorns());
    }

}
