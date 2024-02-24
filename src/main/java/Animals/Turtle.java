package Animals;

public class Turtle extends Creature {
    public Turtle() {
        name = "Черепаха";
    }

    @Override
    public void move() {
        int direction = (int) (Math.random() * 5);
        if (direction == 0) {
            if (position.x + 1 <= 1000) {
                position.x++;
            }
        } else if (direction == 1) {
            if (position.x + 1 <= 1000 || position.y - 1 >= 0) {
                position.x++;
                position.y--;
            }
        } else if (direction == 2) {
            if (position.x + 1 <= 1000 || position.y + 1 <= 1000) {
                position.x++;
                position.y++;
            }
        } else if (direction == 3) {
            if (position.x - 1 >= 0 | position.y + 1 <= 1000) {
                position.x--;
                position.y++;
            }
        } else {
            if (position.x - 1 >= 0 | position.y - 1 >= 0) {
                position.x--;
                position.y--;
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
