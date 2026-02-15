import java.util.Scanner;
public class Question05{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the N-digit vault code:");
    int vc = sc.nextInt();
    int tc = vc;
    int Count = 0;
    while(tc != 0){
      Count++;
      tc /= 10;
    }
  
    int remainder = 10;
    for(int i = 1; i <Count - 1; i++){
      remainder *= 10;
    }
    
    int L = vc/ remainder;
    int R= vc % remainder;
    System.out.print("''" + L + "... ");
    while(remainder != 1){
      remainder /= 10;
      L = R / remainder;
      R %= remainder;
      System.out.print(L + "... ");
    }
    if(Count >= 1){
      System.out.print("''");
    }
  }
}
