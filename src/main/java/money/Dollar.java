package money;

public class Dollar {
//  int amount = 5 * 2;
int amount;

  Dollar(int amount){
    this.amount = amount;
  }

  void times(int multiplier){
    amount *= multiplier;
  }
}
