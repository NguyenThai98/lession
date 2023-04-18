package bigo.nguyenthai.algorithm.oop.builder;

/**
 * Date: 4/6/2023<br/>
 * Time: 2:48 PM<br/>
 */
public interface OrderBuilder {
    OrderBuilder orderType(OrderType orderType);

    OrderBuilder orderBread(BreadType breadType);

    OrderBuilder orderSauce(SauceType sauceType);

    OrderBuilder orderVegetable(VegetableType vegetableType);

    Order build();
}
