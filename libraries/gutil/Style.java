package edu.stevens.dkruger.gutil;
import java.awt.*;

import javax.swing.JComponent;

public class Style {
	private Font f;
	private Color bg;
	private Color fg;
	public Style(String family, int size, int style, Color bg, Color fg) {
		f = new Font(family, style, size);
		this.bg = bg;
		this.fg = fg;
	}
	public Font getFont() { return f; }
	public Color getBG() { return bg; }
	public Color getFG() { return fg; }
	public void set(JComponent c) {
		c.setFont(f);
		c.setBackground(bg);
		c.setForeground(fg);
	}
	public Style bigBold(int size) {
		return new Style(f.getFamily(), f.getSize(), Font.BOLD, bg, fg);
	}
	public Style big(int size) {
		return new Style(f.getFamily(), f.getSize(), f.getStyle(), bg, fg);
	}
}
