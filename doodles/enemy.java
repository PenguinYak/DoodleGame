import java.awt.Image;
import javax.imageio.ImageIO;
import java.io.File;

//CREATES THE DIFFERENT ENEMIES
public class enemy
{
   private String name;
   private int health;
   private int attack;
   private int x;
   private int y;
   private boolean isRanged;
   private String dropItem;
   private int speed;
   
//    public archer(int spawnX, int spawnY, String dropItem)
//    {  
//       x = spawnX;
//       y = spawnY;
//       isRanged = true;
//       health = 5;
//       dropItem = dropItem;
//    }
   
   // public boss(int spawnX, int spawnY, String dropItem)
//    {
//       x = spawnX;
//       y = spawnY;
//       isRanged = false;
//       health = 25;
//       dropItem = dropItem;
//    }
   public int getCentralX()
   {
      return x + 32;
   }
   
   public int getCentralY()
   {
      return y + 32;
   }
   
   public int getX()
   {
      return x;
   }
   
   public int getY()
   {
      return y;
   }
      
   //checks in a box for the target
   public boolean findUser(enemy enemy, character user,int range)
   {
      //X Parameter
      if (user.getCentralX() >= enemy.getCentralX() - 256 && user.getCentralX() <= enemy.getCentralX() + 256)
      {
         //Y Parameter
         if (user.getCentralY() >= enemy.getCentralY() - 256 && user.getCentralY() <= enemy.getCentralY() +256)
         {
            return true;
         }
      }
      return false;
   }
   
} 