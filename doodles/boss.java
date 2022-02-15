import java.io.File;
import java.awt.Image;
import javax.imageio.ImageIO;

public class boss extends enemy
{
   private String ID;
   private int health;
   private int attack;
   private int x;
   private int y;
   private String dropItem;
   private Image icon;
   
   public boss(String name,int inputx,int inputy, String inputdropItem, String ImageID) throws Exception
   {
      ID = name;
      x = inputx;
      y = inputy;
      attack = 8;
      dropItem = inputdropItem;
      health = 50;
      icon = ImageIO.read(new File(ImageID));
      
      
   }
}  