package com.github.midday.kcl;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KonamiCodeListener extends KeyAdapter {

	final static int[] BUTTONLIST = { KeyEvent.VK_UP, KeyEvent.VK_UP,
			KeyEvent.VK_DOWN, KeyEvent.VK_DOWN, KeyEvent.VK_LEFT,
			KeyEvent.VK_RIGHT, KeyEvent.VK_LEFT, KeyEvent.VK_RIGHT,
			KeyEvent.VK_B, KeyEvent.VK_A };
	int count = 0;

	public void keyPressed(KeyEvent evt) {
		// Check for the KonamiSequece
		if (evt.getKeyCode() == BUTTONLIST[count]) {			
			// if the code checks out startSecret(evt.getSource())
			if (++count > 9) {
				startSecret(evt.getSource());
				//reset counter
				count =0;
			}
		} else {
			count = 0;
		}
		



	}

	public void startSecret(Object source) {
		// Overwrite this method
		System.out.println("KonamiCode entered correctly");
	}
}
