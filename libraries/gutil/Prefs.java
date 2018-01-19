package edu.stevens.dkruger.gutil;

import java.io.*;
import java.awt.*;
import javax.swing.*;
import java.util.*;

public class Prefs {
	private HashMap<String, Properties > locales;
	private Properties messages;
	private HashMap<String, Icon> icons;
	private String language;
	
	private Style def;
	private Style big;
	private Style normal;
	private Style small;
	private Style menu;
	private Style controls;
	private String toolbarLocation;
	
	private void loadLocale(String lang) {
		Properties p = new Properties();
		FileReader fr = null;
		try {
			fr = new FileReader("conf/" + lang);
			p.load(fr);
		} catch(Exception e) {
			System.out.println("file reader");
		} finally {
			if (fr != null)
				try {
					fr.close();
				} catch(IOException e) {
					System.out.println("failed to close");
				}
		}
	}
	public Prefs(Conf conf) {
		def = new Style("Arial", 12, Font.PLAIN, Color.GRAY, Color.WHITE);
		def = conf.defaulted("def", def);
		big = conf.defaulted("big", def.bigBold(24));
		normal = small = menu = controls = def;
		language = conf.defaulted("lang", "en");
		locales = new HashMap<>();
		loadLocale(language);
		messages = locales.get(language);
		toolbarLocation = BorderLayout.WEST;
	}
	public Style getMenuStyle() { return menu; }
	
}
