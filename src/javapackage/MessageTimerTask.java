package javapackage;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class MessageTimerTask extends TimerTask {

	@Override
	public void run() {
		//for(int i=0 ;i<1_000;i++)
		System.out.println( " schedule : " + new Date());
	}
	
	public void messageTimer(){
		
		Timer timer =new Timer();
		timer.schedule(this, 5000, 10*10);
		
		try{
			Thread.sleep(1);
		}catch (InterruptedException e) {
		}
		
	}
	

}
