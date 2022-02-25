import javax.swing.JFrame; 
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JPanel;

public class setScreen extends JFrame
{
	public static int WIDTH = 1200;
	public static int HEIGHT = 800;

	public setScreen() throws Exception
	{
      super( "setScreen" );
      //JPanel window = new JPanel();
      
		setSize(WIDTH, HEIGHT);
		//setBackground(Color.BLACK);
		gameControl tb = new gameControl(this);
		((Component)tb).setFocusable(true);
      getContentPane().add( tb );
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main( String args[] ) throws Exception
	{
		setScreen run = new setScreen();
	}
}