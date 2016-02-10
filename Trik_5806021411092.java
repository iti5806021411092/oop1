package trik;
import java.util.Scanner;
public class Trik {

	public static void main(String[] args) {
		int r=1,c=0,l=0;
		int lap=0;
		String text = null;
		char Char;
		Scanner sc =  new Scanner(System.in);
		
		do{
			System.out.print("Enter Value 50 character (A or B or C) : "); 
			text=sc.next();
			sc.close();
		}while(text.length() > 50 || text.length() < 1 || text.length() == 0);
		
		for(int i=0;i<text.length();i++){
			
			Char=text.charAt(i);
			
			if(Char=='A'|| Char=='a'){
				lap=r;
				r=c;
				c=lap;
			}
			
			if(Char=='B'|| Char=='b'){
				lap=c;
				c=l;
				l=lap;
			}
			
			if(Char=='C'|| Char=='c'){
				lap=r;
				r=l;
				l=lap;
			}
		}
		
		if(r==1)System.out.println("glass 1");
		
		if(c==1)System.out.println("glass 2");
		
		if(l==1)System.out.println("glass 3");
	 }

	}


