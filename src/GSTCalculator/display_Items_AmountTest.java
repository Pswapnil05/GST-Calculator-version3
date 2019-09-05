package GSTCalculator;


import static org.junit.Assert.*;

public class display_Items_AmountTest {

  FoodItems x = new FoodItems();


  FurnItems y = new FurnItems();


  ElectronicsItems z =new ElectronicsItems();


  @org.junit.Test
  public void display() {
    x.food_display();
    y.furn_display();
    z.elect_display();
  }
}