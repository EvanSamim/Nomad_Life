package entity;

import main.GamePanel;
import main.KeyHandler;

    import java.awt.Color;
import java.awt.Graphics2D;

public class Player extends Entity{


    public Player(GamePanel gp, KeyHandler keyH) {
        super(gp, keyH);
    }

    public void setDefaultValues() {

        worldX = 100;
        worldY = 100;
        speed = 4;
    }

    public void update() {

        if (keyH.upPressed || keyH.downPressed || keyH.leftPressed || keyH.rightPressed || keyH.enterPressed || keyH.shiftPressed) {

            if (keyH.upPressed) direction = "up";
            if (keyH.downPressed) direction = "down";
            if (keyH.leftPressed) direction = "left";
            if (keyH.rightPressed) direction = "right";

            switch (direction) {
                case "up": worldY -= speed; break;
                case "down": worldY += speed; break;
                case "left": worldX -= speed; break;
                case "right": worldX += speed; break;
            }
        }
    }

    public void draw(Graphics2D g2) {

        g2.setColor(Color.white);
        g2.fillRect(worldX, worldY, gp.tileSize, gp.tileSize);
    }
}
