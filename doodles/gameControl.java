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
import javax.swing.JLabel;
import java.util.Arrays;


//EDITORS: SOME OF THESE FUNCTIONS PROBABLY AREN'T PERFECT, I WAS GOING FOR CONCEPTUALLY.
//-JACK

//SETS THE GAME MECHANISMS
public class gameControl extends JPanel //implements actionListener
{

   //Class Values
   private character user;
   private boolean[] keys;
   private Image world;
   private Image jeff;
   private int x;
   private int y;
   //create list of enemies 
   public ArrayList<enemy> enemies;
   
   //MARK
   public gameControl(JFrame par) throws Exception
   {
      boolean[] keys = new boolean[4];
      System.out.println(Arrays.toString(keys));
      character user = new character();
      //enemies = new ArrayList<enemy>(getEnemies());
      


		setVisible(true);
      //setBackground(Color.GREEN);
      world = ImageIO.read(new File("screen1.png"));
      jeff = ImageIO.read(new File("dude.jpg"));
      x = 100;
      y = 100;
   }
   public void keyTyped(KeyEvent e)
	{

	}

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
      //if (e.getKeyCode() == KeyEvent.VK_E)
      //{
        // keys[4] = true;
      //}
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
      //if(e.getKeyCode() == KeyEvent.VK_E)
      //{
        // keys[4] = false;
      //}
   }
 
   
      
   //MARK
   public void update(Graphics g)
   {
      paint(g);
   }
   
   public void checkMovement()
   {
      System.out.println(keys);
      if(keys[0] == true)
      {
         y = y+10;
      }
      if(keys[1] == true)
      {
         y = y-10;
      }
      if(keys[2] == true)
      {
         x = x+10;
      }
      if(keys[3] == true)
      {
         x= x-10;
      }
   }
   
    public void paint(Graphics g)
    {
      
      //x = user.getCentralX();
      //y = user.getCentralY();
      g.drawImage(world, 0, 0, 1200, 800, null);
      g.drawImage(jeff, x , y, 64, 64, null);
      System.out.println("inside paint" + Arrays.toString(keys));
      checkMovement();
      System.out.println("printed");
      //checkMovement();
      /*for(int i = 0; i < enemies.size(); i++)
      {
         window.drawImage(enemies.get(i).getIcon(), enemies.get(i).getX(), enemies.get(i).getY(), this);
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

//RECYCLE CAN
  
//    //Needs Work: Mouse Listener
//    public void mouseClicked(MouseEvent e)
//    {
//       System.out.println("mouse");
//    }

    // public void drawScreen(Graphics g, Image worldBackground) throws Exception
//     {
//       g.drawImage(ImageIO.read(new File("screen1.png")), 0, 0, this);
//     }
//    
//    public void paintComponent(Graphics g)
//    {
//       g.drawImage(world, 0, 0, 1200, 800, this);
//       g.drawImage(jeff, x , y, 64, 64, this);
//       //g.setColor(Color.WHITE);
//       //g.fillRect(200, 200, 200, 200);
//    }  