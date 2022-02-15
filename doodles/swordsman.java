import java.io.File;
import java.awt.Image;
import javax.imageio.ImageIO;
public class swordsman extends enemy
{
   private int health;
   private int attack;
   private int x;
   private int y;
   private boolean isRanged;
   private String dropItem;
   private int speed;
   private Image icon;
   
   public swordsman(int inputx, int inputy, String inputdropItem, String ImageID) throws Exception
   {
      health = 10;
      attack = 5;
      x = inputx;
      y = inputy;
      isRanged = false;
      dropItem = inputdropItem;
      icon = ImageIO.read(new File(ImageID));
   }
}