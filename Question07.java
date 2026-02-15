public class Question07{
  public static void main(String[] args){
    int num = 0;
    int sum = 0;
    while(num <= 600){
      if(num % 7 == 0 && num % 9 != 0){
        sum += num;
      } else if(num % 9 == 0 && num % 7 != 0){
        sum += num;
      }
      num++;
    }
    System.out.print(sum);
  }
}
