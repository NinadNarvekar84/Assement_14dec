import java.util.*;

public class Letters {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a Character:");
		char a=sc.next().charAt(0);
		if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u'||a=='A'||a=='E'||a=='I'||a=='O'||a=='U')
			System.out.println(a+" is a Vowel");
		else
			System.out.println(a+" is a Consonant");
	sc.close();
	}
}
