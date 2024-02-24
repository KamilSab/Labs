package graphic;

import javax.swing.*;
import java.awt.*;
public class GraphicPainting extends JFrame {
    private IFunction function;
    private static final int HEIGHT = 600;
    private static final int WIDTH = 800;

    public GraphicPainting(IFunction function) {
        super("График функции");
        this.function = function;
        this.setSize(WIDTH, HEIGHT);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.repaint();
        this.setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        Graphics g2d = (Graphics2D) g;

        g2d.setColor(new Color(255, 0, 0));

        Font currentFont = g2d.getFont();
        Font newFont = currentFont.deriveFont(currentFont.getSize() * 3F);
        g2d.setFont(newFont);

        //g2d.drawString("Парабола", 50, 100);

        g2d.drawLine(400, 0, 400, 600);
        g2d.drawLine(0, 300, 800, 300);

        for (int i = 0; i < WIDTH; ++i) {
            g2d.fillRect(i, HEIGHT / 2 - (int)function.func(i), 3, 3);
        }
    }
}
