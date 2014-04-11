package firstRepo;

import javax.swing.JFrame;

public class HelloworldGUI extends JFrame{
	HelloworldGUI(String title) { 
		this.setSize(500,500); 
		HelloWorld helWorld = new HelloWorld();
		String helloworld = helWorld.helloWorld;
		setTitle(helloworld);
	}

	public static void main(String[] args) {
		HelloworldGUI window = new HelloworldGUI("Hello CodeCall");
		window.setVisible(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	}
}
