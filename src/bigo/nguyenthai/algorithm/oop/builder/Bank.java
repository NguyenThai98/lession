package bigo.nguyenthai.algorithm.oop.builder;

/**
 * Date: 4/6/2023<br/>
 * Time: 2:54 PM<br/>
 */
public class Bank {
    private String name;
    private String code;
    private BankA bankA;
    private BankB bankB;

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", bankA=" + bankA +
                ", bankB=" + bankB +
                '}';
    }

    public BankA getBankA() {
        return bankA;
    }

    public Bank setBankA(BankA bankA) {
        this.bankA = bankA;
        return this;
    }

    public BankB getBankB() {
        return bankB;
    }

    public Bank setBankB(BankB bankB) {
        this.bankB = bankB;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Bank(String name, String code) {
        this.name = name;
        this.code = code;
    }

    public Bank() {
    }

    public class BankA {
        private String price;

        public String getPrice() {
            return price;
        }

        public void setPrice(String price) {
            this.price = price;
        }

        @Override
        public String toString() {
            return "BankA{" +
                    "price='" + price + '\'' +
                    '}';
        }
    }

    public class BankB{
        public String getPrice() {
            return price;
        }

        public void setPrice(String price) {
            this.price = price;
        }

        private String price;

        @Override
        public String toString() {
            return "BankB{" +
                    "price='" + price + '\'' +
                    '}';
        }
    }

}
