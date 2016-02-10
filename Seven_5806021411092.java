import java.util.Scanner;
public class seven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		int a,b,c,d,e,f,g,h,i;
		System.out.print("คนแคระตัวที่ 1 : ");
		a = sc.nextInt();
		System.out.print("คนแคระตัวที่ 2 : ");
		b = sc.nextInt();
		System.out.print("คนแคระตัวที่ 3 : ");
		c = sc.nextInt();
		System.out.print("คนแคระตัวที่ 4 : ");
		d = sc.nextInt();
		System.out.print("คนแคระตัวที่ 5 : ");
		e = sc.nextInt();
		System.out.print("คนแคระตัวที่ 6 : ");
		f = sc.nextInt();
		System.out.print("คนแคระตัวที่ 7 : ");
		g = sc.nextInt();
		System.out.print("คนแคระตัวที่ 8 : ");
		h = sc.nextInt();
		System.out.print("คนแคระตัวที่ 9 : ");
		i = sc.nextInt();
		
		sc.close();
		
		if(a+b+c+d+e+f+h == 100){
			System.out.println("เจอแล้ว"+a+" "+b+" "+c+" "+d+" "+e+" "+f+" "+h);
		}
		else if(a+b+c+d+e+h+g == 100){
			System.out.println("เจอแล้ว"+a+" "+b+" "+c+" "+d+" "+e+" "+h+" "+g);
		}
		else if(a+b+c+d+h+f+g == 100){
			System.out.println("เจอแล้ว"+a+" "+b+" "+c+" "+d+" "+h+" "+f+" "+g);
		}
		else if(a+b+c+h+e+f+g == 100){
			System.out.println("เจอแล้ว"+a+" "+b+" "+c+" "+h+" "+e+" "+f+" "+g);
		}
		else if(a+b+h+d+e+f+g == 100){
			System.out.println("เจอแล้ว"+a+" "+b+" "+h+" "+d+" "+e+" "+f+" "+g);
		}
		else if(a+h+c+d+e+f+g == 100){
			System.out.println("เจอแล้ว"+a+" "+h+" "+c+" "+d+" "+e+" "+f+" "+g);
		}
		else if(h+b+c+d+e+f+g == 100){
			System.out.println("เจอแล้ว"+h+" "+b+" "+c+" "+d+" "+e+" "+f+" "+g);
		}
		else if(i+b+c+d+e+f+g == 100){
			System.out.println("เจอแล้ว"+i+" "+b+" "+c+" "+d+" "+e+" "+f+" "+g);
		}
		else if(a+i+c+d+e+f+g == 100){
			System.out.println("เจอแล้ว"+a+" "+i+" "+c+" "+d+" "+e+" "+f+" "+g);
		}
		else if(a+b+i+d+e+f+g == 100){
			System.out.println("เจอแล้ว"+a+" "+b+" "+i+" "+d+" "+e+" "+f+" "+g);
		}
		else if(a+b+c+i+e+f+g == 100){
			System.out.println("เจอแล้ว"+a+" "+b+" "+c+" "+i+" "+e+" "+f+" "+g);
		}
		else if(a+b+c+d+i+f+g == 100){
			System.out.println("เจอแล้ว"+a+" "+b+" "+c+" "+d+" "+i+" "+f+" "+g);
		}
		else if(a+b+c+d+e+i+g == 100){
			System.out.println("เจอแล้ว"+a+" "+b+" "+c+" "+d+" "+e+" "+i+" "+g);
		}
		else if(a+b+c+d+e+f+i == 100){
			System.out.println("เจอแล้ว"+a+" "+b+" "+c+" "+d+" "+e+" "+f+" "+i);
		}
		else if(a+b+c+d+e+h+i == 100){
			System.out.println("เจอแล้ว"+a+" "+b+" "+c+" "+d+" "+e+" "+h+" "+i);
		}
		else if(a+b+c+d+h+i+g == 100){
			System.out.println("เจอแล้ว"+a+" "+b+" "+c+" "+d+" "+h+" "+i+" "+g);
		}
		else if(a+b+h+i+e+f+g == 100){
			System.out.println("เจอแล้ว"+a+" "+b+" "+h+" "+i+" "+e+" "+f+" "+g);
		}
		else if(a+h+i+d+e+f+g == 100){
			System.out.println("เจอแล้ว"+a+" "+h+" "+i+" "+d+" "+e+" "+f+" "+g);
		}
		else if(h+i+c+d+e+f+g == 100){
			System.out.println("เจอแล้ว"+h+" "+i+" "+c+" "+d+" "+e+" "+f+" "+g);
		}
		else if(h+b+i+d+e+f+g == 100){
			System.out.println("เจอแล้ว"+h+" "+b+" "+i+" "+d+" "+e+" "+f+" "+g);
		}
		else if(a+h+c+i+e+f+g == 100){
			System.out.println("เจอแล้ว"+a+" "+h+" "+c+" "+i+" "+e+" "+f+" "+g);
		}
		else if(a+b+h+d+i+f+g == 100){
			System.out.println("เจอแล้ว"+a+" "+b+" "+h+" "+d+" "+i+" "+f+" "+g);
		}
		else if(a+b+c+h+e+i+g == 100){
			System.out.println("เจอแล้ว"+a+" "+b+" "+c+" "+h+" "+e+" "+i+" "+g);
		}
		else if(a+b+c+d+h+f+i == 100){
			System.out.println("เจอแล้ว"+a+" "+b+" "+c+" "+d+" "+h+" "+f+" "+i);
		}
		else if(a+b+c+h+e+f+i == 100){
			System.out.println("เจอแล้ว"+a+" "+b+" "+c+" "+h+" "+e+" "+f+" "+i);
		}
		else if(a+b+h+d+e+i+g == 100){
			System.out.println("เจอแล้ว"+a+" "+b+" "+h+" "+d+" "+e+" "+i+" "+g);
		}
		else if(a+h+c+d+i+f+g == 100){
			System.out.println("เจอแล้ว"+a+" "+h+" "+c+" "+d+" "+i+" "+f+" "+g);
		}
		else if(h+b+c+i+e+f+g == 100){
			System.out.println("เจอแล้ว"+h+" "+b+" "+c+" "+i+" "+e+" "+f+" "+g);
		}
		else if(h+b+c+d+i+f+g == 100){
			System.out.println("เจอแล้ว"+h+" "+b+" "+c+" "+d+" "+i+" "+f+" "+g);
		}
		else if(a+h+c+d+e+i+g == 100){
			System.out.println("เจอแล้ว"+a+" "+h+" "+c+" "+d+" "+e+" "+i+" "+g);
		}
		else if(a+b+h+d+e+f+i == 100){
			System.out.println("เจอแล้ว"+a+" "+b+" "+h+" "+d+" "+e+" "+f+" "+i);
		}
		else if(a+h+c+d+e+f+i == 100){
			System.out.println("เจอแล้ว "+a+" "+h+" "+c+" "+d+" "+e+" "+f+" "+i);
		}
		else if(h+b+c+d+e+i+g == 100){
			System.out.println("เจอแล้ว "+h+" "+b+" "+c+" "+d+" "+e+" "+i+" "+g);
		}
		else if(h+b+c+d+e+f+i == 100){
			System.out.println("เจอแล้ว "+h+" "+b+" "+c+" "+d+" "+e+" "+f+" "+i);
		}
		else if(a+h+i+d+e+f+g == 100){
			System.out.println("เจอแล้ว  "+a+" "+h+" "+i+" "+d+" "+e+" "+f+" "+g);
		}
		else if(a+b+h+i+e+f+g == 100){
			System.out.println("เจอแล้ว  "+a+" "+b+" "+h+" "+i+" "+e+" "+f+" "+g);
		}
		else {System.out.println("ไม่เจอ 7 ตัวจริงเลย");}
	}

}
