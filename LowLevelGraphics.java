
import java.awt.*;
import javax.swing.*;


public class LowLevelGraphics extends JFrame {
    final int CANVAS_WIDTH = 640;
    final int CANVAS_HEIGHT = 640;

    public static void main(String[] args) {
        new LowLevelGraphics();
    }

    public LowLevelGraphics() {
        MyCanvas c = new MyCanvas();

        this.add(c, BorderLayout.CENTER);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(CANVAS_WIDTH, CANVAS_HEIGHT);
        this.setVisible(true);
    }

    class MyCanvas extends JPanel {
        public void paintComponent(Graphics g) {
            for (int i = 0; i < (CANVAS_WIDTH); i++) {
                int width = i * 10;
                int height = i * 10;
                g.setColor(Color.BLUE);
                g.fillRect(width, 0, 5, CANVAS_HEIGHT);
                g.setColor(Color.RED);
                g.drawOval(320 - (width / 2), 320 - (height / 2), width, height);
                g.setColor(Color.YELLOW);
                g.fillOval(width, height % 10, width, height);
            }
            
            // request repainting at the appropriate time
            this.repaint();
        }
    }
}
