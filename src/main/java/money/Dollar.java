package money;

public class Dollar {
//  int amount = 5 * 2;
int amount;

  Dollar(int amount){
    this.amount = amount;
  }

  Dollar times(int multiplier){
    return new Dollar(amount * multiplier);
  }
}
