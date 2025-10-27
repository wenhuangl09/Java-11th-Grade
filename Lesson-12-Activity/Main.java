class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
   
  }
  string creditCardType(String cardnum){
    if(cardnum.substring(0,1).equals("4")){
  return "Visa";
    }
  else if(cardnum.substring(0,2).equals("34")||cardnum.substring(0,2).equals("37")){
    return "American Express";
  }
  else if(cardnum.substring(0,3).equals("36")){
    return "Diner Club";
  }
  else if(cardnum.substring(0,4).equals("51")||cardnum.substring(0,4).equals("55")){
    return "Mastercard";
  }
  else if(cardnum.substring(0,5).equals("6011")||cardnum.substring(0,5).equals("65")){
    return "Discovery";
  }
}

  
  
}