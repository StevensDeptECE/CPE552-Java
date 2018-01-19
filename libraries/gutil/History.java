package edu.stevens.dkruger.gutil;

import java.util.ArrayList;

public class History {
	ArrayList<Mode> hist;
	public History() {
		hist = new ArrayList<>();
	}
	public void add(Mode m) {
		hist.add(m);
	}
	public void undo() {}
	public void redo() {}
}
