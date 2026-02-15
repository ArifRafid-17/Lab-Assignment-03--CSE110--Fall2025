import java.util.Scanner;
public class Question08{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter an integer:");
    int Count = sc.nextInt();
    int noneg = 0;
    int negative = 0;
    for(int i = 0; i < Count; i++){
      System.out.print("Enter number:");
      int current = sc.nextInt();
      if(current < 0){
        negative++;
      } else {
        noneg ++;
      }
    }
    System.out.println(noneg  + " Non-negative Numbers");
    System.out.println(negative + " Negative Numbers");
  }
}
