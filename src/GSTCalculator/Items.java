package GSTCalculator;

public class Items extends Total_Amount_Calc {
  String item;
  int qty;
  double rate;
  double gst;
  double Total_Rate,Total_GST,Total_Amount;
  static int tempq=0;
  static double tempg,temptr,temptg,tempta=0.0;
  double electAmount,electgst,foodAmount,foodgst,furnAmount,furngst,elect,food,furn;

  public Items(String item, int qty, double rate, double gst) {
    this.item = item;
    tempq+=this.qty = qty;
    this.rate = rate;
    tempg=this.gst = gst;
    temptr+=this.Total_Rate= Total_rate(qty,rate);
    temptg+=this.Total_GST= Total_gst(Total_Rate,gst);
    tempta+=this.Total_Amount= Total_amount(Total_Rate,Total_GST);

  }



  public Items() {

  }

  @Override
  public String toString() {
  return (item+"\t\t"+qty+"\t\t\t"+rate+"\t\t"+gst+"\t\t"+Total_Rate+"\t\t\t"+Total_GST+"\t\t\t\t"+Total_Amount);
  }


}
