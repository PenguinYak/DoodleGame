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

//WELCOME TO MY BRAIN
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


   public image moveUP()
   {
      y = y - 5;
      direction = 0;
      Image up = new image("userUp");
      return(up);
   }
   public image moveDown()
   {
      y = y + 5;
      direction = 1;
      Image down = new image("userDown");
      return(down);
   }
   public image moveLeft()
   {
      x = x - 5;
      direction = 2;
      Image left = new image("userLeft");
      return(left);
   }
   public image moveRight()
   {
      x = x + 5;
      direction = 3;
      Image right = new image("userRight");
      return(right);
   }
   
   
   
   public image animate(int direction)
   {
     if(direction = 0)
     {
         image animateUP = new image("animateUserUp");
         return(animateUP);
     }
     if(direction = 1)
     {
         image animateDOWN = new image("animateUserDown");
         return(animateDOWN);    
     }
     if(direction = 2)
     {
         image animateLEFT = new image("animateUserLeft");
         return(animateLEFT);    
     }
     if(direction = 3)
     {
         image animateRIGHT = new image("animateUserRight");
         return(animateRIGHT);
     }

   }
   
   public image animateSwing(int direction, int stage)
   {
         if(direction = 0)
         {
            if(stage = 0)
            {
               return("userUpSword1");
            }
            
            if(stage = 1)
            {
               return("userUpSword2");
            }
            if(stage = 2)
            {
               return("userUpSword3");
            }
         }
         if(direction = 1)
         {
            if(stage = 0)
            {
               return("userDownSword1");
            }
            
            if(stage = 1)
            {
               return("userDownSword2");
            }
            if(stage = 2)
            {
               return("userDownSword3");
            }
         }
         if(direction = 2)
         {
            if(stage = 0)
            {
               return("userLeftSword1");
            }
            
            if(stage = 1)
            {
               return("userLeftSword2");
            }
            if(stage = 2)
            {
               return("userLeftSword3");
            }
         }
         if(direction = 3)
         {
            if(stage = 0)
            {
               return("userRightSword1");
            }
            
            if(stage = 1)
            {
               return("userRightSword2");
            }
            if(stage = 2)
            {
               return("userRightSword3");
            }
         }
   }
   
   public boolean swingSword(ArrayList<enemy> enemies, int direction)
   {
      if(direction = 0)//UP
      {
         
         for(int i =0;i<enemies.size();i++)
         {
            //Y-COORDS ARE INCORRECT
            //Swing Stage 1 (Right)
            
            if(enemies.get[i].getX() < user.getX() + 48 && enemies.get[i].getX() > user.getX()+16)
            {
               if(enemies.get[i].getY() < user.getY() + 64 && enemies.get[i].getY() > user.getY())
               {
                  return true;
               }
            }
            //Swing Stage 2 (Center)
            if(enemies.get[i].getX() < user.getX() + 16 && enemies.get[i].getX() > user.getX()-16)
            {
               if(enemies.get[i].getY() > user.getY() && enemies.get[i].getY() < user.getY() +64)
               {
                  return true;
               }
            }
            //Swing Stage 3 (Left)
            if(enemies.get[i].getX() > user.getX() -48 && enemies.get[i].getX() < user.getX()-16)
            {
               if(enemies.get[i].getY() < user.getY() && enemies.get[i].getY() > user.getY())
               {
                  return true;
               }
            }

         }
         else
         {
            return false;
         }
                     
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
   }
}