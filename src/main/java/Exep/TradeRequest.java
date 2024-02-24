package Exep;

import java.math.BigDecimal;
public class TradeRequest {
    private final int amount;
    private final BigDecimal total;

    public TradeRequest(int amount, BigDecimal total) {
        this.amount = amount;
        this.total = total;
    }

    public int getAmount() {
        return amount;
    }

    public BigDecimal getTotal() {
        return total;
    }
}
