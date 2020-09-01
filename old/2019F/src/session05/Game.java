package session05;

import com.sun.java.accessibility.util.AWTEventMonitor;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author dkruger
 */
public class Game extends JFrame {
    private void buildMenus() {
        JMenuBar mb = new JMenuBar();
        JMenu m = new JMenu("File");
        JMenuItem mi = new JMenuItem("New");
        m.add(mi);
        mi.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        System.out.println("Hello");
                    }        
        });
        mi = new JMenuItem("Quit");
        mi.addActionListener(
                new ActionListener() {  // Game$1
                    public void actionPerformed(ActionEvent e) {
                        System.exit(0);
                    }
                }
        );
        m.add(mi);
        mb.add(m);
        setJMenuBar(mb);
    }
    public Game() {
        super("Chess");
        setSize(800,800);
        buildMenus();
        GameBoard b = new GameBoard();
        b.setBackground(Color.red);
        Container c = getContentPane();
        c.add(BorderLayout.CENTER, b);
        setVisible(true);
    }
    
    
    
    
    public static void main(String[] args) {
       Game g = new Game(); 
    }
}

class GameBoard extends JPanel {
    private int board[][];
    public GameBoard() {
        board = new int[8][8];
        board[0][0] = 1;
        board[0][1] = 2;
        MoveListener m = new MoveListener();
        addMouseListener(m);
        addMouseMotionListener(m);
    }
    public void paint(Graphics g) {
        super.paint(g);
        g.drawLine(0, 0, 300, 300);
        for (int i = 0; i < 8; i++)
            for (int j = 0; j < 8; j++)
                if (board[i][j] != 0) {
                  g.setColor(board[i][j] == 1 ? Color.BLACK : Color.WHITE);
                  g.fillOval(i*100, j*100, 50, 50);
                }
    }
    
    private class MoveListener implements MouseListener, MouseMotionListener {
        private int lastX, lastY;
        @Override
        public void mousePressed(MouseEvent e) {
            Graphics g = getGraphics(); //GameBoard.this.getGraphics()
            g.setXORMode(Color.WHITE);
//GRID SNAP            int x = e.getX() / 100 * 100;
            g.drawOval(e.getX(), e.getY(), 50,50);
            lastX = e.getX(); lastY = e.getY();
        }
        @Override
        public void mouseDragged(MouseEvent e) {
            Graphics g = getGraphics();
            g.setXORMode(Color.WHITE);
            g.drawOval(lastX, lastY, 50,50);
            
            g.drawOval(e.getX(), e.getY(), 50,50);
            lastX = e.getX(); lastY = e.getY();
        }
        @Override
        public void mouseReleased(MouseEvent me) {
        }
        @Override
        public void mouseEntered(MouseEvent me) {
        }
        @Override
        public void mouseExited(MouseEvent me) {
        }
        @Override
        public void mouseMoved(MouseEvent me) {
        }
        @Override
        public void mouseClicked(MouseEvent me) {
        }
      
    }

}




