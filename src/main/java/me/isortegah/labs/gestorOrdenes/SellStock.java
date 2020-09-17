package me.isortegah.labs.gestorOrdenes;

public class SellStock implements Order {
    private Stock abcStock;

    public SellStock(Stock abcStock){
        this.abcStock = abcStock;
    }

    public int execute() {
        abcStock.sell();
        return 0;
    }
}
