class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }

  void init(){

        
  }

    /*
      Problem 1:      
      Write a function groupSavings that takes number of tickets wanting 
      to purchase. Return the total cost by apply the following discount:
      1 to 8 tickets  : each ticket cost $11,
      9 to 16 tickets : each ticket cost $10.50
      over 16 tickts  : each ticket cost $8.50
    */
    double groupSavings(int numtickets){
      double totalCost = 0.0;
      if(numtickets >= 1.0 && numtickets <=8.0){
        return totalCost = numtickets * 11.0;
      }
      else if(numtickets >= 9 && numtickets <= 16){
        return totalCost = numtickets * 10.5;
      }
      else{
        return totalCost = numtickets * 8.5;
      }
    }

  
  /*
      Write a function groceryDiscount that takes the total amount spent at 
      a grocery store and the number of cans of beans purchased.
      Depending on the total amount and number of can of
      beans purchase, you get a savings on their total bill.
      Return the savings amount:
        Spent $100 to $200 and purchase at least 3 cans of 
        beans: $10 savings
        Spent over $200 and purchase more than 4 cans 
        of beans: $25 savings
        Otherwise: $0 savings.
    */
    double groceryDiscount(double total, double numCans){
      double savings = 0.0;
      if(total >= 100 && total <= 200 && numCans >= 3){
        return savings = 10.0;
      }
      else if(total > 200 && numCans > 4){
        return savings = 0.25;
      }
      else{
        return savings = 0.0;
      }
    }


}