package Exep;

import java.math.BigDecimal;

public class Manager {
    public void regTradeRequest(TradeRequest req) {
        try {
            validateAmount(req.getAmount());
        } catch (InvalidAmountException e) {
            System.out.println("Amount should be greater than 0");
        }
        try {
            validateTotal(req.getTotal());
        } catch (InvalidTotalException e) {
            System.out.println("Total should be greater than 0");
        } catch (InvalidTotalScaleException e) {
            System.out.println("Total has scale " + e.getCurrentScale() + " instead of scale " + e.getValidScale());
        }
    }

    private void validateAmount(int amount) throws InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException("Amount should be greater than 0");
        }
    }

    private void validateTotal(BigDecimal total) throws InvalidTotalException, InvalidTotalScaleException {
        if (total.compareTo(BigDecimal.ZERO) <= 0) {
            throw new InvalidTotalException("Total should be greater than 0");
        }
        if (total.scale() > 2) {
            throw new InvalidTotalScaleException("Total has scale" + total.scale() + " instead of scale 2", total.scale(), 2);
        }
    }
}
