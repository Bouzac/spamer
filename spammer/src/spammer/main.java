package spammer;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class main {

	public static void main(String[] args) throws NumberFormatException, AWTException {
		new Frame();
		
	}
	
	public static void everyoneSpam(int times) throws AWTException{
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Robot r = new Robot();
		
		
		
		
					//Thread.sleeveryoneep(2000);
				//} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					//e.printStackTrace();
				//}
				
			//}
		
		int j = 0;
		for(int i = 0; i < times; i++) {
			
			
			//r.keyPress(KeyEvent.VK_SHIFT);
			//r.keyPress(KeyEvent.VK_2);
			//r.keyRelease(KeyEvent.VK_SHIFT);
			//r.keyPress(KeyEvent.VK_E);
			//r.keyPress(KeyEvent.VK_V);
			r.keyPress(KeyEvent.VK_E);
			//r.keyPress(KeyEvent.VK_R);
			//r.keyPress(KeyEvent.VK_Y);
			//r.keyPress(KeyEvent.VK_Y);
			//r.keyPress(KeyEvent.VK_O);
			//r.keyPress(KeyEvent.VK_N);
			//r.keyPress(KeyEvent.VK_E);
			r.keyPress(10);
			j++;
			try {
				Thread.sleep(600);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
		
		
	}


