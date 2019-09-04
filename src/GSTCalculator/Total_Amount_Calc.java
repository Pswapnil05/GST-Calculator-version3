package GSTCalculator;

public class Total_Amount_Calc{



  public double Total_amount(double Total_Rate, double Total_GST) {
    return (Total_Rate+Total_GST);
  }

  public double Total_rate(int quantity, double rate) {
    return (quantity*rate);
  }

  public double Total_gst(double Total_Rate, double gst) {
    return (Total_Rate*gst);
  }

  public double Discount(double amount, double discount) {
    return amount*discount;
  }

  public double New_Amount(double amount, double disAmount) {
    return (amount-disAmount);
  }


}


