package src.game;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

class GamePanel extends JPanel {
    public GamePanel() {
        setBackground(Color.BLACK); // Fond noir pour le jeu
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Dessiner un simple rectangle pour représenter un personnage ou un objet
        g.setColor(Color.RED);
        g.fillRect(50, 50, 50, 50); // un carré rouge (position x, y, largeur, hauteur)
    }
}