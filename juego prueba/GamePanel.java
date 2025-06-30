import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GamePanel extends JPanel implements ActionListener, KeyListener {

    private final int WIDTH = 800, HEIGHT = 600;
    private final int PLAYER_WIDTH = 40, PLAYER_HEIGHT = 40;
    private int playerX = 100, playerY = 300;
    private int playerVelX = 0;
    private double playerVelY = 0;
    private boolean jumping = false;
    private final double gravity = 0.5;
    private final int groundLevel = 500;

    private Timer timer;

    public GamePanel() {
        this.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        this.setBackground(Color.BLACK);
        this.setFocusable(true);
        this.addKeyListener(this);

        timer = new Timer(16, this); // ~60 FPS
        timer.start();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Fondo
        g.setColor(Color.CYAN);
        g.fillRect(0, 0, WIDTH, HEIGHT);

        // Suelo
        g.setColor(Color.GREEN.darker());
        g.fillRect(0, groundLevel, WIDTH, HEIGHT - groundLevel);

        // Jugador
        g.setColor(Color.RED);
        g.fillRect(playerX, playerY, PLAYER_WIDTH, PLAYER_HEIGHT);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Movimiento horizontal
        playerX += playerVelX;

        // Movimiento vertical con gravedad
        playerVelY += gravity;
        playerY += (int) playerVelY;

        // Colisión con el suelo
        if (playerY + PLAYER_HEIGHT >= groundLevel) {
            playerY = groundLevel - PLAYER_HEIGHT;
            playerVelY = 0;
            jumping = false;
        }

        repaint();
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT) playerVelX = -5;
        if (key == KeyEvent.VK_RIGHT) playerVelX = 5;
        if (key == KeyEvent.VK_SPACE && !jumping) {
            playerVelY = -10; // impulso hacia arriba
            jumping = true;
        }
    }

    @Override public void keyReleased(KeyEvent e) {
        int key = e.getKeyCode();
        if (key == KeyEvent.VK_LEFT || key == KeyEvent.VK_RIGHT) playerVelX = 0;
    }

    @Override public void keyTyped(KeyEvent e) {}
}
