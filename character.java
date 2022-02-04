import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;

//Jack Anderson
//02/22

//MOST IF NOT ALL USER CONTROLS
public class character
{
   private boolean[] equipment;
   private ArrayList<String> items;
   private int health;
   private boolean[] keys;
   private int x;
   private int y;
   private boolean mouse;
   private int direction;
   
   public character()
   {
      boolean[] equipment = new boolean[8];
      keys = new boolean[5];
      health = 20;
      items = new ArrayList<String>();
      mouse = false;
   }
   
   public int getX()
   {
      return x;
   }
   public int getY()
   {
      return y;
   }
   
   public void updateHealth(int update)
   {
      health = health + update;
   }
   
   public boolean checkItems(String search)
   {
      if(items.contains(search))
      {
         return true;
      }
      else return false;
   }
   
   public void removeItem(String search)
   {
      for(int i = 0; i < items.size(); i++)
      {
         if(items.get(i).equals(search))
         {
            items.remove(i);
         }
      }
   }
   
   public void addItem(String search)
   {
      items.add(search);
   }
   
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
   
   //Add Direction of Walking 
   public void CharacterActions()
   {
      if(keys[0] == true) //UP
      {
         y = y - 5;
         direction = 0;
      }         
      if(keys[1] == true) //DOWN
      {
         y = y + 5;
         direction = 1;
      }
      if(keys[2] == true) //LEFT
      {
         x = x - 5;
         direction = 2;
      }
      if(keys[3] == true) //RIGHT
      {
         x = x + 5;
         direction = 3;
      }
      if(keys[4] == true) //MENU
      {
         //Opens Menu
      }
      if(mouse == true) //Attack
      {
         //Swing Sword
      }
   }
   
   //Needs Work: Mouse Listener
   public void mouseClicked(MouseEvent e)
   {
      System.out.println("mouse");
   }
   
   public void animate(int direction)
   {
     
      if(direction == 0) //UP
      {
      
      }
      if(direction == 1) //DOWN
      {
      
      }
      if(direction == 2) //LEFT
      {
      
      }
      if(direction == 3) //RIGHT
      {
         
      }
   }
   
   /*public void swingSword(int direction)
   {
      if(direction = 0)//UP
      {
         
      }
      
      if(direction = 1)//DOWN
      {
      
      }
      
      if(direction = 2)//LEFT
      {
      
      }
      
      if(direction = 3)//RIGHT
      {
      
      }
   }*/
}