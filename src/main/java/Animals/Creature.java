package Animals;

public abstract class Creature {
    String name;
    Position position = new Position();

    public abstract void move();
    public abstract String getName();
    public abstract String Winner();
    public abstract String getPosition();
}
