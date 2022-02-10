import javax.swing.JFrame; 
import java.awt.Component;
import java.awt.Graphics;
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


//EDITORS: SOME OF THESE FUNCTIONS PROBABLY AREN'T PERFECT, I WAS GOING FOR CONCEPTUALLY.
//-JACK

//SETS THE GAME MECHANISMS
public class gameControl implements KeyListener, MouseListener, Runnable
{

   //Class Values
   private character user;
   private boolean[] keys;
   //create list of enemies 
   public ArrayList<enemy> enemies;
   
   //MARK
   public gameControl(JFrame par)
   {
      character user = new character();
      enemies = new ArrayList<enemy>(getEnemies());
      
      boolean[] keys = new boolean[5];
      
      
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
   
   //Needs Work: Mouse Listener
   public void mouseClicked(MouseEvent e)
   {
      System.out.println("mouse");
   }
   
   
   //MARK
   public void update(Graphics window)
   {
      paint(window);
   }
   
   public void paint(Graphics window, character user)
   {
      //window.drawImage(windowPanel.getImage(), 0,0,1200, 800);
      window.drawImage(user.getIcon(),user.getX(),user.getY(), 64, 64,Color.BLACK, observer);
      /*for(int i = 0; i < enemies.size(); i++)
      {
         window.drawImage(enemies.get(i).getIcon());
      }*/
   }
}