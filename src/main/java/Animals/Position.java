package Animals;

public class Position {
    int x = 0;
    int y = 0;

    public String getPosition() {
        return "(" + x + ", " + y + ")";
    }

    public void setStartPosition() {
        x = (int)(Math.random() * 1000);
        y = (int)(Math.random() * 1000);
    }
}
