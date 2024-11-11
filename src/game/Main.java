package src.game;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;

public class Main extends JFrame {
    public Main() {
        // Définition des propriétés de la fenêtre
        setTitle("Dofus Like");
        setSize(800, 600); // largeur et hauteur de la fenêtre
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // centre la fenêtre sur l'écran

        // Ajouter le panneau de jeu
        GamePanel panel = new GamePanel();
        add(panel);

        setVisible(true);
    }

    public static void main(String[] args) {
        new Main();
    }
}

