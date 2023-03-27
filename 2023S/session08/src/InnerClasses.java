public interface ActionListener {
    public void actionPerformed(ActionEvent e);
}
public class InnerClasses {
    public static void main(String[]args) {
        JButton b = new JButton("ok");
        b.addActionListener(new MyLIstener());

        JButton b2 = new JButton("test2");
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {}
        System.out.println("test");
        }
        );
    }

}

class MyListener implements ActionListener {
    public void actionPErformed(ActionEvent e) {
        System.out.println("test");
    }
}