import javax.swing.JFrame; 
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Image;

//CONTROLS THE GAME: THIS IS THE PROGRAM TO RUN


public class setScreen extends JFrame
{
   public static int width = 1200;
   public static int height = 800;
   public setScreen()
   {    
      super("startGame");
      setSize(width, height);
      setBackground(Color.GREEN);
      gameControl tb = new gameControl(this);
		((Component)tb).setFocusable(true);

      getContentPane().add(tb);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
   }
   
   public static void main(String[] args) throws Exception
   {
      setScreen run = new setScreen();
   }
}