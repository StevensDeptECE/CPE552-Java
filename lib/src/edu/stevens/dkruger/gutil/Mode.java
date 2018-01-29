package edu.stevens.dkruger.gutil;

public abstract class Mode {
	private History hist;
	public Mode(History h) { hist = h; }
	public abstract void doIt();
	public abstract void undo();
}
