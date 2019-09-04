package GSTCalculator;

import java.util.ArrayList;
import java.util.List;

public class FurnItems extends display_Items_Amount {
      List furnlist = new ArrayList ();

      public void furn_display () {
        System.out.println("==================================================================================================");
        System.out.println("Total number of Furniture items = "+furnlist.size());
        System.out.println("Furniture Items:");
        display(furnlist);
        System.out.println("--------------------------------------------------------------------------------------------------");

      }

      {
        Items pepperfry2 = new Items("Chair    ",5,1500,0.05);
        furnlist.add(pepperfry2);
        Items pepperfry3 = new Items("Cupboard",3,7500,0.05);
        furnlist.add(pepperfry3);
        Items pepperfry4 = new Items("Closet  ",3,9000,0.05);
        furnlist.add(pepperfry4);
        Items pepperfry5 = new Items("Sofa    ",2,20000,0.05);
        furnlist.add(pepperfry5);
        Items pepperfry6 = new Items("Bed      ",3,15000,0.05);
        furnlist.add(pepperfry6);

        furnAmount=temptr;
        furngst=tempg;
      }

}
