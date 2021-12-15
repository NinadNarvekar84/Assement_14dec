import java.util.Scanner;

public class swapNumber{
	
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter 1st no:");
	int a=sc.nextInt();
	System.out.print("Enter 2nd no:");
	int b=sc.nextInt();
	System.out.println("Before Swaping: a="+a+" b="+b);
	int temp=a;
	a=b;
	b=temp;
	System.out.println("After Swaping: a="+a+" b="+b);
	}
}

