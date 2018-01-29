package edu.stevens.dkruger.gutil;
import java.util.*;
import java.awt.event.*;
/**
 * 
 * @author dkruger
 * Internationalized Action capable of being attached to menus and buttons whose language
 * change dynamically with the selected user language
 */
public class Action {
	private static HashMap<String, Action> actions;
	
	static {
		actions = new HashMap<>();
		
	}
	private String name; // internal name used for looking up display name
	ActionListener a;    // the listener to call if this action is activated
	public Action(String name, ActionListener a) {
		this.name = name; this.a = a;
		
	}
	public static void setLocale(String locale) {
		
	}
}
