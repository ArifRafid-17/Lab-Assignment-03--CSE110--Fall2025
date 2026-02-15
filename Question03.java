import java.util.Scanner;
public class Question03{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Energy(E):");
    int E = sc.nextInt();
    System.out.print("Number of River(N):");
    int N = sc.nextInt();
    int D;
    int river1 = 1;
    while(river1 <= N){
      System.out.print("Enter River Distance D" + river1 + ":");
      D = sc.nextInt();
      int loss;
      if(D > 5){
       loss = D / 2;
      } 
      else {
        loss =E-2;
      }
      E-=loss;
      
      if(E <= 0){
        break;
      }
      river1=river1+1;
    }
    if(E  > 0){
      System.out.println("All done");
      System.out.println(E  + " energy Left");
    } 
    else {
      System.out.println("Tired at River " + river1);
    }
  }
}
