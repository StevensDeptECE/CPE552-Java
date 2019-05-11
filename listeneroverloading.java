public class listeneroverloading {
	public static void main(String[] args) {
		ActionListener a = new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					//doit
				}
			};
		b.addActionListener(a);

		JButton b = new JButton("ok");
		b.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					//doit
					JButton b = (JButton)e.getSource();
					
				}
			});
		b.addActionListener(new MyListener());
		b.addActionListener(new MyListener2());
	}

	private class MyListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			//doit
		}
	}
}


class MyListener2 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			//doit
		}
	}
