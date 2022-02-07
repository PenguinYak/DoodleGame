import javax.swing.JFrame; 
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Color;

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
      gameControl start = new gameControl(this);
      ((Component)start).setFocusable(true);

      getContentPane().add( start );
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
   }
}