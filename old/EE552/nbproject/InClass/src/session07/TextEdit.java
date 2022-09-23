package session07;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 * @author dkruger
 */
public class TextEdit extends JFrame {
    public TextEdit() {
       super("Text editor");
       setSize(1024,768);
       Container c = getContentPane();
       JTextArea t = new JTextArea();
       c.add(BorderLayout.CENTER, t);
       JMenu m = new JMenu("File");
       JMenuItem mi  = new JMenuItem("New");
       m.add(mi);
       JMenuBar mb = new JMenuBar();
       mb.add(m);
       setJMenuBar(mb);
//       mi.addActionListener( new MyListener()  );
//       mi.addActionListener( new MyListenerInternal()  );

// TextEdit$1
/*
mi.addActionListener(
               new ActionListener() {
                   public void actionPerformed(ActionEvent e) {
                        System.out.println("yoho");
                   }
               }
       );
*/
       mi.addActionListener((ActionEvent e) -> { System.out.println("yoho"); });
       setVisible(true);
    }
    public static void main(String[] args) {
//        new MyListenerInner(); // error
        new TextEdit();
    }
    class MyListenerInner implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            System.out.println("yoho"); 
        }
    }
    
    // name of this class is TextEdit.MyListenerInsideButNotInner
    static class MyListenerInsideButNotInner implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            System.out.println("yoho"); 
        }
    }

}

class MyListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
       System.out.println("yoho"); 
    }
}