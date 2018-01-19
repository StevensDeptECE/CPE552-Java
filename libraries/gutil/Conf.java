package edu.stevens.dkruger.gutil;

import java.util.HashMap;
import java.awt.Color;

public class Conf {
	private static class Entry {
		String name;
		String type;
		Object val;
		public Entry(String name, String type, Object val) {
			this.name = name;
			this.type = type;
			this.val = val;
		}
	}
	private static final String STRING = "String";
	private static final String INT = "int";
	private static final String LONG = "long";
	private static final String DOUBLE = "double";
	private static final String COLOR = "Color";
	private static final String MENU = "String[][]";
	private static final String STYLE = "style";

	HashMap<String, Entry> map;
	Conf() {
		map = new HashMap<>();
	}
	public void add(String name, String val) {
		map.put(name, new Entry(name, STRING, val));
	}
	public void add(String name, int val) {
		map.put(name, new Entry(name, INT, new Integer(val)));
	}
	public String getString(String name) {
		Entry e = map.get(name);
		if (e.type != STRING) {
			throw new RuntimeException("Expected String: " + name);
		}
		return (String)e.val;
	}
	public int getInt(String name) {
		Entry e = map.get(name);
		if (e.type != INT) {
			throw new RuntimeException("Expected int: " + name);
		}
		return (Integer)e.val;
	}
	public Color getColor(String name) {
		Entry e = map.get(name);
		if (e.type != COLOR) {
			throw new RuntimeException("Expected Color: " + name);
		}
		return (Color)e.val;
	}
	public String[][] getMenu(String name) {
		Entry e = map.get(name);
		if (e.type != MENU) {
			throw new RuntimeException("Expected Menu: " + name);
		}
		return (String[][])e.val;
	}
	public String defaulted(String name, String defaultVal) {
		Entry e = map.get(name);
		if (e == null || e.type != STRING) return defaultVal;
		return (String)e.val;
	}
	public int defaulted(String name, int defaultVal) {
		Entry e = map.get(name);
		if (e == null || e.type != INT) return defaultVal;
		return (Integer)e.val;
	}
	public double defaulted(String name, double defaultVal) {
		Entry e = map.get(name);
		if (e == null || e.type != DOUBLE) return defaultVal;
		return (Double)e.val;
	}
	public Color defaulted(String name, Color defaultVal) {
		Entry e = map.get(name);
		if (e == null || e.type != COLOR) return defaultVal;
		return (Color)e.val;
	}
	public String[][] defaulted(String name, String[][] defaultVal) {
		Entry e = map.get(name);
		if (e == null || e.type != MENU) return defaultVal;
		return (String[][])e.val;
	}
	public Style defaulted(String name, Style defaultVal) {
		Entry e = map.get(name);
		if (e == null || e.type != STYLE) return defaultVal;
		return (Style)e.val;
	}
}
