package data;

import java.util.Scanner;

import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import static org.lwjgl.opengl.GL11.*;

public class BOOT {
	public int hght, len;
	public Scanner scan;
	public BOOT()
	{
		System.out.println("enter height:");
		scan = new Scanner(System.in);
		hght = scan.nextInt();
		System.out.println("enter weight:");
		len = scan.nextInt();
		Display.setTitle("TOWER DEFENSE");
		try {
			Display.setDisplayMode(new DisplayMode(hght,len));
			Display.create();
		} catch (LWJGLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		glMatrixMode(GL_PROJECTION);
		glLoadIdentity();
		glOrtho(0,hght,len,0,1,-1);
		glMatrixMode(GL_MODELVIEW);
		
		
		while(!Display.isCloseRequested())
		{
			Display.update();
			Display.sync(60);
			
		}
		Display.destroy();
	}
	public static void main(String [] args)
	{
	new BOOT();
	}

}
// abccccccc
