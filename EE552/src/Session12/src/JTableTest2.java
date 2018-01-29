import java.awt.*;
import javax.swing.*;

/**
 *
 * @author dkruger
 */
public class JTableTest extends JFrame {
  String[] colNames = {"First", "Last", "HW1", "HW2", "HW3"};
  Object[][] data = {
    {"Dov", "Kruger", 10, 50, 90},
    {"Zach", "Binger", 90, 80, 50}
  };
  public JTableTest() {
    super("JTable test");
    Container c = getContentPane();
    JTable t = new JTable(data, colNames);
    c.add(t, BorderLayout.CENTER);
    setSize(700,500);
    setVisible(true);
  }
  public static void main(String[] args) {
    new JTableTest();
  }
  
}

