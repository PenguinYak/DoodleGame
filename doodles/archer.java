import java.io.File;
import java.awt.Image;
import javax.imageio.ImageIO;
public class archer extends enemy
{
   private int health;
   private int attack;
   private int x;
   private int y;
   private boolean isRanged;
   private String dropItem;
   private int speed;
   private Image icon;
   
   public archer(int inputx, int inputy, String inputdropItem, String ImageID) throws Exception
   {
      health = 5;
      attack = 5;
      x = inputx;
      y = inputy;
      isRanged = true;
      dropItem = inputdropItem;
      speed = 5;
      icon = ImageIO.read(new File(ImageID));
   }
}