package processingWin;
import processing.core.*;

public class ProcessingWindow extends PApplet {// real name processingWin.ProcessingWindow
	public void settings() {
		size(800,800);
	}
	private int x,y;
	public void draw() {
		line(x,y,width/2,height/2);
		x++;
	}
	public static void main(String[]args) {
		 PApplet.main("processingWin.ProcessingWindow");
	}
}
