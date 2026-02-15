import java.util.Scanner;
public class Question02{
  public static void main(String [] args){
  Scanner sc = new Scanner(System.in);
  System.out.print("Please Enter number of Herbs (H): ");
  int H =sc.nextInt();
  
  System.out.print("Please Enter number of Crystals (C): ");
  int C = sc.nextInt();
  int count=0;
  while (H>=3 && C>=2){
   int F = H-3;
   int G = C-2;
   count=count+1;
   System.out.println("Portion-"+count+ " created");
   System.out.println("Remaining Herbs: "+F+", "+"Remaining Crystals: "+G);
   H=F;
   C=G;
  }
    System.out.println("Portion Created: "+count);
  if(count%2==0){
  System.out.println("Stable Brew");
  }
  else{
  System.out.println("Volatile Brew");
  }
 }
}
