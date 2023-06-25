public class RewardValue {
   private final double cashValue;
   private final int milesValue;
   public static final double  MILES_TO_CASH_CONVERSION_RATE = 0.0035;

   //Constructor for cash value,converts cash to miles
   public RewardValue(double cashValue){
      this.cashValue=cashValue;
      this.milesValue=(int)(cashValue/MILES_TO_CASH_CONVERSION_RATE);
   }
   //Constructor for miles value,converts miles to cash
   public RewardValue(int milesValue) {
      this.milesValue=milesValue;
      this.cashValue=milesValue*MILES_TO_CASH_CONVERSION_RATE;
   }

   public  double getCashValue(){
      return this.cashValue;
}

public int getMilesValue(){
      return this.milesValue;
}
}
