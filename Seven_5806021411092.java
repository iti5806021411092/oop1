import java.util.Scanner;
public class seven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		int a,b,c,d,e,f,g,h,i;
		System.out.print("����е�Ƿ�� 1 : ");
		a = sc.nextInt();
		System.out.print("����е�Ƿ�� 2 : ");
		b = sc.nextInt();
		System.out.print("����е�Ƿ�� 3 : ");
		c = sc.nextInt();
		System.out.print("����е�Ƿ�� 4 : ");
		d = sc.nextInt();
		System.out.print("����е�Ƿ�� 5 : ");
		e = sc.nextInt();
		System.out.print("����е�Ƿ�� 6 : ");
		f = sc.nextInt();
		System.out.print("����е�Ƿ�� 7 : ");
		g = sc.nextInt();
		System.out.print("����е�Ƿ�� 8 : ");
		h = sc.nextInt();
		System.out.print("����е�Ƿ�� 9 : ");
		i = sc.nextInt();
		
		sc.close();
		
		if(a+b+c+d+e+f+h == 100){
			System.out.println("������"+a+" "+b+" "+c+" "+d+" "+e+" "+f+" "+h);
		}
		else if(a+b+c+d+e+h+g == 100){
			System.out.println("������"+a+" "+b+" "+c+" "+d+" "+e+" "+h+" "+g);
		}
		else if(a+b+c+d+h+f+g == 100){
			System.out.println("������"+a+" "+b+" "+c+" "+d+" "+h+" "+f+" "+g);
		}
		else if(a+b+c+h+e+f+g == 100){
			System.out.println("������"+a+" "+b+" "+c+" "+h+" "+e+" "+f+" "+g);
		}
		else if(a+b+h+d+e+f+g == 100){
			System.out.println("������"+a+" "+b+" "+h+" "+d+" "+e+" "+f+" "+g);
		}
		else if(a+h+c+d+e+f+g == 100){
			System.out.println("������"+a+" "+h+" "+c+" "+d+" "+e+" "+f+" "+g);
		}
		else if(h+b+c+d+e+f+g == 100){
			System.out.println("������"+h+" "+b+" "+c+" "+d+" "+e+" "+f+" "+g);
		}
		else if(i+b+c+d+e+f+g == 100){
			System.out.println("������"+i+" "+b+" "+c+" "+d+" "+e+" "+f+" "+g);
		}
		else if(a+i+c+d+e+f+g == 100){
			System.out.println("������"+a+" "+i+" "+c+" "+d+" "+e+" "+f+" "+g);
		}
		else if(a+b+i+d+e+f+g == 100){
			System.out.println("������"+a+" "+b+" "+i+" "+d+" "+e+" "+f+" "+g);
		}
		else if(a+b+c+i+e+f+g == 100){
			System.out.println("������"+a+" "+b+" "+c+" "+i+" "+e+" "+f+" "+g);
		}
		else if(a+b+c+d+i+f+g == 100){
			System.out.println("������"+a+" "+b+" "+c+" "+d+" "+i+" "+f+" "+g);
		}
		else if(a+b+c+d+e+i+g == 100){
			System.out.println("������"+a+" "+b+" "+c+" "+d+" "+e+" "+i+" "+g);
		}
		else if(a+b+c+d+e+f+i == 100){
			System.out.println("������"+a+" "+b+" "+c+" "+d+" "+e+" "+f+" "+i);
		}
		else if(a+b+c+d+e+h+i == 100){
			System.out.println("������"+a+" "+b+" "+c+" "+d+" "+e+" "+h+" "+i);
		}
		else if(a+b+c+d+h+i+g == 100){
			System.out.println("������"+a+" "+b+" "+c+" "+d+" "+h+" "+i+" "+g);
		}
		else if(a+b+h+i+e+f+g == 100){
			System.out.println("������"+a+" "+b+" "+h+" "+i+" "+e+" "+f+" "+g);
		}
		else if(a+h+i+d+e+f+g == 100){
			System.out.println("������"+a+" "+h+" "+i+" "+d+" "+e+" "+f+" "+g);
		}
		else if(h+i+c+d+e+f+g == 100){
			System.out.println("������"+h+" "+i+" "+c+" "+d+" "+e+" "+f+" "+g);
		}
		else if(h+b+i+d+e+f+g == 100){
			System.out.println("������"+h+" "+b+" "+i+" "+d+" "+e+" "+f+" "+g);
		}
		else if(a+h+c+i+e+f+g == 100){
			System.out.println("������"+a+" "+h+" "+c+" "+i+" "+e+" "+f+" "+g);
		}
		else if(a+b+h+d+i+f+g == 100){
			System.out.println("������"+a+" "+b+" "+h+" "+d+" "+i+" "+f+" "+g);
		}
		else if(a+b+c+h+e+i+g == 100){
			System.out.println("������"+a+" "+b+" "+c+" "+h+" "+e+" "+i+" "+g);
		}
		else if(a+b+c+d+h+f+i == 100){
			System.out.println("������"+a+" "+b+" "+c+" "+d+" "+h+" "+f+" "+i);
		}
		else if(a+b+c+h+e+f+i == 100){
			System.out.println("������"+a+" "+b+" "+c+" "+h+" "+e+" "+f+" "+i);
		}
		else if(a+b+h+d+e+i+g == 100){
			System.out.println("������"+a+" "+b+" "+h+" "+d+" "+e+" "+i+" "+g);
		}
		else if(a+h+c+d+i+f+g == 100){
			System.out.println("������"+a+" "+h+" "+c+" "+d+" "+i+" "+f+" "+g);
		}
		else if(h+b+c+i+e+f+g == 100){
			System.out.println("������"+h+" "+b+" "+c+" "+i+" "+e+" "+f+" "+g);
		}
		else if(h+b+c+d+i+f+g == 100){
			System.out.println("������"+h+" "+b+" "+c+" "+d+" "+i+" "+f+" "+g);
		}
		else if(a+h+c+d+e+i+g == 100){
			System.out.println("������"+a+" "+h+" "+c+" "+d+" "+e+" "+i+" "+g);
		}
		else if(a+b+h+d+e+f+i == 100){
			System.out.println("������"+a+" "+b+" "+h+" "+d+" "+e+" "+f+" "+i);
		}
		else if(a+h+c+d+e+f+i == 100){
			System.out.println("������ "+a+" "+h+" "+c+" "+d+" "+e+" "+f+" "+i);
		}
		else if(h+b+c+d+e+i+g == 100){
			System.out.println("������ "+h+" "+b+" "+c+" "+d+" "+e+" "+i+" "+g);
		}
		else if(h+b+c+d+e+f+i == 100){
			System.out.println("������ "+h+" "+b+" "+c+" "+d+" "+e+" "+f+" "+i);
		}
		else if(a+h+i+d+e+f+g == 100){
			System.out.println("������  "+a+" "+h+" "+i+" "+d+" "+e+" "+f+" "+g);
		}
		else if(a+b+h+i+e+f+g == 100){
			System.out.println("������  "+a+" "+b+" "+h+" "+i+" "+e+" "+f+" "+g);
		}
		else {System.out.println("����� 7 ��Ǩ�ԧ���");}
	}

}
