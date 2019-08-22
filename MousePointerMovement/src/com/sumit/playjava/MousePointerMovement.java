package com.sumit.playjava;

import java.awt.AWTException;
import java.awt.Robot;

public class MousePointerMovement {

	public static void main(String[] args) throws AWTException, InterruptedException {
		int x=100,y=400;
		boolean bool=true;
		Robot bot=new Robot();
		while(true) {
			bot.mouseMove(x, y);
			if(bool) {
				x+=5;y+=5;
			}else {
				x+=5;y-=5;
			}
			if(y==420)bool=false;
			else if(y==380)bool=true;
			if(x==1300)x=100;
			Thread.sleep(20);
		}
	}
}
