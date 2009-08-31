package test;

//importing all our swing needs
import javax.swing.*;

//importing the KonamiCodeListener
import com.github.midday.kcl.KonamiCodeListener;

public class Test {
	public static void main(String[] args) {
		// Schedule a job for the event-dispatching thread:
		// creating and showing this application's GUI.
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createAndShowGUI();
			}
		});

	}

	static void createAndShowGUI() {
		// creating our test frame
		JFrame testframe = new JFrame();
		// setting a size
		testframe.setSize(400, 300);
		// moving it to the center of the screen
		testframe.setLocationRelativeTo(null);
		// setting a nice title
		testframe.setTitle("KonamiCodeListener Test");
		// make it close the process if we press the exit button
		testframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// make it focusable so the KeyListener reacts
		testframe.setFocusable(true);
		// add the KeyListener
		testframe.addKeyListener(new MyKCL());
		// make the frame visible
		testframe.setVisible(true);		
	}

}

class MyKCL extends KonamiCodeListener {
	// overwrites the original startSecret method
	public void startSecret(Object source) {
		JOptionPane.showMessageDialog(null, "Konami!", "Activated",1);		 
	}
}