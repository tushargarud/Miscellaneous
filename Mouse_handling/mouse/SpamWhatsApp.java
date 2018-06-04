package mouse;

import java.awt.Robot;
import java.awt.event.InputEvent;
import java.util.Timer;
import java.util.TimerTask;

public class SpamWhatsApp {

	public static void main(String[] args) {
		try
		{
			Timer timer = new Timer();
			Robot bot = new Robot();
			Thread.sleep(2000);
			bot.mouseMove(985,1000);   
			bot.mousePress(InputEvent.BUTTON3_DOWN_MASK);
			bot.mouseRelease(InputEvent.BUTTON3_DOWN_MASK);
			bot.mouseMove(1043,902);
			Thread.sleep(200);
			bot.mousePress(InputEvent.BUTTON1_MASK);
			Thread.sleep(200);
			bot.mouseRelease(InputEvent.BUTTON1_MASK);
			Thread.sleep(2000);
			bot.mouseMove(1892,1001);
			bot.mousePress(InputEvent.BUTTON1_MASK);
			bot.mouseRelease(InputEvent.BUTTON1_MASK);

			//		System.out.println(MouseInfo.getPointerInfo().getLocation().x);
			//		System.out.println(MouseInfo.getPointerInfo().getLocation().y);

			TimerTask timerTask = new TimerTask()
			{
				@Override
				public void run() 
				{
					try 
					{		
						bot.mouseMove(985,1000);   
						bot.mousePress(InputEvent.BUTTON3_DOWN_MASK);
						bot.mouseRelease(InputEvent.BUTTON3_DOWN_MASK);
						bot.mouseMove(1043,902);
						Thread.sleep(200);
						bot.mousePress(InputEvent.BUTTON1_MASK);
						Thread.sleep(200);
						bot.mouseRelease(InputEvent.BUTTON1_MASK);
						Thread.sleep(2000);
						bot.mouseMove(1892,1001);
						bot.mousePress(InputEvent.BUTTON1_MASK);
						bot.mouseRelease(InputEvent.BUTTON1_MASK);
						Thread.sleep(2000);
					}
					catch(Exception ex)
					{
						ex.printStackTrace();
					}

				}
			};

			timer.scheduleAtFixedRate(timerTask, 4*1000, 4*1000);

		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
}