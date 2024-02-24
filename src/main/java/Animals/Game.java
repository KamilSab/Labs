package Animals;

public class Game {
    Ant ant = new Ant();
    Position antPosition = ant.position;
    Caterpillar caterpillar = new Caterpillar();
    Position caterpillarPosition = caterpillar.position;
    Turtle turtle = new Turtle();
    Position turtlePosition = turtle.position;
    Position startPosition = new Position();

    int step = 0;

    public void StartGame() {
        startPosition.setStartPosition();

        antPosition.x = startPosition.x;
        antPosition.y = startPosition.y;
        caterpillarPosition.x = startPosition.x;
        caterpillarPosition.y = startPosition.y;
        turtlePosition.x = startPosition.x;
        turtlePosition.y = startPosition.y;
        while (!inSquare()) {
            System.out.println("Шаг номер " + step++);
            ant.move();
            caterpillar.move();
            turtle.move();
            System.out.println("Позиция муравья" + ant.getPosition());
            System.out.println("Позиция гусеницы" + caterpillar.getPosition());
            System.out.println("Позиция черепахи" + turtle.getPosition());
            if (ant.Winner() != null) {
                System.out.println(ant.Winner());
                System.out.println("Позиция победителя: " + antPosition.getPosition());
                break;
            }
            if (caterpillar.Winner() != null) {
                System.out.println(caterpillar.Winner());
                System.out.println("Позиция победителя: " + caterpillarPosition.getPosition());
                break;
            }
            if (turtle.Winner() != null) {
                System.out.println(turtle.Winner());
                System.out.println("Позиция победителя: " + turtlePosition.getPosition());
                break;
            }
        }
    }
    private boolean inSquare() {
        if (ant.Winner() != null && caterpillar.Winner() != null && turtle.Winner() != null) {
            return true;
        }
        return false;
    }
}
