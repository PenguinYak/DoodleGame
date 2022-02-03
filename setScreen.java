import javax.swing.JFrame; 
import java.awt.Component;
import java.awt.Graphics;

public class setScreen extends JFrame
{
   public static int width = 1280;
   public static int height = 800;
   public setScreen()
   {

      
      super("startGame");
   

      
      gameControl start = new gameControl(this);
      ((Component)start).setFocusable(true);

      getContentPane().add( start );
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
   }
}