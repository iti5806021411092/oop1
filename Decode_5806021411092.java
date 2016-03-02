import java.util.Scanner;

public class Decode {
	
public static void main(String[] args) {
		
		String s1,s2;
		char c;
				
		Scanner sc = new Scanner(System.in);
		System.out.print("Input String : ");
		s1 = sc.nextLine();
		s2 = s1.toUpperCase();
		sc.close();
		
		for(int i=s2.length()-1;i>=0;i--)
		{
			c=s2.charAt(i);
			
			if(c=='E'){
				c='R';
			}
			else if(c=='R'){
				c='W';
			}
			else if(c=='W'){
				c='E';
			}
			System.out.print(c);
		}
	}
}