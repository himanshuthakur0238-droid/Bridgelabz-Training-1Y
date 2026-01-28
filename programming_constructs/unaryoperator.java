import java.util.Scanner;
class unaryoperator{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value of a:");
		int a=sc.nextInt();
		int b=a++;
		int c=++a;
		int d=--a;
		int e=a--;
		System.out.println("value of b"+b);
		System.out.println("value of c"+c);
		System.out.println("value of d"+d);
		System.out.println("value of e"+e);
	}
}
		