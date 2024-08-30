package main;

import javax.swing.JPanel;

import java.awt.Dimension;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class GamePanel extends JPanel implements Runnable{

    // SCREEN SETTINGS
    public final int originalTileSize = 16;
    public final int scale = 4;

    public final int tileSize = originalTileSize * scale;

    public final int screenCol = 20;
    public final int screenRow = 11;

    public final int screenWidth = tileSize * screenCol;
    public final int screenHeight = tileSize * screenRow;

    public final int FPS = 120;



    // SYSTEM
    Thread gameThread;




    public GamePanel() {

        this.setPreferredSize(new Dimension(screenWidth, screenHeight));
        this.setBackground(Color.black);
        this.setDoubleBuffered(true);
    }

    public void startGameThread() {

        gameThread = new Thread(this);
        gameThread.start();
    }

    @Override
    public void run() {

    }
}
