class fiveAndEleven{
  public static void main(String... args){
      int num=Integer.valueOf(args[0]);
      if(num%5==0 && num%11==0)
          System.out.println("divisible by 5 and 11");
      else
          System.out.println("not divisible by 5 and 11");
  }
}
