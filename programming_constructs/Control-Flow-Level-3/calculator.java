import java.util.Scanner;
class calculator{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first");
		double first=sc.nextInt();
		System.out.println("enter second");
		double second=sc.nextInt();
		System.out.println("enter operator:(+,-,*,/)");
		char op=sc.next().charAt(0);
		switch(op){
			case '+':
			System.out.println("result"+(first+second));
			break;
			case'-':
			System.out.println("result"+(first-second));
			break;
			case'*':
			System.out.println("result"+(first*second));
			break;
			case'/':
			if(second!=0)
			System.out.println("result"+(first/second));
		    else
				System.out.println("cannot devide by zero");
			break;
			default:
			System.out.println("invalid operator");
		}
	}
}
				
		
			