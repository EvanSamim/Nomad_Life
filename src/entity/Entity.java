package entity;

import main.GamePanel;
import main.KeyHandler;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Entity {

    // SPRITES
    public BufferedImage up1, up2, down1, down2, left1, left2, right1, right2;


    // CHARACTER ATTRIBS
    public int worldX, worldY;
    public int speed;
    public String direction = "down";


    GamePanel gp;
    KeyHandler keyH;
    public Entity(GamePanel gp, KeyHandler keyH) {
        this.gp = gp;
        this.keyH = keyH;

        setDefaultValues();
        getSprites();
    }

    public void setDefaultValues() {}
    public void getSprites() {}
    public void update() {}
    public void draw(Graphics2D g2) {}
}
