package GSTCalculator;

import java.util.ArrayList;
import java.util.List;

public class ElectronicsItems extends display_Items_Amount {
  List electlist = new ArrayList();


  public void elect_display () {
    System.out.println("==================================================================================================");
    System.out.println("Total number of Electronics items = "+electlist.size());
    System.out.println("Electronics Items:");
    display(electlist);

    System.out.println("--------------------------------------------------------------------------------------------------");

  }
  {
    electlist.add(new Items("Smart Phone",2,15000,0.10));

    electlist.add(new Items("Laptop  ",1,40000,0.10));

    electlist.add(new Items("Grinder    ",1,7000,0.10));

    electlist.add(new Items("Tele Vision",1,60000,0.10));

    electAmount=temptr;
    electgst=tempg;
  }




}
