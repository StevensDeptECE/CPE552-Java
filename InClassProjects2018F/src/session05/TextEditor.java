package session05;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author dkruger
 */
public class TextEditor extends JFrame  {
   public TextEditor() {
      super("Test Menus");
      setSize(800,600);
      Container c = getContentPane();
      c.setBackground(Color.BLUE);
      JTextArea t = new JTextArea();
      Font f = new Font("Helvetica", Font.BOLD, 24);
      t.setFont(f);
      //t.addCaretListener(listener);
      t.addKeyListener(new MyKeyListener());
      c.add(t, BorderLayout.CENTER);
      setVisible(true);
    }
   public void cut() {
       
   }
   public void paste() {
       
   }
    public static void main(String[] args) {
       new TextEditor(); 
    }
}

// HashMap<String, Command>
   abstract class Command {
       
   }
   class CompileCommand extends Command {
       public void doit() {
       
       }
   }


class MyKeyListener implements KeyListener {

    @Override
    public void keyTyped(KeyEvent e) {
        System.out.print(e.getKeyChar());
    }

    @Override
    public void keyPressed(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
    
}