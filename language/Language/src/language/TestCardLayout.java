import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TestCardLayout {
    private MyPanel[] panels;
    private JComboBox choiceBox;
    private JPanel contentPane;

    public TestCardLayout() {
        JFrame frame = new JFrame("Card Layout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //TODO: JPanel contentPane = getContentPane();
        Container c = frame.getContentPane();
        contentPane = new JPanel();
        c.add(contentPane, BorderLayout.CENTER);
        contentPane.setBorder(
            BorderFactory.createEmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(new CardLayout());
        String[] choices = { "Panel 1", "Panel 2", "Panel 3" };

        panels = new MyPanel[3];
        panels[0] = new MyPanel(Color.RED.darker());
        panels[1] = new MyPanel(Color.GREEN.darker());
        panels[2] = new MyPanel(Color.BLUE.darker());
        choiceBox = new JComboBox(choices);
        choiceBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JComboBox cb = (JComboBox)e.getSource();
                int which = cb.getSelectedIndex();
                CardLayout cardLayout = (CardLayout) contentPane.getLayout();
                cardLayout.show(contentPane, choices[which]);
            }
        });
        
        for (int i = 0; i < panels.length; i++)
            contentPane.add(panels[i], choices[i]); 

        c.add(choiceBox, BorderLayout.PAGE_START);
        frame.pack();   
        frame.setLocationByPlatform(true);
        frame.setVisible(true);
    }

    public JComboBox getChoiceBox()
    {
        return choiceBox;
    }

    public static void main(String... args) {
        TestCardLayout t = new TestCardLayout();
    }
}

class MyPanel extends JPanel {
    public MyPanel(Color bg) {
        setBackground(bg);
        setOpaque(true);
    }

    @Override
    public Dimension getPreferredSize()
    {
        return (new Dimension(500, 500));
    }
}
