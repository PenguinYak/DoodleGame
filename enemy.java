public class enemy extends gameControl
{
   private String name;
   private boolean isBoss;
   private int health;
   private int windowNum;
   private int attack;
   private int spawnx;
   private int spawny;
   private String dropItem;
   
   public enemy(String enemyname, boolean enemyisBoss, int enemyhealth,int enemywindowspawn, int enemyattack, String itemDrop, int enemyspawnx, int enemyspawny)
   {
      name = enemyname;
      isBoss = enemyisBoss;
      health = enemyhealth;
      attack = enemyattack;
      windowNum = enemywindowspawn;
      dropItem = itemDrop;
      spawnx = enemyspawnx;
      spawny = enemyspawny;
   }
   
   public static void main(String[] args)
   {
      enemy john = new enemy("john", true, 100, 1, 2, "stick", 50, 50);
   }
} 