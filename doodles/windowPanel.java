import java.util.Scanner;
import java.io.File;
import java.awt.Image;
import javax.imageio.ImageIO;
import java.util.ArrayList;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;

//CREATES THE BACKGROUND AND TELLS WHICH ENEMIES TO CREATE AND WHERE
public class windowPanel
{  
   private ArrayList<enemy> enemies;
   private String worldString;
   private Image worldBackground;
   public windowPanel(String worldCode) throws Exception
   {
   
      worldBackground = ImageIO.read(new File("screen1"));
   }
   
   public void processList()
   {
      //checks file for information on panels
      //Scanner sc = new Scanner(new File(worldString));
      //worldBackground = ImageIO.read(new file(sc.nextString()));
      
      for(int i = 0; i < 4; i++)
      {
         //enemies.add(sc.nextString());
      }
    }
    public Image getScreen(int world)
    {
      return worldBackground;
    }
    
    
      
           
   
}  