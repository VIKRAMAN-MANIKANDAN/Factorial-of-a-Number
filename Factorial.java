package factorial;
import java.util.Scanner;
public class Factorial {
 public static void main(String args[])
 {
	 Scanner sc=new Scanner(System.in);
	 int n=sc.nextInt();
	 int val=1;
	 for(int i=2;i<=n;i++) val=val*i;
	 System.out.print(val);
 }
}
