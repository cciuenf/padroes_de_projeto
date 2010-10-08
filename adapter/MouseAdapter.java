import javax.swing.*;
import java.awt.*;

public class AdapterFrame extends JFrame {

    private int clickCount = 0;

    public AdapterFrame() {
        this.setSize(500, 500);
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        final JLabel label = new JLabel();
        this.getContentPane().add(label);

        this.addMouseListener(
            new MouseAdapter() {
                public void mouseClicked(MouseEvent event) {
                    AdapterFrame.this.clickCount++;
                    label.setText("Você clicou " + AdapterFrame.this.clickCount + " vezes!");
                }
            }
        );
    }

    public static void main(String[] args) {
        new AdapterFrame();
    }
}

