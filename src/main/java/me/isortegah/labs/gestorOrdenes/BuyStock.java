package me.isortegah.labs.gestorOrdenes;

public class BuyStock implements Order {
    private Stock abcStock;

    public BuyStock(Stock abcStock){
        this.abcStock = abcStock;
    }

    public int execute() {
        abcStock.buy();
        return 0;
    }
}
