package tiles;

import main.GamePanel;
import main.UtilityTool;

import javax.imageio.ImageIO;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class TileManager {

    public Tile[] tile;
    public int[][] mapTileNum;

    GamePanel gp;
    public TileManager(GamePanel gp) {
        this.gp = gp;

        tile = new Tile[50];

        getTileImage();
    }

    public void getTileImage() {

        setup(0, "steps_01", false);
    }

    public void setup(int index, String fileName, boolean collision) {
        UtilityTool uTool = new UtilityTool();

        try {

            tile[index] = new Tile();
            tile[index].image = ImageIO.read(getClass().getResourceAsStream("/tile/" + fileName + ".png"));
            tile[index].image = uTool.scaleImage(tile[index].image, gp.tileSize, gp.tileSize*2);
            tile[index].collision = collision;

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void draw(Graphics2D g2) {

        g2.drawImage(tile[0].image, 0, 0, gp.tileSize*2, gp.tileSize*4, null);
    }
}
