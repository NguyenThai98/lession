package bigo.nguyenthai.algorithm.oop.builder;

/**
 * Date: 4/6/2023<br/>
 * Time: 1:50 PM<br/>
 */
public class BankAccount {

    private String name;
    private String show;
    private String close;


    public BankAccount() {
    }

    public BankAccount(String name, String show, String close) {
        this.name = name;
        this.show = show;
        this.close = close;
    }

    public static class BankAccountBuilder{
        private String name;
        private String show;
        private String close;

        public BankAccountBuilder name(String name){
            this.name = name;
            return this;
        }
        public BankAccountBuilder show(String show){
            this.show = show;
            return this;
        }
        public BankAccountBuilder close(String close){
            this.close = close;
            return this;
        }
        public BankAccount build(){
            return new BankAccount(this.name,this.show,this.close);
        }
    }
    @Override
    public String toString() {
        return "BankAccount{" +
                "name='" + name + '\'' +
                ", show='" + show + '\'' +
                ", close='" + close + '\'' +
                '}';
    }
}
