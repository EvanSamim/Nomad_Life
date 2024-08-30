package main;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHandler implements KeyListener {

    // CONTROLS
    public boolean upPressed, downPressed, leftPressed, rightPressed, enterPressed, shiftPressed;

    // DEBUG
    public boolean debug = false;


    int code;
    GamePanel gp;
    public KeyHandler(GamePanel gp) {
        this.gp = gp;
    }
    @Override
    public void keyTyped(KeyEvent e) {}

    @Override
    public void keyPressed(KeyEvent e) {
        code = e.getKeyCode();

        if (code == KeyEvent.VK_W) upPressed = true;
        if (code == KeyEvent.VK_S) downPressed = true;
        if (code == KeyEvent.VK_A) leftPressed = true;
        if (code == KeyEvent.VK_D) rightPressed = true;
        if (code == KeyEvent.VK_ENTER) enterPressed = true;
        if (code == KeyEvent.VK_SHIFT) shiftPressed = true;

        if (code == KeyEvent.VK_L) System.exit(0);

        // DEBUG
        if (code == KeyEvent.VK_C) {
            if (!debug) debug = true;
            else if (debug) debug = false;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        code = e.getKeyCode();

        if (code == KeyEvent.VK_W) upPressed = false;
        if (code == KeyEvent.VK_S) downPressed = false;
        if (code == KeyEvent.VK_A) leftPressed = false;
        if (code == KeyEvent.VK_D) rightPressed = false;
        if (code == KeyEvent.VK_ENTER) enterPressed = false;
        if (code == KeyEvent.VK_SHIFT) shiftPressed = false;
    }
}
