public class GUI extends App {
	public static final String NEW = "NEW";
	public static final String OPEN = "OPEN";
	public static final String CREATE_SPHERE = "CREATE_SPHERE";
	
	private void buildCommands() {
		new Action(GUI.NEW) {
			public void doit(ActionEvent e) {
				
			}
			public void undo() {
			}
		};
		new Action(GUI.OPEN) {
			public void doit(ActionEvent e) {
				
			}
			public void undo() {
			}
		}
		new Action(GUI.CREATE_SPHERE) {
			public void doit(ActionEvent e) {
				
			}
			public void undo() {
				drawlist.removeLast();
			}
		}
	}
	public GUI() {
		super("stevenscad.conf");
		buildCommands();
		doLayout();
		setVisible(true);
	}
}
