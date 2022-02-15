import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;
import java.awt.Image;
import javax.imageio.ImageIO;
import java.util.Scanner;
import java.io.File;
import java.lang.Math;

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
   private Image userIcon;
   private String iconString;
   
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
   
   public int getCentralX()
   {
      return x + 32;
   }
   
   public int getCentralY()
   {
      return y + 32;
   }
   
   
   
   
   //Add Direction of Walking 
   // public void CharacterActions()
//    {
//       if(keys[0] == true) //UP
//       {
//          y = y - 5;
//          direction = 0;
//       }         
//       if(keys[1] == true) //DOWN
//       {
//          y = y + 5;
//          direction = 1;
//       }
//       if(keys[2] == true) //LEFT
//       {
//          x = x - 5;
//          direction = 2;
//       }
//       if(keys[3] == true) //RIGHT
//       {
//          x = x + 5;
//          direction = 3;
//       }
//       if(keys[4] == true) //MENU
//       {
//          //Opens Menu
//       }
//       if(mouse == true) //Attack
//       {
//          //Swing Sword
//       }
//    }
   public void setDirection(boolean[] keys)
   {
      if(keys[0])
      {
         direction = 0;
      }
      if(keys[1])
      {
         direction = 1;
      }
      if(keys[2])
      {
         direction = 2;
      }
      if(keys[3])
      {
         direction = 3;      
      }
   }
   
   public int getDirection()
   {
      return direction;
   }  
   
   
   public Image animate(int direction) throws Exception
   {
     if(direction == 0)
     {
         Image animateUP = ImageIO.read(new File("animateUserUp"));
         return(animateUP);
     }
     if(direction == 1)
     {
         Image animateDOWN = ImageIO.read(new File("animateUserDown"));
         return(animateDOWN);    
     }
     if(direction == 2)
     {
         Image animateLEFT = ImageIO.read(new File("animateUserLeft"));
         return(animateLEFT);    
     }
     if(direction == 3)
     {
         Image animateRIGHT = ImageIO.read(new File("animateUserRight"));
         return(animateRIGHT);
     }
   return null;
   }
   
   public Image getIcon() throws Exception
   {
      return ImageIO.read(new File("dude.jpg"));
   }
   
   public Image animateSwing(int direction, int stage) throws Exception
   {
         if(direction == 0)
         {
            if(stage == 0)
            {
               return(ImageIO.read(new File("userUpSword1")));
            }
            
            if(stage == 1)
            {
               return(ImageIO.read(new File("userUpSword2")));
            }
            if(stage == 2)
            {
               return(ImageIO.read(new File("userUpSword3")));
            }
         }
         if(direction == 1)
         {
            if(stage == 0)
            {
               return(ImageIO.read(new File("userDownSword1")));
            }
            
            if(stage == 1)
            {
               return(ImageIO.read(new File("userDownSword2")));
            }
            if(stage == 2)
            {
               return(ImageIO.read(new File("userDownSword3")));
            }
         }
         if(direction == 2)
         {
            if(stage == 0)
            {
               return(ImageIO.read(new File("userLeftSword1")));
            }
            
            if(stage == 1)
            {
               return(ImageIO.read(new File("userLeftSword2")));
            }
            if(stage == 2)
            {
               return(ImageIO.read(new File("userLeftSword3")));
            }
         }
         if(direction == 3)
         {
            if(stage == 0)
            {
               return(ImageIO.read(new File("userRightSword1")));
            }
            
            if(stage == 1)
            {
               return(ImageIO.read(new File("userRightSword2")));
            }
            if(stage == 2)
            {
               return(ImageIO.read(new File("userRightSword3")));
            }
         }
      return null;
   }
   
   public boolean swingSword(character user, ArrayList<enemy> enemies, int direction)
   {
      //MARK
      if(direction == 0)//UP
      {
         for(int i = 0; i < enemies.size(); i++)
         {
            if(65 > Math.abs(enemies.get(i).getX() - user.getCentralX()))
            {
               
               if(user.getCentralY()-enemies.get(i).getY() > 0 && user.getCentralY() - enemies.get(i).getY() < 48)
               {
                  return true;
               }
            }
         }        
      }
      
      //NEXT DIRECTION
      if(direction == 1)//DOWN
      {
         for(int i = 0; i < enemies.size(); i++)
         {
            if(65 > Math.abs(enemies.get(i).getX() - user.getCentralX()))
            {
               if(user.getCentralY()-enemies.get(i).getY() > 0 && user.getCentralY() - enemies.get(i).getY() < 48)
               {
                  return true;
               }
            }
         }
      }
      
      //NEXT DIRECTION
      if(direction == 2)//LEFT
      {
         for(int i = 0; i < enemies.size(); i++)
         {
            if(65 > Math.abs(enemies.get(i).getY() - user.getCentralY()))
            {
               if(user.getCentralX()-enemies.get(i).getX() > 0 && user.getCentralX() - enemies.get(i).getX() < 48)
               {
                  return true;
               }
            }
         }
      }
      
      //NEXT DIRECTION
      if(direction == 3)//RIGHT
      {
         for(int i = 0; i < enemies.size(); i++)
         {
            if(65 > Math.abs(enemies.get(i).getY() - user.getCentralY()))
            {
               if(enemies.get(i).getX()-user.getCentralX() > 0  &&  enemies.get(i).getX()-user.getCentralX()< 48)
               {
                  return true;
               }
            }
         }
      }
      return false;
   }
}