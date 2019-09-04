package GSTCalculator;

public enum discount {

  FOODCOUNT, FURNCOUNT, TRONIXCOUNT;



    public double getdis() {
      switch (this) {
        case FOODCOUNT:
          return 0.1;
        case FURNCOUNT:
          return 0.2;
        case TRONIXCOUNT:
          return 0.3;
      }
      return 0;
    }



  }
