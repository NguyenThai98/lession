package bigo.nguyenthai.algorithm.oop;

import bigo.nguyenthai.algorithm.oop.builder.Bank;
import bigo.nguyenthai.algorithm.oop.builder.Bank.BankA;
import bigo.nguyenthai.algorithm.oop.builder.Bank.BankB;
import bigo.nguyenthai.algorithm.oop.builder.BankAccount;
import bigo.nguyenthai.algorithm.oop.builder.BreadType;
import bigo.nguyenthai.algorithm.oop.builder.FastFoodOrderBuilder;
import bigo.nguyenthai.algorithm.oop.builder.Order;
import bigo.nguyenthai.algorithm.oop.builder.OrderType;
import bigo.nguyenthai.algorithm.oop.builder.SauceType;
import bigo.nguyenthai.algorithm.oop.builder.VegetableType;

/**
 * Date: 4/6/2023<br/>
 * Time: 1:48 PM<br/>
 */
public class test {
    public static void main(String[] args) {
        BankAccount account = new BankAccount.BankAccountBuilder()
                .name("nguyen")
                .show("thai")
                .close("19")
                .build();
        System.out.println(account.toString());
        Order order = new FastFoodOrderBuilder()
                .orderType(OrderType.ON_SITE)
                .orderBread(BreadType.OMELETTE)
                .orderSauce(SauceType.SOY_SAUCE)
                .orderVegetable(VegetableType.SALAD).build();
        System.out.println(order);
        Bank bank = new Bank();
        BankB bankB = bank.new BankB();
        BankA bankA = bank.new BankA();
        bankB.setPrice("200");
        bankA.setPrice("100");
        bank.setBankA(bankA);
        bank.setBankB(bankB);

        System.out.println(bank.toString());
    }
}
