package GSTCalculator;

import java.util.List;

public class display_Items_Amount extends Items{

//  public void finalbill(){
//    System.out.println("Total Final Bill = "+(food+furn+elect));
//  }

    public void display (List Product) {

    System.out.println("Item name\t\tQuantity\tRate\t\tGST\t\tTotal Rate\t\tTotal GST\t\tTotal Amount");
    System.out.println("--------------------------------------------------------------------------------------------------");
    for (Object s:Product) { System.out.println(s); }
    System.out.println("---------------------------------");
    System.out.println("Bill: GST Slab  = "+tempg);
    System.out.println("Total Quantity  = "+tempq+"\nAmount\t\t\t= Rs "+temptr);
    System.out.println("Total GST\t\t= Rs "+temptg+"\nTotal Amount\t= Rs "+tempta);
     if (electAmount>100000) {
       System.out.println("Discount applicable =" + discount.TRONIXCOUNT.getdis() * 100 + "%");
       double disAmount = Discount(electAmount, discount.TRONIXCOUNT.getdis());
       System.out.println("Discounted Amount on " + electAmount + " = " + disAmount);
       double New_amount = New_Amount(electAmount, disAmount);
       System.out.println("New Amount = " + New_amount);
       double New_gst = Total_gst(New_amount, electgst);
       System.out.println("New GST Amount = " + New_gst);
       elect= Total_amount(New_amount, New_gst);
       System.out.println("Total After Discount = " +elect );
     }
      if (furnAmount>100000) {
        System.out.println("Discount applicable ="+discount.FURNCOUNT.getdis()*100+"%");
        double disAmount= Discount(furnAmount,discount.FURNCOUNT.getdis());
        System.out.println("Discounted Amount on "+furnAmount+" = "+disAmount);
        double New_amount= New_Amount(furnAmount,disAmount);
        System.out.println("New Amount = "+New_amount);
        double New_gst= Total_gst(New_amount,furngst);
        System.out.println("New GST Amount = "+New_gst);
        furn=Total_amount(New_amount,New_gst);
        System.out.println("Total After Discount = "+furn);
      }
      if (foodAmount>50000) {
        System.out.println("Discount applicable ="+discount.FOODCOUNT.getdis()*100+"%");
        double disAmount= Discount(foodAmount,discount.FOODCOUNT.getdis());
        System.out.println("Discounted Amount on "+foodAmount+" = "+disAmount);
        double New_amount= New_Amount(foodAmount,disAmount);
        System.out.println("New Amount = "+New_amount);
        double New_gst= Total_gst(New_amount,foodgst);
        System.out.println("New GST Amount = "+New_gst);
        food= Total_amount(New_amount,New_gst);
        System.out.println("Total After Discount = "+food);
      }


      tempg=temptr=temptg=tempta=0.0;
      tempq=0;

  }



}
