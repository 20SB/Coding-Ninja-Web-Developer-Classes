package Lec2;
import java.util.*;
public class Average_Marks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str = s.next();
		char name = str.charAt(0);
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		int avg=(a+b+c)/3;
		System.out.println(name);
		System.out.print(avg);

	}

}
