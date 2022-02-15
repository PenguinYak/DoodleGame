import javax.swing.JFrame; 
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;
import java.util.ArrayList;
import java.awt.Color;
import java.awt.Image;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import javax.imageio.ImageIO;
import java.io.File;


//EDITORS: SOME OF THESE FUNCTIONS PROBABLY AREN'T PERFECT, I WAS GOING FOR CONCEPTUALLY.
//-JACK

//SETS THE GAME MECHANISMS
public class gameControl extends JPanel //implements actionListener
{

   //Class Values
   private character user;
   private boolean[] keys;
   private Image world;
   //create list of enemies 
   public ArrayList<enemy> enemies;
   
   //MARK
   public gameControl(JPanel par) throws Exception
   {
      character user = new character();
      //enemies = new ArrayList<enemy>(getEnemies());
      
      boolean[] keys = new boolean[5];

		setVisible(true);
      setBackground(Color.GREEN);
      world = ImageIO.read(new File("screen1.png"));
      
   }
    /*
    public static JPanel drawGamePanel(){
    //Create game panel and attributes
    JPanel gamePanel = new JPanel();
    Image background = ImageIO.read(new File("screen1.png"));//Toolkit.getDefaultToolkit().createImage("Background.png");
    gamePanel.drawImage(background, 0, 0, null);
    //Set Return
    return gamePanel;
    }
    */
   
   //READS WHEN KEYS ARE PRESSED
   public void keyPressed(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_W)
		{
			keys[0] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_S)
		{
			keys[1] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_A)
		{
			keys[2] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_D)
		{
			keys[3] = true;
		}
      if (e.getKeyCode() == KeyEvent.VK_E)
      {
         keys[4] = true;
      }
   } 
   //READS WHEN KEYS RELEASED
   public void keyReleased(KeyEvent e)
   {
      if(e.getKeyCode() == KeyEvent.VK_W)
      {
         keys[0] = false;
      }
      if(e.getKeyCode() == KeyEvent.VK_S)
      {
         keys[1] = false;
      }
      if(e.getKeyCode() == KeyEvent.VK_A)
      {
         keys[2] = false;
         }
      if(e.getKeyCode() == KeyEvent.VK_D)
      {
         keys[3] = false;
      }
      if(e.getKeyCode() == KeyEvent.VK_A)
      {
         keys[4] = false;
      }
   }
   
//    //Needs Work: Mouse Listener
//    public void mouseClicked(MouseEvent e)
//    {
//       System.out.println("mouse");
//    }
   
   
   //MARK
   public void update(Graphics window)
   {
      paint(window);
   }
   
   public void paint(Graphics window, character user, Image worldView) throws Exception
   {
      Image world = ImageIO.read(new File("screen1.png"));
      Image icon = ImageIO.read(new File("dude.png"));
      window.drawImage(world, 0,0,null);
      window.drawImage(icon, 128, 512, null);
      //Graphics2D screen = worldView.createGraphics();
      
      /*for(int i = 0; i < enemies.size(); i++)
      {
         window.drawImage(enemies.get(i).getIcon());
      }*/
   }
   
   public void run()
   {
   	try
   	{
   		while(true)
   		{
   		   Thread.currentThread().sleep(5);
            repaint();
         }
      }catch(Exception e)
      {
      }
  	}

}