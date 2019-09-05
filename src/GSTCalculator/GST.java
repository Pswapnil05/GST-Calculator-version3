package GSTCalculator;
import java.lang.*;

/////---Main Class
public class GST {
  public static void main(String[] args) {

    FoodItems x = new FoodItems();
    x.food_display();

    FurnItems y = new FurnItems();
    y.furn_display();

    ElectronicsItems z =new ElectronicsItems();
    z.elect_display();



  }
}
