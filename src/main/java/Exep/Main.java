package Exep;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Manager m1 = new Manager();
        TradeRequest t1 = new TradeRequest(0, new BigDecimal("0"));
        m1.regTradeRequest(t1);
    }
}
