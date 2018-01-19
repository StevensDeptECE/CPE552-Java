package edu.stevens.dkruger.gutil;
import java.awt.*;
import javax.swing.*;

public class App extends JFrame {
	private static final long serialVersionUID = 1L;
	private Conf conf;
	private Prefs prefs;
	private boolean dirty;
	
	public App(Conf conf, String title, int w, int h, Color bg, String[][] menus) {
		super(title);
		this.conf = conf;
		prefs = new Prefs(conf);
		setSize(w,h);
		Container c = getContentPane();
		c.setBackground(bg);
		buildMenu(menus);
		setVisible(true);
	}
	public App(String title, int w, int h, Color bg, String[][] menus) {
		this(new Conf(), title, w, h, bg, menus);
	}
	public App(Conf conf) {
		this(conf, conf.getString("title"), conf.getInt("w"), conf.getInt("h"), conf.getColor("bg"), conf.getMenu("mainmenu"));
	}
	
	private void buildMenu(String[][] menus) {
		JMenuBar mb = new JMenuBar();
		for (int i = 0; i < menus.length; i++) {
			JMenu m = new JMenu(menus[i][0]);
			prefs.getMenuStyle().set(m);
			mb.add(m);
			for (int j = 1; j < menus[i].length; j++) {
				JMenuItem mi = new JMenuItem(menus[i][j]);
				prefs.getMenuStyle().set(mi);
				m.add(mi);
			}
		}
		setJMenuBar(mb);
	}
	private void buildToolBar() {
		JPanel toolbar = new JPanel();
		toolbar.setBackground(conf.getColor("toolbarbg"));
	}
	public void setDirty() {
		dirty = true;
	}
}
