package GSTCalculator;

import java.util.ArrayList;
import java.util.List;

public class FoodItems extends display_Items_Amount {
    List foodlist = new ArrayList();
       public void food_display () {
       System.out.println("==================================================================================================");
       System.out.println("Total number of Food items = "+foodlist.size());
       System.out.println("Food Items:");
       display(foodlist);
       System.out.println("--------------------------------------------------------------------------------------------------");
    }
    {

      foodlist.add(new Items("KitKat   ", 4, 1000, 0.0));

      foodlist.add(new Items("Lollipop",5,1100,0.0));

      foodlist.add(new Items("Marshmallow",6,1200,0.0));

      foodlist.add(new Items("Nougat  ",7,1300,0.0));

      foodlist.add(new Items("Oreo    ",8,1400,0.0));

      foodlist.add(new Items("Pie      ",9,1500,0.0));

      foodAmount=temptr;
      foodgst=tempg;
    }



}
