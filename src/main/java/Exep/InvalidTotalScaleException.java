package Exep;

public class InvalidTotalScaleException extends Exception{
    private final int currentScale;
    private final int validScale;

    public InvalidTotalScaleException(String message, int currentScale, int validScale) {
        super(message);
        this.currentScale = currentScale;
        this.validScale = validScale;
    }

    public int getCurrentScale() {
        return currentScale;
    }

    public int getValidScale() {
        return validScale;
    }
}
