package tiles;

import main.GamePanel;
import main.UtilityTool;

import javax.imageio.ImageIO;
import java.awt.Graphics2D;
import java.io.IOException;

public class TileManager {

    public Tile[] tile;
    public int[][] mapTileNum;

    private String filePath;

    GamePanel gp;
    public TileManager(GamePanel gp) {
        this.gp = gp;

        tile = new Tile[50];

        getTileImage();
    }

    public void getTileImage() {

        setup("steps", 0, "steps_01", false);
        setup("grass_tiles", 1, "grass_path_07", false);
    }

    public void setup(String filePath, int index, String fileName, boolean collision) {
        UtilityTool uTool = new UtilityTool();

        try {

            tile[index] = new Tile();
            tile[index].image = ImageIO.read(getClass().getResourceAsStream("/" + filePath +"/" + fileName + ".png"));
            switch (filePath) {
                case "steps": tile[index].image = uTool.scaleImage(tile[index].image, gp.tileSize*2, gp.tileSize*4); break;
                case "grass_tiles": tile[index].image = uTool.scaleImage(tile[index].image, gp.tileSize, gp.tileSize); break;
            }
            tile[index].collision = collision;

        } catch (IOException e) {
            e.printStackTrace();
        }
        this.filePath = filePath;
    }

    public void draw(Graphics2D g2) {

        int worldCol = 0;
        int worldRow = 0;

        while (worldCol <= gp.screenWidth && worldRow <= gp.screenHeight) {

            int num = 0;
            switch (num) {
                case 0:
                    g2.drawImage(tile[0].image, worldCol, worldRow, null);
                    worldCol += gp.tileSize*2;
                    break;
                case 1:
                    g2.drawImage(tile[1].image, worldCol, worldRow, null);
                    worldCol += gp.tileSize;
                    break;
            }

            if (worldCol == gp.screenCol) {
                worldCol = 0;
                switch (num) {
                    case 0: worldRow += gp.tileSize*2; break;
                    case 1: worldRow += gp.tileSize; break;
                }
            }
        }
    }
}
