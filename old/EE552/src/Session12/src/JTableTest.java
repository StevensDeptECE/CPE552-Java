import java.awt.*;
import javax.swing.*;
import java.util.*;
import javax.swing.table.*;

/**
 *
 * @author dkruger
 */
public class JTableTest2 extends JFrame {
  GradeModel grades;
  public JTableTest2() {
    super("JTable test");
    Container c = getContentPane();
    JTable t = new JTable(grades = new GradeModel());
    c.add(new JScrollPane(t), BorderLayout.CENTER);
    setSize(700,500);
    
    setVisible(true);
  }
  public static void main(String[] args) {
    new JTableTest2();
  }
  
}

class GradeModel extends AbstractTableModel {
    private ArrayList<String> columns;
    private ArrayList< ArrayList<Object> > gradeinfo;
    GradeModel() {
      columns = new ArrayList<>();
      columns.add("First");
      columns.add("Last");
      columns.add("HW1");
      columns.add("HW2");
      columns.add("HW3");

    }
    public int getColumnCount() { return columns.size(); }
    public int getRowCount() { return gradeinfo.size();}
    public Object getValueAt(int row, int col) {
      return new Integer(row*col);
    }
}



