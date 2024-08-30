package main;

import javax.swing.JFrame;
import javax.swing.ImageIcon;

public class Main extends JFrame {

    // JFRAME ITEMS
    static JFrame window = new JFrame();
    static ImageIcon icon = new ImageIcon("");

    public static void main(String[] args) {

        // WINDOW ATTRIBS
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setTitle("Nomad Life");
        window.setIconImage(icon.getImage());
        window.setResizable(false);

        GamePanel gamePanel = new GamePanel();
        window.add(gamePanel);

        window.pack();

        window.setLocationRelativeTo(null);
        window.setVisible(true);

        gamePanel.startGameThread();
    }
}
