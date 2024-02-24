package Animals;

public class Caterpillar extends Creature {
    public Caterpillar() {
        name = "Гусеница";
    }

    @Override
    public void move() {
        int direction = (int) (Math.random() * 3);
        if (direction == 0) {
            if (position.y - 1 >= 0) {
                position.y--;
            }
        } else if (direction == 1) {
            if (position.x + 1 <= 1000) {
                position.x++;
            }
        } else {
            if (position.y + 1 <= 1000) {
                position.y++;
            }
        }
    }

    @Override
    public String getName() {
        return name;

    }

    public String Winner() {
        if ((position.x > 400 && position.x < 800) && (position.y > 400 && position.y < 800)) {
            return getName() + " выиграла!!!";
        }
        return null;
    }

    public String getPosition() {
        return position.getPosition();
    }
}
