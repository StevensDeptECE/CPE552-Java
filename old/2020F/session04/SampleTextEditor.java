import java.awt.*;
import javax.swing.*;

public class SampleTextEditor extends JFrame  {
    private JTextArea text;
    public SampleTextEditor() {
        super("Text Editor");
        Container c = getContentPane();
        text = new JTextArea();
        c.add(text, BorderLayout.CENTER);
        setSize(1000,700);
    }
    public static void main(String[] args) {
        new SampleTextEditor();
    }
    
}
